// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jukebox.proto

package com.flipkarthealthplus.marketplace.jukeboxservice;

public interface ListSongsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.flipkarthealthplus.marketplace.jukeboxservice.ListSongsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song songs = 1;</code>
   */
  java.util.List<com.flipkarthealthplus.marketplace.jukeboxservice.Song> 
      getSongsList();
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song songs = 1;</code>
   */
  com.flipkarthealthplus.marketplace.jukeboxservice.Song getSongs(int index);
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song songs = 1;</code>
   */
  int getSongsCount();
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song songs = 1;</code>
   */
  java.util.List<? extends com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder> 
      getSongsOrBuilderList();
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song songs = 1;</code>
   */
  com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder getSongsOrBuilder(
      int index);
}