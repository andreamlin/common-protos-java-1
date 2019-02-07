// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/metric.proto

package com.google.api;

public final class MetricProto {
  private MetricProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MetricDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MetricDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Metric_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_api_Metric_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Metric_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027google/api/metric.proto\022\ngoogle.api\032\026g" +
      "oogle/api/label.proto\032\035google/api/launch" +
      "_stage.proto\032\036google/protobuf/duration.p" +
      "roto\"\312\005\n\020MetricDescriptor\022\014\n\004name\030\001 \001(\t\022" +
      "\014\n\004type\030\010 \001(\t\022+\n\006labels\030\002 \003(\0132\033.google.a" +
      "pi.LabelDescriptor\022<\n\013metric_kind\030\003 \001(\0162" +
      "\'.google.api.MetricDescriptor.MetricKind" +
      "\022:\n\nvalue_type\030\004 \001(\0162&.google.api.Metric" +
      "Descriptor.ValueType\022\014\n\004unit\030\005 \001(\t\022\023\n\013de" +
      "scription\030\006 \001(\t\022\024\n\014display_name\030\007 \001(\t\022G\n" +
      "\010metadata\030\n \001(\01325.google.api.MetricDescr" +
      "iptor.MetricDescriptorMetadata\032\254\001\n\030Metri" +
      "cDescriptorMetadata\022-\n\014launch_stage\030\001 \001(" +
      "\0162\027.google.api.LaunchStage\0220\n\rsample_per" +
      "iod\030\002 \001(\0132\031.google.protobuf.Duration\022/\n\014" +
      "ingest_delay\030\003 \001(\0132\031.google.protobuf.Dur" +
      "ation\"O\n\nMetricKind\022\033\n\027METRIC_KIND_UNSPE" +
      "CIFIED\020\000\022\t\n\005GAUGE\020\001\022\t\n\005DELTA\020\002\022\016\n\nCUMULA" +
      "TIVE\020\003\"q\n\tValueType\022\032\n\026VALUE_TYPE_UNSPEC" +
      "IFIED\020\000\022\010\n\004BOOL\020\001\022\t\n\005INT64\020\002\022\n\n\006DOUBLE\020\003" +
      "\022\n\n\006STRING\020\004\022\020\n\014DISTRIBUTION\020\005\022\t\n\005MONEY\020" +
      "\006\"u\n\006Metric\022\014\n\004type\030\003 \001(\t\022.\n\006labels\030\002 \003(" +
      "\0132\036.google.api.Metric.LabelsEntry\032-\n\013Lab" +
      "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "B_\n\016com.google.apiB\013MetricProtoP\001Z7googl" +
      "e.golang.org/genproto/googleapis/api/met" +
      "ric;metric\242\002\004GAPIb\006proto3"
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
          com.google.api.LabelProto.getDescriptor(),
          com.google.api.LaunchStageProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        }, assigner);
    internal_static_google_api_MetricDescriptor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_MetricDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MetricDescriptor_descriptor,
        new java.lang.String[] { "Name", "Type", "Labels", "MetricKind", "ValueType", "Unit", "Description", "DisplayName", "Metadata", });
    internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor =
      internal_static_google_api_MetricDescriptor_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_MetricDescriptor_MetricDescriptorMetadata_descriptor,
        new java.lang.String[] { "LaunchStage", "SamplePeriod", "IngestDelay", });
    internal_static_google_api_Metric_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_Metric_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Metric_descriptor,
        new java.lang.String[] { "Type", "Labels", });
    internal_static_google_api_Metric_LabelsEntry_descriptor =
      internal_static_google_api_Metric_descriptor.getNestedTypes().get(0);
    internal_static_google_api_Metric_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_api_Metric_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.LabelProto.getDescriptor();
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}