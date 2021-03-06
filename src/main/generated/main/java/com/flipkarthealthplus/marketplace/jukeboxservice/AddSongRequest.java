// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jukebox.proto

package com.flipkarthealthplus.marketplace.jukeboxservice;

/**
 * Protobuf type {@code com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest}
 */
public  final class AddSongRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest)
    AddSongRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddSongRequest.newBuilder() to construct.
  private AddSongRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddSongRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddSongRequest(
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
            com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder subBuilder = null;
            if (song_ != null) {
              subBuilder = song_.toBuilder();
            }
            song_ = input.readMessage(com.flipkarthealthplus.marketplace.jukeboxservice.Song.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(song_);
              song_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_AddSongRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_AddSongRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.class, com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.Builder.class);
  }

  public static final int SONG_FIELD_NUMBER = 1;
  private com.flipkarthealthplus.marketplace.jukeboxservice.Song song_;
  /**
   * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public boolean hasSong() {
    return song_ != null;
  }
  /**
   * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public com.flipkarthealthplus.marketplace.jukeboxservice.Song getSong() {
    return song_ == null ? com.flipkarthealthplus.marketplace.jukeboxservice.Song.getDefaultInstance() : song_;
  }
  /**
   * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
   */
  public com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder getSongOrBuilder() {
    return getSong();
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
    if (song_ != null) {
      output.writeMessage(1, getSong());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (song_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSong());
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
    if (!(obj instanceof com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest)) {
      return super.equals(obj);
    }
    com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest other = (com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest) obj;

    boolean result = true;
    result = result && (hasSong() == other.hasSong());
    if (hasSong()) {
      result = result && getSong()
          .equals(other.getSong());
    }
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
    if (hasSong()) {
      hash = (37 * hash) + SONG_FIELD_NUMBER;
      hash = (53 * hash) + getSong().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parseFrom(
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
  public static Builder newBuilder(com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest prototype) {
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
   * Protobuf type {@code com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest)
      com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_AddSongRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_AddSongRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.class, com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.Builder.class);
    }

    // Construct using com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      if (songBuilder_ == null) {
        song_ = null;
      } else {
        song_ = null;
        songBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.Jukebox.internal_static_com_flipkarthealthplus_marketplace_jukeboxservice_AddSongRequest_descriptor;
    }

    public com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest getDefaultInstanceForType() {
      return com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.getDefaultInstance();
    }

    public com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest build() {
      com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest buildPartial() {
      com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest result = new com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest(this);
      if (songBuilder_ == null) {
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
      if (other instanceof com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest) {
        return mergeFrom((com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest other) {
      if (other == com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest.getDefaultInstance()) return this;
      if (other.hasSong()) {
        mergeSong(other.getSong());
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
      com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.flipkarthealthplus.marketplace.jukeboxservice.Song song_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.flipkarthealthplus.marketplace.jukeboxservice.Song, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder, com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder> songBuilder_;
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public boolean hasSong() {
      return songBuilder_ != null || song_ != null;
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song getSong() {
      if (songBuilder_ == null) {
        return song_ == null ? com.flipkarthealthplus.marketplace.jukeboxservice.Song.getDefaultInstance() : song_;
      } else {
        return songBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder setSong(com.flipkarthealthplus.marketplace.jukeboxservice.Song value) {
      if (songBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        song_ = value;
        onChanged();
      } else {
        songBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder setSong(
        com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder builderForValue) {
      if (songBuilder_ == null) {
        song_ = builderForValue.build();
        onChanged();
      } else {
        songBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder mergeSong(com.flipkarthealthplus.marketplace.jukeboxservice.Song value) {
      if (songBuilder_ == null) {
        if (song_ != null) {
          song_ =
            com.flipkarthealthplus.marketplace.jukeboxservice.Song.newBuilder(song_).mergeFrom(value).buildPartial();
        } else {
          song_ = value;
        }
        onChanged();
      } else {
        songBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public Builder clearSong() {
      if (songBuilder_ == null) {
        song_ = null;
        onChanged();
      } else {
        song_ = null;
        songBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder getSongBuilder() {
      
      onChanged();
      return getSongFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    public com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder getSongOrBuilder() {
      if (songBuilder_ != null) {
        return songBuilder_.getMessageOrBuilder();
      } else {
        return song_ == null ?
            com.flipkarthealthplus.marketplace.jukeboxservice.Song.getDefaultInstance() : song_;
      }
    }
    /**
     * <code>.com.flipkarthealthplus.marketplace.jukeboxservice.Song song = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.flipkarthealthplus.marketplace.jukeboxservice.Song, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder, com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder> 
        getSongFieldBuilder() {
      if (songBuilder_ == null) {
        songBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.flipkarthealthplus.marketplace.jukeboxservice.Song, com.flipkarthealthplus.marketplace.jukeboxservice.Song.Builder, com.flipkarthealthplus.marketplace.jukeboxservice.SongOrBuilder>(
                getSong(),
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


    // @@protoc_insertion_point(builder_scope:com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest)
  }

  // @@protoc_insertion_point(class_scope:com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest)
  private static final com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest();
  }

  public static com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddSongRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddSongRequest>() {
    public AddSongRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddSongRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddSongRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddSongRequest> getParserForType() {
    return PARSER;
  }

  public com.flipkarthealthplus.marketplace.jukeboxservice.AddSongRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

