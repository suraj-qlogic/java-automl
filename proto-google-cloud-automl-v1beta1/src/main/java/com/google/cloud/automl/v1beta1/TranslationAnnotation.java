/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/translation.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Annotation details specific to translation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.TranslationAnnotation}
 */
public final class TranslationAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.TranslationAnnotation)
    TranslationAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TranslationAnnotation.newBuilder() to construct.
  private TranslationAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TranslationAnnotation() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TranslationAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TranslationAnnotation(
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
          case 10:
            {
              com.google.cloud.automl.v1beta1.TextSnippet.Builder subBuilder = null;
              if (translatedContent_ != null) {
                subBuilder = translatedContent_.toBuilder();
              }
              translatedContent_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.TextSnippet.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(translatedContent_);
                translatedContent_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.TranslationProto
        .internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.TranslationProto
        .internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.TranslationAnnotation.class,
            com.google.cloud.automl.v1beta1.TranslationAnnotation.Builder.class);
  }

  public static final int TRANSLATED_CONTENT_FIELD_NUMBER = 1;
  private com.google.cloud.automl.v1beta1.TextSnippet translatedContent_;
  /**
   *
   *
   * <pre>
   * Output only . The translated content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
   *
   * @return Whether the translatedContent field is set.
   */
  @java.lang.Override
  public boolean hasTranslatedContent() {
    return translatedContent_ != null;
  }
  /**
   *
   *
   * <pre>
   * Output only . The translated content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
   *
   * @return The translatedContent.
   */
  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TextSnippet getTranslatedContent() {
    return translatedContent_ == null
        ? com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance()
        : translatedContent_;
  }
  /**
   *
   *
   * <pre>
   * Output only . The translated content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getTranslatedContentOrBuilder() {
    return getTranslatedContent();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (translatedContent_ != null) {
      output.writeMessage(1, getTranslatedContent());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (translatedContent_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTranslatedContent());
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.TranslationAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.TranslationAnnotation other =
        (com.google.cloud.automl.v1beta1.TranslationAnnotation) obj;

    if (hasTranslatedContent() != other.hasTranslatedContent()) return false;
    if (hasTranslatedContent()) {
      if (!getTranslatedContent().equals(other.getTranslatedContent())) return false;
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
    if (hasTranslatedContent()) {
      hash = (37 * hash) + TRANSLATED_CONTENT_FIELD_NUMBER;
      hash = (53 * hash) + getTranslatedContent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.automl.v1beta1.TranslationAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Annotation details specific to translation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.TranslationAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.TranslationAnnotation)
      com.google.cloud.automl.v1beta1.TranslationAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.TranslationProto
          .internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.TranslationProto
          .internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.TranslationAnnotation.class,
              com.google.cloud.automl.v1beta1.TranslationAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.TranslationAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (translatedContentBuilder_ == null) {
        translatedContent_ = null;
      } else {
        translatedContent_ = null;
        translatedContentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.TranslationProto
          .internal_static_google_cloud_automl_v1beta1_TranslationAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TranslationAnnotation getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.TranslationAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TranslationAnnotation build() {
      com.google.cloud.automl.v1beta1.TranslationAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.TranslationAnnotation buildPartial() {
      com.google.cloud.automl.v1beta1.TranslationAnnotation result =
          new com.google.cloud.automl.v1beta1.TranslationAnnotation(this);
      if (translatedContentBuilder_ == null) {
        result.translatedContent_ = translatedContent_;
      } else {
        result.translatedContent_ = translatedContentBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.automl.v1beta1.TranslationAnnotation) {
        return mergeFrom((com.google.cloud.automl.v1beta1.TranslationAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.TranslationAnnotation other) {
      if (other == com.google.cloud.automl.v1beta1.TranslationAnnotation.getDefaultInstance())
        return this;
      if (other.hasTranslatedContent()) {
        mergeTranslatedContent(other.getTranslatedContent());
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
      com.google.cloud.automl.v1beta1.TranslationAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.TranslationAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.automl.v1beta1.TextSnippet translatedContent_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TextSnippet,
            com.google.cloud.automl.v1beta1.TextSnippet.Builder,
            com.google.cloud.automl.v1beta1.TextSnippetOrBuilder>
        translatedContentBuilder_;
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     *
     * @return Whether the translatedContent field is set.
     */
    public boolean hasTranslatedContent() {
      return translatedContentBuilder_ != null || translatedContent_ != null;
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     *
     * @return The translatedContent.
     */
    public com.google.cloud.automl.v1beta1.TextSnippet getTranslatedContent() {
      if (translatedContentBuilder_ == null) {
        return translatedContent_ == null
            ? com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance()
            : translatedContent_;
      } else {
        return translatedContentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     */
    public Builder setTranslatedContent(com.google.cloud.automl.v1beta1.TextSnippet value) {
      if (translatedContentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        translatedContent_ = value;
        onChanged();
      } else {
        translatedContentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     */
    public Builder setTranslatedContent(
        com.google.cloud.automl.v1beta1.TextSnippet.Builder builderForValue) {
      if (translatedContentBuilder_ == null) {
        translatedContent_ = builderForValue.build();
        onChanged();
      } else {
        translatedContentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     */
    public Builder mergeTranslatedContent(com.google.cloud.automl.v1beta1.TextSnippet value) {
      if (translatedContentBuilder_ == null) {
        if (translatedContent_ != null) {
          translatedContent_ =
              com.google.cloud.automl.v1beta1.TextSnippet.newBuilder(translatedContent_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          translatedContent_ = value;
        }
        onChanged();
      } else {
        translatedContentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     */
    public Builder clearTranslatedContent() {
      if (translatedContentBuilder_ == null) {
        translatedContent_ = null;
        onChanged();
      } else {
        translatedContent_ = null;
        translatedContentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSnippet.Builder getTranslatedContentBuilder() {

      onChanged();
      return getTranslatedContentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     */
    public com.google.cloud.automl.v1beta1.TextSnippetOrBuilder getTranslatedContentOrBuilder() {
      if (translatedContentBuilder_ != null) {
        return translatedContentBuilder_.getMessageOrBuilder();
      } else {
        return translatedContent_ == null
            ? com.google.cloud.automl.v1beta1.TextSnippet.getDefaultInstance()
            : translatedContent_;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only . The translated content.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.TextSnippet translated_content = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.TextSnippet,
            com.google.cloud.automl.v1beta1.TextSnippet.Builder,
            com.google.cloud.automl.v1beta1.TextSnippetOrBuilder>
        getTranslatedContentFieldBuilder() {
      if (translatedContentBuilder_ == null) {
        translatedContentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.TextSnippet,
                com.google.cloud.automl.v1beta1.TextSnippet.Builder,
                com.google.cloud.automl.v1beta1.TextSnippetOrBuilder>(
                getTranslatedContent(), getParentForChildren(), isClean());
        translatedContent_ = null;
      }
      return translatedContentBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.TranslationAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.TranslationAnnotation)
  private static final com.google.cloud.automl.v1beta1.TranslationAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.TranslationAnnotation();
  }

  public static com.google.cloud.automl.v1beta1.TranslationAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TranslationAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<TranslationAnnotation>() {
        @java.lang.Override
        public TranslationAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TranslationAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TranslationAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TranslationAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.TranslationAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
