// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exhook.proto

package com.thpower.emqx.java;

public interface SessionUnsubscribedRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:emqx.exhook.v2.SessionUnsubscribedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return Whether the clientinfo field is set.
   */
  boolean hasClientinfo();
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   * @return The clientinfo.
   */
  com.thpower.emqx.java.ClientInfo getClientinfo();
  /**
   * <code>.emqx.exhook.v2.ClientInfo clientinfo = 1;</code>
   */
  com.thpower.emqx.java.ClientInfoOrBuilder getClientinfoOrBuilder();

  /**
   * <code>string topic = 2;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 2;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 3;</code>
   * @return Whether the meta field is set.
   */
  boolean hasMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 3;</code>
   * @return The meta.
   */
  com.thpower.emqx.java.RequestMeta getMeta();
  /**
   * <code>.emqx.exhook.v2.RequestMeta meta = 3;</code>
   */
  com.thpower.emqx.java.RequestMetaOrBuilder getMetaOrBuilder();
}
