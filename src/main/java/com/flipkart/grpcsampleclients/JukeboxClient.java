package com.flipkart.grpcsampleclients;


import com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest;
import com.flipkarthealthplus.marketplace.jukeboxservice.JukeboxServiceGrpc;
import com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse;
import com.flipkarthealthplus.marketplace.jukeboxservice.Song;
import com.google.protobuf.Empty;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class JukeboxClient {
    private final JukeboxServiceGrpc.JukeboxServiceBlockingStub blockingStub;
    private final JukeboxServiceGrpc.JukeboxServiceStub asyncStub;

    /** Construct client for accessing RouteGuide server using the existing channel. */
    public JukeboxClient(Channel channel) {
        blockingStub = JukeboxServiceGrpc.newBlockingStub(channel);
        asyncStub = JukeboxServiceGrpc.newStub(channel);
    }

    public Song getSongBlocking(int id) {
        try {
            GetSongRequest
                    songRequest =
                    GetSongRequest.newBuilder().setSong(Song.newBuilder().setId(id).build()).build();
            Song mySong = blockingStub.getSong(songRequest);
            System.out.println("found my song: " + mySong.toString());
            return mySong;
        } catch (StatusRuntimeException s) {
            System.out.println("got error: " + s.getStatus());
        }
        return null;
    }

    public List<Song> getAllSongsAsync() {

        List<Song> songList = new ArrayList<>();
        StreamObserver<ListSongsResponse> responseObserver = new StreamObserver<ListSongsResponse>() {

            @Override
            public void onNext(ListSongsResponse value) {
                songList.addAll(value.getSongsList());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("error! " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("fetched all songs! \uD83C\uDFB6");
            }
        };

        asyncStub.listSongs(Empty.newBuilder().build(), responseObserver);
        System.out.println("found all my songs: " + songList.toString());
        return songList;
    }

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("0.0.0.0:8090/").usePlaintext().build();
        JukeboxClient client = new JukeboxClient(channel);

        System.out.println("--");
        Song songError = client.getSongBlocking(5);
        System.out.println("--");
        Song songSuccess = client.getSongBlocking(1);
        System.out.println("--");
        List<Song> allSongs = client.getAllSongsAsync();
        System.out.println("--");

        channel.shutdownNow().awaitTermination(5000, TimeUnit.MILLISECONDS);
    }
}
