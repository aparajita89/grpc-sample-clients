// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jukebox.proto

package com.flipkarthealthplus.marketplace.jukeboxservice;

/**
 * Protobuf type {@code com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase}
 */
public  final class SongDatabase extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase)
    SongDatabaseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SongDatabase.newBuilder() to construct.
  private SongDatabase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SongDatabase() {
    song_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SongDatabase(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              song_ = new java.util.ArrayList<com.flipkarthealthplus.marketplace.jukeboxservice.Song>();
              mutable_bitField0_ |= 0x00000001;
            }
            song_.add(
                input.readMessage(com.flipkarthealthplus.marketplace.jukeboxservice.Song.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        song_ = java.util.Collections.unmodifiableList(song_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_SongDatabase_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_SongDatabase_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase.class, com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase.Builder.class);
  }

  public static final int SONG_FIELD_NUMBER = 1;
  private java.util.List<com.flipkarthealthplus.marketplace.jukeboxservice.Song> song_;
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public java.util.List<com.flipkarthealthplus.marketplace.jukeboxservice.Song> getSongList() {
    return song_;
  }
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public java.util.List<? extends com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder> 
      getSongOrBuilderList() {
    return song_;
  }
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public int getSongCount() {
    return song_.size();
  }
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public com.flipkarthealthplus.marketplace.jukeboxservice.Song getSong(int index) {
    return song_.get(index);
  }
  /**
   * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder getSongOrBuilder(
      int index) {
    return song_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < song_.size(); i++) {
      output.writeMessage(1, song_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < song_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, song_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase)) {
      return super.equals(obj);
    }
    com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase other = (com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase) obj;

    boolean result = true;
    result = result && getSongList()
        .equals(other.getSongList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSongCount() > 0) {
      hash = (37 * hash) + SONG_FIELD_NUMBER;
      hash = (53 * hash) + getSongList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase)
      com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabaseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_SongDatabase_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_SongDatabase_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase.class, com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase.Builder.class);
    }

    // Construct using com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSongFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (songBuilder_ == null) {
        song_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        songBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_SongDatabase_descriptor;
    }

    public com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase getDefaultInstanceForType() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase.getDefaultInstance();
    }

    public com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase build() {
      com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase buildPartial() {
      com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase result = new com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase(this);
      int from_bitField0_ = bitField0_;
      if (songBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          song_ = java.util.Collections.unmodifiableList(song_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.song_ = song_;
      } else {
        result.song_ = songBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase) {
        return mergeFrom((com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase other) {
      if (other == com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase.getDefaultInstance()) return this;
      if (songBuilder_ == null) {
        if (!other.song_.isEmpty()) {
          if (song_.isEmpty()) {
            song_ = other.song_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSongIsMutable();
            song_.addAll(other.song_);
          }
          onChanged();
        }
      } else {
        if (!other.song_.isEmpty()) {
          if (songBuilder_.isEmpty()) {
            songBuilder_.dispose();
            songBuilder_ = null;
            song_ = other.song_;
            bitField0_ = (bitField0_ & ~0x00000001);
            songBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSongFieldBuilder() : null;
          } else {
            songBuilder_.addAllMessages(other.song_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.flipkarthealthplus.marketplace.jukeboxservice.Song> song_ =
      java.util.Collections.emptyList();
    private void ensureSongIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        song_ = new java.util.ArrayList<com.flipkarthealthplus.marketplace.jukeboxservice.Song>(song_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.flipkarthealthplus.marketplace.jukeboxservice.Song, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder, com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder> songBuilder_;

    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public java.util.List<com.flipkarthealthplus.marketplace.jukeboxservice.Song> getSongList() {
      if (songBuilder_ == null) {
        return java.util.Collections.unmodifiableList(song_);
      } else {
        return songBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public int getSongCount() {
      if (songBuilder_ == null) {
        return song_.size();
      } else {
        return songBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song getSong(int index) {
      if (songBuilder_ == null) {
        return song_.get(index);
      } else {
        return songBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder setSong(
        int index, com.flipkarthealthplus.marketplace.jukeboxservice.Song value) {
      if (songBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSongIsMutable();
        song_.set(index, value);
        onChanged();
      } else {
        songBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder setSong(
        int index, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder builderForValue) {
      if (songBuilder_ == null) {
        ensureSongIsMutable();
        song_.set(index, builderForValue.build());
        onChanged();
      } else {
        songBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder addSong(com.flipkarthealthplus.marketplace.jukeboxservice.Song value) {
      if (songBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSongIsMutable();
        song_.add(value);
        onChanged();
      } else {
        songBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder addSong(
        int index, com.flipkarthealthplus.marketplace.jukeboxservice.Song value) {
      if (songBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSongIsMutable();
        song_.add(index, value);
        onChanged();
      } else {
        songBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder addSong(
        com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder builderForValue) {
      if (songBuilder_ == null) {
        ensureSongIsMutable();
        song_.add(builderForValue.build());
        onChanged();
      } else {
        songBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder addSong(
        int index, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder builderForValue) {
      if (songBuilder_ == null) {
        ensureSongIsMutable();
        song_.add(index, builderForValue.build());
        onChanged();
      } else {
        songBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder addAllSong(
        java.lang.Iterable<? extends com.flipkarthealthplus.marketplace.jukeboxservice.Song> values) {
      if (songBuilder_ == null) {
        ensureSongIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, song_);
        onChanged();
      } else {
        songBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder clearSong() {
      if (songBuilder_ == null) {
        song_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        songBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder removeSong(int index) {
      if (songBuilder_ == null) {
        ensureSongIsMutable();
        song_.remove(index);
        onChanged();
      } else {
        songBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder getSongBuilder(
        int index) {
      return getSongFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder getSongOrBuilder(
        int index) {
      if (songBuilder_ == null) {
        return song_.get(index);  } else {
        return songBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public java.util.List<? extends com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder> 
         getSongOrBuilderList() {
      if (songBuilder_ != null) {
        return songBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(song_);
      }
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder addSongBuilder() {
      return getSongFieldBuilder().addBuilder(
          com.flipkarthealthplus.marketplace.jukeboxservice.Song.getDefaultInstance());
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder addSongBuilder(
        int index) {
      return getSongFieldBuilder().addBuilder(
          index, com.flipkarthealthplus.marketplace.jukeboxservice.Song.getDefaultInstance());
    }
    /**
     * <code>repeated .com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public java.util.List<com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder> 
         getSongBuilderList() {
      return getSongFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.flipkarthealthplus.marketplace.jukeboxservice.Song, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder, com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder> 
        getSongFieldBuilder() {
      if (songBuilder_ == null) {
        songBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.flipkarthealthplus.marketplace.jukeboxservice.Song, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder, com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder>(
                song_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        song_ = null;
      }
      return songBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase)
  }

  // @@protoc_insertion_point(class_scope:com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase)
  private static final com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase();
  }

  public static com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SongDatabase>
      PARSER = new com.google.protobuf.AbstractParser<SongDatabase>() {
    public SongDatabase parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SongDatabase(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SongDatabase> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SongDatabase> getParserForType() {
    return PARSER;
  }

  public com.flipkarthealthplus.marketplace.jukeboxservice.SongDatabase getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

