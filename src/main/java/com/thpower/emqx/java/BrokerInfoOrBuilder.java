// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package com.thpower.emqx.java;

public interface BrokerInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v2.BrokerInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string version = 1;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>string sysdescr = 2;</code>
   * @return The sysdescr.
   */
  java.lang.String getSysdescr();
  /**
   * <code>string sysdescr = 2;</code>
   * @return The bytes for sysdescr.
   */
  com.google.protobuf.ByteString
      getSysdescrBytes();

  /**
   * <code>int64 uptime = 3;</code>
   * @return The uptime.
   */
  long getUptime();

  /**
   * <code>string datetime = 4;</code>
   * @return The datetime.
   */
  java.lang.String getDatetime();
  /**
   * <code>string datetime = 4;</code>
   * @return The bytes for datetime.
   */
  com.google.protobuf.ByteString
      getDatetimeBytes();
}
