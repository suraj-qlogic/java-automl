// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/text.proto

package com.google.cloud.automl.v1beta1;

public interface TextClassificationDatasetMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TextClassificationDatasetMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * Type of the classification problem.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
   */
  int getClassificationTypeValue();
  /**
   *
   *
   * <pre>
   * Required.
   * Type of the classification problem.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.ClassificationType classification_type = 1;</code>
   */
  com.google.cloud.automl.v1beta1.ClassificationProto.ClassificationType getClassificationType();
}
