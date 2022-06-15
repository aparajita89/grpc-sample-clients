package com.flipkarthealthplus.marketplace.jukeboxservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.1)",
    comments = "Source: jukebox.proto")
public final class JukeboxServiceGrpc {

  private JukeboxServiceGrpc() {}

  public static final String SERVICE_NAME = "com.flipkarthealthplus.marketplace.jukeboxservice.JukeboxService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest,
      com.flipkarthealthplus.marketplace.jukeboxservice.Song> getGetSongMethod;

  public static io.grpc.MethodDescriptor<com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest,
      com.flipkarthealthplus.marketplace.jukeboxservice.Song> getGetSongMethod() {
    io.grpc.MethodDescriptor<com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest, com.flipkarthealthplus.marketplace.jukeboxservice.Song> getGetSongMethod;
    if ((getGetSongMethod = JukeboxServiceGrpc.getGetSongMethod) == null) {
      synchronized (JukeboxServiceGrpc.class) {
        if ((getGetSongMethod = JukeboxServiceGrpc.getGetSongMethod) == null) {
          JukeboxServiceGrpc.getGetSongMethod = getGetSongMethod = 
              io.grpc.MethodDescriptor.<com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest, com.flipkarthealthplus.marketplace.jukeboxservice.Song>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.flipkarthealthplus.marketplace.jukeboxservice.JukeboxService", "GetSong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flipkarthealthplus.marketplace.jukeboxservice.Song.getDefaultInstance()))
                  .setSchemaDescriptor(new JukeboxServiceMethodDescriptorSupplier("GetSong"))
                  .build();
          }
        }
     }
     return getGetSongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse> getListSongsMethod;

  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse> getListSongsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse> getListSongsMethod;
    if ((getListSongsMethod = JukeboxServiceGrpc.getListSongsMethod) == null) {
      synchronized (JukeboxServiceGrpc.class) {
        if ((getListSongsMethod = JukeboxServiceGrpc.getListSongsMethod) == null) {
          JukeboxServiceGrpc.getListSongsMethod = getListSongsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.flipkarthealthplus.marketplace.jukeboxservice.JukeboxService", "ListSongs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new JukeboxServiceMethodDescriptorSupplier("ListSongs"))
                  .build();
          }
        }
     }
     return getListSongsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest,
      com.flipkarthealthplus.marketplace.jukeboxservice.Song> getAddSongMethod;

  public static io.grpc.MethodDescriptor<com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest,
      com.flipkarthealthplus.marketplace.jukeboxservice.Song> getAddSongMethod() {
    io.grpc.MethodDescriptor<com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest, com.flipkarthealthplus.marketplace.jukeboxservice.Song> getAddSongMethod;
    if ((getAddSongMethod = JukeboxServiceGrpc.getAddSongMethod) == null) {
      synchronized (JukeboxServiceGrpc.class) {
        if ((getAddSongMethod = JukeboxServiceGrpc.getAddSongMethod) == null) {
          JukeboxServiceGrpc.getAddSongMethod = getAddSongMethod = 
              io.grpc.MethodDescriptor.<com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest, com.flipkarthealthplus.marketplace.jukeboxservice.Song>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.flipkarthealthplus.marketplace.jukeboxservice.JukeboxService", "AddSong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.flipkarthealthplus.marketplace.jukeboxservice.Song.getDefaultInstance()))
                  .setSchemaDescriptor(new JukeboxServiceMethodDescriptorSupplier("AddSong"))
                  .build();
          }
        }
     }
     return getAddSongMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JukeboxServiceStub newStub(io.grpc.Channel channel) {
    return new JukeboxServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JukeboxServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JukeboxServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JukeboxServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JukeboxServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class JukeboxServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *        option (google.api.http) = {get: "/v1/songs/{song}"};
     * </pre>
     */
    public void getSong(com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest request,
        io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.Song> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSongMethod(), responseObserver);
    }

    /**
     * <pre>
     *    option (google.api.http) = {get: "/v1/albums/{album}/songs"};
     * </pre>
     */
    public void listSongs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSongsMethod(), responseObserver);
    }

    /**
     */
    public void addSong(com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest request,
        io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.Song> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSongMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest,
                com.flipkarthealthplus.marketplace.jukeboxservice.Song>(
                  this, METHODID_GET_SONG)))
          .addMethod(
            getListSongsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse>(
                  this, METHODID_LIST_SONGS)))
          .addMethod(
            getAddSongMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest,
                com.flipkarthealthplus.marketplace.jukeboxservice.Song>(
                  this, METHODID_ADD_SONG)))
          .build();
    }
  }

  /**
   */
  public static final class JukeboxServiceStub extends io.grpc.stub.AbstractStub<JukeboxServiceStub> {
    private JukeboxServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JukeboxServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JukeboxServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JukeboxServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *        option (google.api.http) = {get: "/v1/songs/{song}"};
     * </pre>
     */
    public void getSong(com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest request,
        io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.Song> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *    option (google.api.http) = {get: "/v1/albums/{album}/songs"};
     * </pre>
     */
    public void listSongs(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSongsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSong(com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest request,
        io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.Song> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSongMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JukeboxServiceBlockingStub extends io.grpc.stub.AbstractStub<JukeboxServiceBlockingStub> {
    private JukeboxServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JukeboxServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JukeboxServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JukeboxServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *        option (google.api.http) = {get: "/v1/songs/{song}"};
     * </pre>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song getSong(com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSongMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *    option (google.api.http) = {get: "/v1/albums/{album}/songs"};
     * </pre>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse listSongs(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListSongsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song addSong(com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddSongMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JukeboxServiceFutureStub extends io.grpc.stub.AbstractStub<JukeboxServiceFutureStub> {
    private JukeboxServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JukeboxServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JukeboxServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JukeboxServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *        option (google.api.http) = {get: "/v1/songs/{song}"};
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.flipkarthealthplus.marketplace.jukeboxservice.Song> getSong(
        com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSongMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *    option (google.api.http) = {get: "/v1/albums/{album}/songs"};
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse> listSongs(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListSongsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.flipkarthealthplus.marketplace.jukeboxservice.Song> addSong(
        com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSongMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SONG = 0;
  private static final int METHODID_LIST_SONGS = 1;
  private static final int METHODID_ADD_SONG = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JukeboxServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JukeboxServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SONG:
          serviceImpl.getSong((com.flipkarthealthplus.marketplace.jukeboxservice.GetSongRequest) request,
              (io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.Song>) responseObserver);
          break;
        case METHODID_LIST_SONGS:
          serviceImpl.listSongs((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse>) responseObserver);
          break;
        case METHODID_ADD_SONG:
          serviceImpl.addSong((com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest) request,
              (io.grpc.stub.StreamObserver<com.flipkarthealthplus.marketplace.jukeboxservice.Song>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JukeboxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JukeboxServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JukeboxService");
    }
  }

  private static final class JukeboxServiceFileDescriptorSupplier
      extends JukeboxServiceBaseDescriptorSupplier {
    JukeboxServiceFileDescriptorSupplier() {}
  }

  private static final class JukeboxServiceMethodDescriptorSupplier
      extends JukeboxServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JukeboxServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JukeboxServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JukeboxServiceFileDescriptorSupplier())
              .addMethod(getGetSongMethod())
              .addMethod(getListSongsMethod())
              .addMethod(getAddSongMethod())
              .build();
        }
      }
    }
    return result;
  }
}
