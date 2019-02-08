// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/distribution.proto

package com.google.api;

public final class DistributionProto {
  private DistributionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_Range_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_Range_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_Linear_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_Linear_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_Exponential_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_BucketOptions_Explicit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Distribution_Exemplar_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Distribution_Exemplar_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035google/api/distribution.proto\022\ngoogle." +
      "api\032\031google/protobuf/any.proto\032\037google/p" +
      "rotobuf/timestamp.proto\"\331\006\n\014Distribution" +
      "\022\r\n\005count\030\001 \001(\003\022\014\n\004mean\030\002 \001(\001\022 \n\030sum_of_" +
      "squared_deviation\030\003 \001(\001\022-\n\005range\030\004 \001(\0132\036" +
      ".google.api.Distribution.Range\022>\n\016bucket" +
      "_options\030\006 \001(\0132&.google.api.Distribution" +
      ".BucketOptions\022\025\n\rbucket_counts\030\007 \003(\003\0224\n" +
      "\texemplars\030\n \003(\0132!.google.api.Distributi" +
      "on.Exemplar\032!\n\005Range\022\013\n\003min\030\001 \001(\001\022\013\n\003max" +
      "\030\002 \001(\001\032\265\003\n\rBucketOptions\022G\n\016linear_bucke" +
      "ts\030\001 \001(\0132-.google.api.Distribution.Bucke" +
      "tOptions.LinearH\000\022Q\n\023exponential_buckets" +
      "\030\002 \001(\01322.google.api.Distribution.BucketO" +
      "ptions.ExponentialH\000\022K\n\020explicit_buckets" +
      "\030\003 \001(\0132/.google.api.Distribution.BucketO" +
      "ptions.ExplicitH\000\032C\n\006Linear\022\032\n\022num_finit" +
      "e_buckets\030\001 \001(\005\022\r\n\005width\030\002 \001(\001\022\016\n\006offset" +
      "\030\003 \001(\001\032O\n\013Exponential\022\032\n\022num_finite_buck" +
      "ets\030\001 \001(\005\022\025\n\rgrowth_factor\030\002 \001(\001\022\r\n\005scal" +
      "e\030\003 \001(\001\032\032\n\010Explicit\022\016\n\006bounds\030\001 \003(\001B\t\n\007o" +
      "ptions\032s\n\010Exemplar\022\r\n\005value\030\001 \001(\001\022-\n\ttim" +
      "estamp\030\002 \001(\0132\032.google.protobuf.Timestamp" +
      "\022)\n\013attachments\030\003 \003(\0132\024.google.protobuf." +
      "AnyBq\n\016com.google.apiB\021DistributionProto" +
      "P\001ZCgoogle.golang.org/genproto/googleapi" +
      "s/api/distribution;distribution\242\002\004GAPIb\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_Distribution_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_Distribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_descriptor,
        new java.lang.String[] { "Count", "Mean", "SumOfSquaredDeviation", "Range", "BucketOptions", "BucketCounts", "Exemplars", });
    internal_static_google_api_Distribution_Range_descriptor =
      internal_static_google_api_Distribution_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Distribution_Range_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_Range_descriptor,
        new java.lang.String[] { "Min", "Max", });
    internal_static_google_api_Distribution_BucketOptions_descriptor =
      internal_static_google_api_Distribution_descriptor.getNestedTypes().get(1);
    internal_static_google_api_Distribution_BucketOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_descriptor,
        new java.lang.String[] { "LinearBuckets", "ExponentialBuckets", "ExplicitBuckets", "Options", });
    internal_static_google_api_Distribution_BucketOptions_Linear_descriptor =
      internal_static_google_api_Distribution_BucketOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Distribution_BucketOptions_Linear_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_Linear_descriptor,
        new java.lang.String[] { "NumFiniteBuckets", "Width", "Offset", });
    internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor =
      internal_static_google_api_Distribution_BucketOptions_descriptor.getNestedTypes().get(1);
    internal_static_google_api_Distribution_BucketOptions_Exponential_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_Exponential_descriptor,
        new java.lang.String[] { "NumFiniteBuckets", "GrowthFactor", "Scale", });
    internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor =
      internal_static_google_api_Distribution_BucketOptions_descriptor.getNestedTypes().get(2);
    internal_static_google_api_Distribution_BucketOptions_Explicit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_BucketOptions_Explicit_descriptor,
        new java.lang.String[] { "Bounds", });
    internal_static_google_api_Distribution_Exemplar_descriptor =
      internal_static_google_api_Distribution_descriptor.getNestedTypes().get(2);
    internal_static_google_api_Distribution_Exemplar_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Distribution_Exemplar_descriptor,
        new java.lang.String[] { "Value", "Timestamp", "Attachments", });
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}