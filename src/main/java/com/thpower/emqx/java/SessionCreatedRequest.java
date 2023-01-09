// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package com.thpower.emqx.java;

/**
 * Protobuf type {@code emqx.exhook.v2.SessionCreatedRequest}
 */
public final class SessionCreatedRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:emqx.exhook.v2.SessionCreatedRequest)
    SessionCreatedRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SessionCreatedRequest.newBuilder() to construct.
  private SessionCreatedRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SessionCreatedRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SessionCreatedRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SessionCreatedRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            com.thpower.emqx.java.ClientInfo.Builder subBuilder = null;
            if (clientinfo_ != null) {
              subBuilder = clientinfo_.toBuilder();
            }
            clientinfo_ = input.readMessage(com.thpower.emqx.java.ClientInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientinfo_);
              clientinfo_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.thpower.emqx.java.RequestMeta.Builder subBuilder = null;
            if (meta_ != null) {
              subBuilder = meta_.toBuilder();
            }
            meta_ = input.readMessage(com.thpower.emqx.java.RequestMeta.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(meta_);
              meta_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return com.thpower.emqx.java.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionCreatedRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thpower.emqx.java.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionCreatedRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thpower.emqx.java.SessionCreatedRequest.class, com.thpower.emqx.java.SessionCreatedRequest.Builder.class);
  }

  public static final int CLIENTINFO_FIELD_NUMBER = 1;
  private com.thpower.emqx.java.ClientInfo clientinfo_;
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return Whether the clientinfo field is set.
   */
  @java.lang.Override
  public boolean hasClientinfo() {
    return clientinfo_ != null;
  }
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return The clientinfo.
   */
  @java.lang.Override
  public com.thpower.emqx.java.ClientInfo getClientinfo() {
    return clientinfo_ == null ? com.thpower.emqx.java.ClientInfo.getDefaultInstance() : clientinfo_;
  }
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   */
  @java.lang.Override
  public com.thpower.emqx.java.ClientInfoOrBuilder getClientinfoOrBuilder() {
    return getClientinfo();
  }

  public static final int META_FIELD_NUMBER = 2;
  private com.thpower.emqx.java.RequestMeta meta_;
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
   * @return Whether the meta field is set.
   */
  @java.lang.Override
  public boolean hasMeta() {
    return meta_ != null;
  }
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
   * @return The meta.
   */
  @java.lang.Override
  public com.thpower.emqx.java.RequestMeta getMeta() {
    return meta_ == null ? com.thpower.emqx.java.RequestMeta.getDefaultInstance() : meta_;
  }
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
   */
  @java.lang.Override
  public com.thpower.emqx.java.RequestMetaOrBuilder getMetaOrBuilder() {
    return getMeta();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (clientinfo_ != null) {
      output.writeMessage(1, getClientinfo());
    }
    if (meta_ != null) {
      output.writeMessage(2, getMeta());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientinfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClientinfo());
    }
    if (meta_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMeta());
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
    if (!(obj instanceof com.thpower.emqx.java.SessionCreatedRequest)) {
      return super.equals(obj);
    }
    com.thpower.emqx.java.SessionCreatedRequest other = (com.thpower.emqx.java.SessionCreatedRequest) obj;

    if (hasClientinfo() != other.hasClientinfo()) return false;
    if (hasClientinfo()) {
      if (!getClientinfo()
          .equals(other.getClientinfo())) return false;
    }
    if (hasMeta() != other.hasMeta()) return false;
    if (hasMeta()) {
      if (!getMeta()
          .equals(other.getMeta())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasClientinfo()) {
      hash = (37 * hash) + CLIENTINFO_FIELD_NUMBER;
      hash = (53 * hash) + getClientinfo().hashCode();
    }
    if (hasMeta()) {
      hash = (37 * hash) + META_FIELD_NUMBER;
      hash = (53 * hash) + getMeta().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.thpower.emqx.java.SessionCreatedRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.thpower.emqx.java.SessionCreatedRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code emqx.exhook.v2.SessionCreatedRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:emqx.exhook.v2.SessionCreatedRequest)
      com.thpower.emqx.java.SessionCreatedRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thpower.emqx.java.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionCreatedRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thpower.emqx.java.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionCreatedRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thpower.emqx.java.SessionCreatedRequest.class, com.thpower.emqx.java.SessionCreatedRequest.Builder.class);
    }

    // Construct using com.thpower.emqx.java.SessionCreatedRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (clientinfoBuilder_ == null) {
        clientinfo_ = null;
      } else {
        clientinfo_ = null;
        clientinfoBuilder_ = null;
      }
      if (metaBuilder_ == null) {
        meta_ = null;
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thpower.emqx.java.EmqxExHookProto.internal_static_emqx_exhook_v2_SessionCreatedRequest_descriptor;
    }

    @java.lang.Override
    public com.thpower.emqx.java.SessionCreatedRequest getDefaultInstanceForType() {
      return com.thpower.emqx.java.SessionCreatedRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.thpower.emqx.java.SessionCreatedRequest build() {
      com.thpower.emqx.java.SessionCreatedRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.thpower.emqx.java.SessionCreatedRequest buildPartial() {
      com.thpower.emqx.java.SessionCreatedRequest result = new com.thpower.emqx.java.SessionCreatedRequest(this);
      if (clientinfoBuilder_ == null) {
        result.clientinfo_ = clientinfo_;
      } else {
        result.clientinfo_ = clientinfoBuilder_.build();
      }
      if (metaBuilder_ == null) {
        result.meta_ = meta_;
      } else {
        result.meta_ = metaBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thpower.emqx.java.SessionCreatedRequest) {
        return mergeFrom((com.thpower.emqx.java.SessionCreatedRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thpower.emqx.java.SessionCreatedRequest other) {
      if (other == com.thpower.emqx.java.SessionCreatedRequest.getDefaultInstance()) return this;
      if (other.hasClientinfo()) {
        mergeClientinfo(other.getClientinfo());
      }
      if (other.hasMeta()) {
        mergeMeta(other.getMeta());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.thpower.emqx.java.SessionCreatedRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thpower.emqx.java.SessionCreatedRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.thpower.emqx.java.ClientInfo clientinfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.thpower.emqx.java.ClientInfo, com.thpower.emqx.java.ClientInfo.Builder, com.thpower.emqx.java.ClientInfoOrBuilder> clientinfoBuilder_;
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     * @return Whether the clientinfo field is set.
     */
    public boolean hasClientinfo() {
      return clientinfoBuilder_ != null || clientinfo_ != null;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     * @return The clientinfo.
     */
    public com.thpower.emqx.java.ClientInfo getClientinfo() {
      if (clientinfoBuilder_ == null) {
        return clientinfo_ == null ? com.thpower.emqx.java.ClientInfo.getDefaultInstance() : clientinfo_;
      } else {
        return clientinfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder setClientinfo(com.thpower.emqx.java.ClientInfo value) {
      if (clientinfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientinfo_ = value;
        onChanged();
      } else {
        clientinfoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder setClientinfo(
        com.thpower.emqx.java.ClientInfo.Builder builderForValue) {
      if (clientinfoBuilder_ == null) {
        clientinfo_ = builderForValue.build();
        onChanged();
      } else {
        clientinfoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder mergeClientinfo(com.thpower.emqx.java.ClientInfo value) {
      if (clientinfoBuilder_ == null) {
        if (clientinfo_ != null) {
          clientinfo_ =
            com.thpower.emqx.java.ClientInfo.newBuilder(clientinfo_).mergeFrom(value).buildPartial();
        } else {
          clientinfo_ = value;
        }
        onChanged();
      } else {
        clientinfoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public Builder clearClientinfo() {
      if (clientinfoBuilder_ == null) {
        clientinfo_ = null;
        onChanged();
      } else {
        clientinfo_ = null;
        clientinfoBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public com.thpower.emqx.java.ClientInfo.Builder getClientinfoBuilder() {
      
      onChanged();
      return getClientinfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    public com.thpower.emqx.java.ClientInfoOrBuilder getClientinfoOrBuilder() {
      if (clientinfoBuilder_ != null) {
        return clientinfoBuilder_.getMessageOrBuilder();
      } else {
        return clientinfo_ == null ?
            com.thpower.emqx.java.ClientInfo.getDefaultInstance() : clientinfo_;
      }
    }
    /**
     * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.thpower.emqx.java.ClientInfo, com.thpower.emqx.java.ClientInfo.Builder, com.thpower.emqx.java.ClientInfoOrBuilder> 
        getClientinfoFieldBuilder() {
      if (clientinfoBuilder_ == null) {
        clientinfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.thpower.emqx.java.ClientInfo, com.thpower.emqx.java.ClientInfo.Builder, com.thpower.emqx.java.ClientInfoOrBuilder>(
                getClientinfo(),
                getParentForChildren(),
                isClean());
        clientinfo_ = null;
      }
      return clientinfoBuilder_;
    }

    private com.thpower.emqx.java.RequestMeta meta_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.thpower.emqx.java.RequestMeta, com.thpower.emqx.java.RequestMeta.Builder, com.thpower.emqx.java.RequestMetaOrBuilder> metaBuilder_;
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     * @return Whether the meta field is set.
     */
    public boolean hasMeta() {
      return metaBuilder_ != null || meta_ != null;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     * @return The meta.
     */
    public com.thpower.emqx.java.RequestMeta getMeta() {
      if (metaBuilder_ == null) {
        return meta_ == null ? com.thpower.emqx.java.RequestMeta.getDefaultInstance() : meta_;
      } else {
        return metaBuilder_.getMessage();
      }
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     */
    public Builder setMeta(com.thpower.emqx.java.RequestMeta value) {
      if (metaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        meta_ = value;
        onChanged();
      } else {
        metaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     */
    public Builder setMeta(
        com.thpower.emqx.java.RequestMeta.Builder builderForValue) {
      if (metaBuilder_ == null) {
        meta_ = builderForValue.build();
        onChanged();
      } else {
        metaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     */
    public Builder mergeMeta(com.thpower.emqx.java.RequestMeta value) {
      if (metaBuilder_ == null) {
        if (meta_ != null) {
          meta_ =
            com.thpower.emqx.java.RequestMeta.newBuilder(meta_).mergeFrom(value).buildPartial();
        } else {
          meta_ = value;
        }
        onChanged();
      } else {
        metaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     */
    public Builder clearMeta() {
      if (metaBuilder_ == null) {
        meta_ = null;
        onChanged();
      } else {
        meta_ = null;
        metaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     */
    public com.thpower.emqx.java.RequestMeta.Builder getMetaBuilder() {
      
      onChanged();
      return getMetaFieldBuilder().getBuilder();
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     */
    public com.thpower.emqx.java.RequestMetaOrBuilder getMetaOrBuilder() {
      if (metaBuilder_ != null) {
        return metaBuilder_.getMessageOrBuilder();
      } else {
        return meta_ == null ?
            com.thpower.emqx.java.RequestMeta.getDefaultInstance() : meta_;
      }
    }
    /**
     * <code>.emqx.exhook.v2.RequestMeta meta = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.thpower.emqx.java.RequestMeta, com.thpower.emqx.java.RequestMeta.Builder, com.thpower.emqx.java.RequestMetaOrBuilder> 
        getMetaFieldBuilder() {
      if (metaBuilder_ == null) {
        metaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.thpower.emqx.java.RequestMeta, com.thpower.emqx.java.RequestMeta.Builder, com.thpower.emqx.java.RequestMetaOrBuilder>(
                getMeta(),
                getParentForChildren(),
                isClean());
        meta_ = null;
      }
      return metaBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:emqx.exhook.v2.SessionCreatedRequest)
  }

  // @@protoc_insertion_point(class_scope:emqx.exhook.v2.SessionCreatedRequest)
  private static final com.thpower.emqx.java.SessionCreatedRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.thpower.emqx.java.SessionCreatedRequest();
  }

  public static com.thpower.emqx.java.SessionCreatedRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SessionCreatedRequest>
      PARSER = new com.google.protobuf.AbstractParser<SessionCreatedRequest>() {
    @java.lang.Override
    public SessionCreatedRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SessionCreatedRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SessionCreatedRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SessionCreatedRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.thpower.emqx.java.SessionCreatedRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

