// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package az.etibarli.grpc1;

/**
 * Protobuf type {@code PhoneOTP}
 */
public final class PhoneOTP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PhoneOTP)
    PhoneOTPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhoneOTP.newBuilder() to construct.
  private PhoneOTP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhoneOTP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhoneOTP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PhoneOTP(
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
          case 8: {

            number_ = input.readInt32();
            break;
          }
          case 16: {

            code_ = input.readInt32();
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
    return az.etibarli.grpc1.CredentialsOuterClass.internal_static_PhoneOTP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return az.etibarli.grpc1.CredentialsOuterClass.internal_static_PhoneOTP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            az.etibarli.grpc1.PhoneOTP.class, az.etibarli.grpc1.PhoneOTP.Builder.class);
  }

  public static final int NUMBER_FIELD_NUMBER = 1;
  private int number_;
  /**
   * <code>int32 number = 1;</code>
   * @return The number.
   */
  @java.lang.Override
  public int getNumber() {
    return number_;
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private int code_;
  /**
   * <code>int32 code = 2;</code>
   * @return The code.
   */
  @java.lang.Override
  public int getCode() {
    return code_;
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
    if (number_ != 0) {
      output.writeInt32(1, number_);
    }
    if (code_ != 0) {
      output.writeInt32(2, code_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (number_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, number_);
    }
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, code_);
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
    if (!(obj instanceof az.etibarli.grpc1.PhoneOTP)) {
      return super.equals(obj);
    }
    az.etibarli.grpc1.PhoneOTP other = (az.etibarli.grpc1.PhoneOTP) obj;

    if (getNumber()
        != other.getNumber()) return false;
    if (getCode()
        != other.getCode()) return false;
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
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static az.etibarli.grpc1.PhoneOTP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static az.etibarli.grpc1.PhoneOTP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static az.etibarli.grpc1.PhoneOTP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static az.etibarli.grpc1.PhoneOTP parseFrom(
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
  public static Builder newBuilder(az.etibarli.grpc1.PhoneOTP prototype) {
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
   * Protobuf type {@code PhoneOTP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PhoneOTP)
      az.etibarli.grpc1.PhoneOTPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return az.etibarli.grpc1.CredentialsOuterClass.internal_static_PhoneOTP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return az.etibarli.grpc1.CredentialsOuterClass.internal_static_PhoneOTP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              az.etibarli.grpc1.PhoneOTP.class, az.etibarli.grpc1.PhoneOTP.Builder.class);
    }

    // Construct using az.etibarli.grpc1.PhoneOTP.newBuilder()
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
      number_ = 0;

      code_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return az.etibarli.grpc1.CredentialsOuterClass.internal_static_PhoneOTP_descriptor;
    }

    @java.lang.Override
    public az.etibarli.grpc1.PhoneOTP getDefaultInstanceForType() {
      return az.etibarli.grpc1.PhoneOTP.getDefaultInstance();
    }

    @java.lang.Override
    public az.etibarli.grpc1.PhoneOTP build() {
      az.etibarli.grpc1.PhoneOTP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public az.etibarli.grpc1.PhoneOTP buildPartial() {
      az.etibarli.grpc1.PhoneOTP result = new az.etibarli.grpc1.PhoneOTP(this);
      result.number_ = number_;
      result.code_ = code_;
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
      if (other instanceof az.etibarli.grpc1.PhoneOTP) {
        return mergeFrom((az.etibarli.grpc1.PhoneOTP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(az.etibarli.grpc1.PhoneOTP other) {
      if (other == az.etibarli.grpc1.PhoneOTP.getDefaultInstance()) return this;
      if (other.getNumber() != 0) {
        setNumber(other.getNumber());
      }
      if (other.getCode() != 0) {
        setCode(other.getCode());
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
      az.etibarli.grpc1.PhoneOTP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (az.etibarli.grpc1.PhoneOTP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int number_ ;
    /**
     * <code>int32 number = 1;</code>
     * @return The number.
     */
    @java.lang.Override
    public int getNumber() {
      return number_;
    }
    /**
     * <code>int32 number = 1;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(int value) {
      
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 number = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = 0;
      onChanged();
      return this;
    }

    private int code_ ;
    /**
     * <code>int32 code = 2;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }
    /**
     * <code>int32 code = 2;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:PhoneOTP)
  }

  // @@protoc_insertion_point(class_scope:PhoneOTP)
  private static final az.etibarli.grpc1.PhoneOTP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new az.etibarli.grpc1.PhoneOTP();
  }

  public static az.etibarli.grpc1.PhoneOTP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhoneOTP>
      PARSER = new com.google.protobuf.AbstractParser<PhoneOTP>() {
    @java.lang.Override
    public PhoneOTP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PhoneOTP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PhoneOTP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhoneOTP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public az.etibarli.grpc1.PhoneOTP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

