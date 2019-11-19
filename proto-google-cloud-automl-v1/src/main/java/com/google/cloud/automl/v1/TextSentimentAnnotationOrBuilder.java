/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/automl/v1/text_sentiment.proto

package com.google.cloud.automl.v1;

public interface TextSentimentAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.TextSentimentAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The sentiment with the semantic, as given to the
   * [AutoMl.ImportData][google.cloud.automl.v1.AutoMl.ImportData] when
   * populating the dataset from which the model used for the prediction had
   * been trained. The sentiment values are between 0 and
   * Dataset.text_sentiment_dataset_metadata.sentiment_max (inclusive),
   * with higher value meaning more positive sentiment. They are completely
   * relative, i.e. 0 means least positive sentiment and sentiment_max means
   * the most positive from the sentiments present in the train data. Therefore
   *  e.g. if train data had only negative sentiment, then sentiment_max, would
   * be still negative (although least negative).
   * The sentiment shouldn't be confused with "score" or "magnitude"
   * from the previous Natural Language Sentiment Analysis API.
   * </pre>
   *
   * <code>int32 sentiment = 1;</code>
   */
  int getSentiment();
}