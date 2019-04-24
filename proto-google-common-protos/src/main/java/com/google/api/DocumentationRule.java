// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/documentation.proto

package com.google.api;

/**
 * <pre>
 * A documentation rule provides information about individual API elements.
 * </pre>
 *
 * Protobuf type {@code google.api.DocumentationRule}
 */
public  final class DocumentationRule extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.DocumentationRule)
    DocumentationRuleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DocumentationRule.newBuilder() to construct.
  private DocumentationRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DocumentationRule() {
    selector_ = "";
    description_ = "";
    deprecationDescription_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DocumentationRule(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            selector_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            deprecationDescription_ = s;
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
    return com.google.api.DocumentationProto.internal_static_google_api_DocumentationRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.DocumentationProto.internal_static_google_api_DocumentationRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.DocumentationRule.class, com.google.api.DocumentationRule.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;
  private volatile java.lang.Object selector_;
  /**
   * <pre>
   * The selector is a comma-separated list of patterns. Each pattern is a
   * qualified name of the element which may end in "*", indicating a wildcard.
   * Wildcards are only allowed at the end and for a whole component of the
   * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
   * wildcard will match one or more components. To specify a default for all
   * applicable elements, the whole pattern "*" is used.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The selector is a comma-separated list of patterns. Each pattern is a
   * qualified name of the element which may end in "*", indicating a wildcard.
   * Wildcards are only allowed at the end and for a whole component of the
   * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
   * wildcard will match one or more components. To specify a default for all
   * applicable elements, the whole pattern "*" is used.
   * </pre>
   *
   * <code>string selector = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Description of the selected API(s).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Description of the selected API(s).
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object deprecationDescription_;
  /**
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   */
  public java.lang.String getDeprecationDescription() {
    java.lang.Object ref = deprecationDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deprecationDescription_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   */
  public com.google.protobuf.ByteString
      getDeprecationDescriptionBytes() {
    java.lang.Object ref = deprecationDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deprecationDescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSelectorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!getDeprecationDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deprecationDescription_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSelectorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!getDeprecationDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deprecationDescription_);
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
    if (!(obj instanceof com.google.api.DocumentationRule)) {
      return super.equals(obj);
    }
    com.google.api.DocumentationRule other = (com.google.api.DocumentationRule) obj;

    if (!getSelector()
        .equals(other.getSelector())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (!getDeprecationDescription()
        .equals(other.getDeprecationDescription())) return false;
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
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + DEPRECATION_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDeprecationDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.DocumentationRule parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.DocumentationRule parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.DocumentationRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.DocumentationRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.DocumentationRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.DocumentationRule parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.DocumentationRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.DocumentationRule parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.DocumentationRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.DocumentationRule parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.DocumentationRule parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.DocumentationRule parseFrom(
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
  public static Builder newBuilder(com.google.api.DocumentationRule prototype) {
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
   * <pre>
   * A documentation rule provides information about individual API elements.
   * </pre>
   *
   * Protobuf type {@code google.api.DocumentationRule}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.DocumentationRule)
      com.google.api.DocumentationRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.DocumentationProto.internal_static_google_api_DocumentationRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.DocumentationProto.internal_static_google_api_DocumentationRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.DocumentationRule.class, com.google.api.DocumentationRule.Builder.class);
    }

    // Construct using com.google.api.DocumentationRule.newBuilder()
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
      selector_ = "";

      description_ = "";

      deprecationDescription_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.DocumentationProto.internal_static_google_api_DocumentationRule_descriptor;
    }

    @java.lang.Override
    public com.google.api.DocumentationRule getDefaultInstanceForType() {
      return com.google.api.DocumentationRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.DocumentationRule build() {
      com.google.api.DocumentationRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.DocumentationRule buildPartial() {
      com.google.api.DocumentationRule result = new com.google.api.DocumentationRule(this);
      result.selector_ = selector_;
      result.description_ = description_;
      result.deprecationDescription_ = deprecationDescription_;
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
      if (other instanceof com.google.api.DocumentationRule) {
        return mergeFrom((com.google.api.DocumentationRule)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.DocumentationRule other) {
      if (other == com.google.api.DocumentationRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getDeprecationDescription().isEmpty()) {
        deprecationDescription_ = other.deprecationDescription_;
        onChanged();
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
      com.google.api.DocumentationRule parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.DocumentationRule) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object selector_ = "";
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelector(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      selector_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder clearSelector() {
      
      selector_ = getDefaultInstance().getSelector();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The selector is a comma-separated list of patterns. Each pattern is a
     * qualified name of the element which may end in "*", indicating a wildcard.
     * Wildcards are only allowed at the end and for a whole component of the
     * qualified name, i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A
     * wildcard will match one or more components. To specify a default for all
     * applicable elements, the whole pattern "*" is used.
     * </pre>
     *
     * <code>string selector = 1;</code>
     */
    public Builder setSelectorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      selector_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Description of the selected API(s).
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deprecationDescription_ = "";
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public java.lang.String getDeprecationDescription() {
      java.lang.Object ref = deprecationDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deprecationDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public com.google.protobuf.ByteString
        getDeprecationDescriptionBytes() {
      java.lang.Object ref = deprecationDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deprecationDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public Builder setDeprecationDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deprecationDescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public Builder clearDeprecationDescription() {
      
      deprecationDescription_ = getDefaultInstance().getDeprecationDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     */
    public Builder setDeprecationDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deprecationDescription_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.api.DocumentationRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.DocumentationRule)
  private static final com.google.api.DocumentationRule DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.DocumentationRule();
  }

  public static com.google.api.DocumentationRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentationRule>
      PARSER = new com.google.protobuf.AbstractParser<DocumentationRule>() {
    @java.lang.Override
    public DocumentationRule parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DocumentationRule(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DocumentationRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentationRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.DocumentationRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

