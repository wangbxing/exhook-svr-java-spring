package com.thpower.emqx.grpcjava;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: exhook.proto")
public final class HookProviderGrpc {

  private HookProviderGrpc() {}

  public static final String SERVICE_NAME = "emqx.exhook.v2.HookProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ProviderLoadedRequest,
      com.thpower.emqx.java.LoadedResponse> getOnProviderLoadedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnProviderLoaded",
      requestType = com.thpower.emqx.java.ProviderLoadedRequest.class,
      responseType = com.thpower.emqx.java.LoadedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ProviderLoadedRequest,
      com.thpower.emqx.java.LoadedResponse> getOnProviderLoadedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ProviderLoadedRequest, com.thpower.emqx.java.LoadedResponse> getOnProviderLoadedMethod;
    if ((getOnProviderLoadedMethod = HookProviderGrpc.getOnProviderLoadedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnProviderLoadedMethod = HookProviderGrpc.getOnProviderLoadedMethod) == null) {
          HookProviderGrpc.getOnProviderLoadedMethod = getOnProviderLoadedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ProviderLoadedRequest, com.thpower.emqx.java.LoadedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnProviderLoaded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ProviderLoadedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.LoadedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnProviderLoaded"))
              .build();
        }
      }
    }
    return getOnProviderLoadedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ProviderUnloadedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnProviderUnloadedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnProviderUnloaded",
      requestType = com.thpower.emqx.java.ProviderUnloadedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ProviderUnloadedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnProviderUnloadedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ProviderUnloadedRequest, com.thpower.emqx.java.EmptySuccess> getOnProviderUnloadedMethod;
    if ((getOnProviderUnloadedMethod = HookProviderGrpc.getOnProviderUnloadedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnProviderUnloadedMethod = HookProviderGrpc.getOnProviderUnloadedMethod) == null) {
          HookProviderGrpc.getOnProviderUnloadedMethod = getOnProviderUnloadedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ProviderUnloadedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnProviderUnloaded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ProviderUnloadedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnProviderUnloaded"))
              .build();
        }
      }
    }
    return getOnProviderUnloadedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnectRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientConnect",
      requestType = com.thpower.emqx.java.ClientConnectRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnectRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientConnectMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnectRequest, com.thpower.emqx.java.EmptySuccess> getOnClientConnectMethod;
    if ((getOnClientConnectMethod = HookProviderGrpc.getOnClientConnectMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientConnectMethod = HookProviderGrpc.getOnClientConnectMethod) == null) {
          HookProviderGrpc.getOnClientConnectMethod = getOnClientConnectMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientConnectRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientConnect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientConnectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientConnect"))
              .build();
        }
      }
    }
    return getOnClientConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnackRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientConnackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientConnack",
      requestType = com.thpower.emqx.java.ClientConnackRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnackRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientConnackMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnackRequest, com.thpower.emqx.java.EmptySuccess> getOnClientConnackMethod;
    if ((getOnClientConnackMethod = HookProviderGrpc.getOnClientConnackMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientConnackMethod = HookProviderGrpc.getOnClientConnackMethod) == null) {
          HookProviderGrpc.getOnClientConnackMethod = getOnClientConnackMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientConnackRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientConnack"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientConnackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientConnack"))
              .build();
        }
      }
    }
    return getOnClientConnackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnectedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientConnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientConnected",
      requestType = com.thpower.emqx.java.ClientConnectedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnectedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientConnectedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientConnectedRequest, com.thpower.emqx.java.EmptySuccess> getOnClientConnectedMethod;
    if ((getOnClientConnectedMethod = HookProviderGrpc.getOnClientConnectedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientConnectedMethod = HookProviderGrpc.getOnClientConnectedMethod) == null) {
          HookProviderGrpc.getOnClientConnectedMethod = getOnClientConnectedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientConnectedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientConnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientConnectedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientConnected"))
              .build();
        }
      }
    }
    return getOnClientConnectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientDisconnectedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientDisconnectedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientDisconnected",
      requestType = com.thpower.emqx.java.ClientDisconnectedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientDisconnectedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientDisconnectedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientDisconnectedRequest, com.thpower.emqx.java.EmptySuccess> getOnClientDisconnectedMethod;
    if ((getOnClientDisconnectedMethod = HookProviderGrpc.getOnClientDisconnectedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientDisconnectedMethod = HookProviderGrpc.getOnClientDisconnectedMethod) == null) {
          HookProviderGrpc.getOnClientDisconnectedMethod = getOnClientDisconnectedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientDisconnectedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientDisconnected"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientDisconnectedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientDisconnected"))
              .build();
        }
      }
    }
    return getOnClientDisconnectedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientAuthenticateRequest,
      com.thpower.emqx.java.ValuedResponse> getOnClientAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientAuthenticate",
      requestType = com.thpower.emqx.java.ClientAuthenticateRequest.class,
      responseType = com.thpower.emqx.java.ValuedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientAuthenticateRequest,
      com.thpower.emqx.java.ValuedResponse> getOnClientAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientAuthenticateRequest, com.thpower.emqx.java.ValuedResponse> getOnClientAuthenticateMethod;
    if ((getOnClientAuthenticateMethod = HookProviderGrpc.getOnClientAuthenticateMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientAuthenticateMethod = HookProviderGrpc.getOnClientAuthenticateMethod) == null) {
          HookProviderGrpc.getOnClientAuthenticateMethod = getOnClientAuthenticateMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientAuthenticateRequest, com.thpower.emqx.java.ValuedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientAuthenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientAuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ValuedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientAuthenticate"))
              .build();
        }
      }
    }
    return getOnClientAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientAuthorizeRequest,
      com.thpower.emqx.java.ValuedResponse> getOnClientAuthorizeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientAuthorize",
      requestType = com.thpower.emqx.java.ClientAuthorizeRequest.class,
      responseType = com.thpower.emqx.java.ValuedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientAuthorizeRequest,
      com.thpower.emqx.java.ValuedResponse> getOnClientAuthorizeMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientAuthorizeRequest, com.thpower.emqx.java.ValuedResponse> getOnClientAuthorizeMethod;
    if ((getOnClientAuthorizeMethod = HookProviderGrpc.getOnClientAuthorizeMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientAuthorizeMethod = HookProviderGrpc.getOnClientAuthorizeMethod) == null) {
          HookProviderGrpc.getOnClientAuthorizeMethod = getOnClientAuthorizeMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientAuthorizeRequest, com.thpower.emqx.java.ValuedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientAuthorize"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientAuthorizeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ValuedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientAuthorize"))
              .build();
        }
      }
    }
    return getOnClientAuthorizeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientSubscribeRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientSubscribe",
      requestType = com.thpower.emqx.java.ClientSubscribeRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientSubscribeRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientSubscribeMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientSubscribeRequest, com.thpower.emqx.java.EmptySuccess> getOnClientSubscribeMethod;
    if ((getOnClientSubscribeMethod = HookProviderGrpc.getOnClientSubscribeMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientSubscribeMethod = HookProviderGrpc.getOnClientSubscribeMethod) == null) {
          HookProviderGrpc.getOnClientSubscribeMethod = getOnClientSubscribeMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientSubscribeRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientSubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientSubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientSubscribe"))
              .build();
        }
      }
    }
    return getOnClientSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientUnsubscribeRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientUnsubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnClientUnsubscribe",
      requestType = com.thpower.emqx.java.ClientUnsubscribeRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientUnsubscribeRequest,
      com.thpower.emqx.java.EmptySuccess> getOnClientUnsubscribeMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.ClientUnsubscribeRequest, com.thpower.emqx.java.EmptySuccess> getOnClientUnsubscribeMethod;
    if ((getOnClientUnsubscribeMethod = HookProviderGrpc.getOnClientUnsubscribeMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnClientUnsubscribeMethod = HookProviderGrpc.getOnClientUnsubscribeMethod) == null) {
          HookProviderGrpc.getOnClientUnsubscribeMethod = getOnClientUnsubscribeMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.ClientUnsubscribeRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnClientUnsubscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ClientUnsubscribeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnClientUnsubscribe"))
              .build();
        }
      }
    }
    return getOnClientUnsubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionCreatedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionCreatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnSessionCreated",
      requestType = com.thpower.emqx.java.SessionCreatedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionCreatedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionCreatedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionCreatedRequest, com.thpower.emqx.java.EmptySuccess> getOnSessionCreatedMethod;
    if ((getOnSessionCreatedMethod = HookProviderGrpc.getOnSessionCreatedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnSessionCreatedMethod = HookProviderGrpc.getOnSessionCreatedMethod) == null) {
          HookProviderGrpc.getOnSessionCreatedMethod = getOnSessionCreatedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.SessionCreatedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnSessionCreated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.SessionCreatedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnSessionCreated"))
              .build();
        }
      }
    }
    return getOnSessionCreatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionSubscribedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionSubscribedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnSessionSubscribed",
      requestType = com.thpower.emqx.java.SessionSubscribedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionSubscribedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionSubscribedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionSubscribedRequest, com.thpower.emqx.java.EmptySuccess> getOnSessionSubscribedMethod;
    if ((getOnSessionSubscribedMethod = HookProviderGrpc.getOnSessionSubscribedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnSessionSubscribedMethod = HookProviderGrpc.getOnSessionSubscribedMethod) == null) {
          HookProviderGrpc.getOnSessionSubscribedMethod = getOnSessionSubscribedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.SessionSubscribedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnSessionSubscribed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.SessionSubscribedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnSessionSubscribed"))
              .build();
        }
      }
    }
    return getOnSessionSubscribedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionUnsubscribedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionUnsubscribedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnSessionUnsubscribed",
      requestType = com.thpower.emqx.java.SessionUnsubscribedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionUnsubscribedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionUnsubscribedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionUnsubscribedRequest, com.thpower.emqx.java.EmptySuccess> getOnSessionUnsubscribedMethod;
    if ((getOnSessionUnsubscribedMethod = HookProviderGrpc.getOnSessionUnsubscribedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnSessionUnsubscribedMethod = HookProviderGrpc.getOnSessionUnsubscribedMethod) == null) {
          HookProviderGrpc.getOnSessionUnsubscribedMethod = getOnSessionUnsubscribedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.SessionUnsubscribedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnSessionUnsubscribed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.SessionUnsubscribedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnSessionUnsubscribed"))
              .build();
        }
      }
    }
    return getOnSessionUnsubscribedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionResumedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionResumedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnSessionResumed",
      requestType = com.thpower.emqx.java.SessionResumedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionResumedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionResumedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionResumedRequest, com.thpower.emqx.java.EmptySuccess> getOnSessionResumedMethod;
    if ((getOnSessionResumedMethod = HookProviderGrpc.getOnSessionResumedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnSessionResumedMethod = HookProviderGrpc.getOnSessionResumedMethod) == null) {
          HookProviderGrpc.getOnSessionResumedMethod = getOnSessionResumedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.SessionResumedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnSessionResumed"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.SessionResumedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnSessionResumed"))
              .build();
        }
      }
    }
    return getOnSessionResumedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionDiscardedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionDiscardedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnSessionDiscarded",
      requestType = com.thpower.emqx.java.SessionDiscardedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionDiscardedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionDiscardedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionDiscardedRequest, com.thpower.emqx.java.EmptySuccess> getOnSessionDiscardedMethod;
    if ((getOnSessionDiscardedMethod = HookProviderGrpc.getOnSessionDiscardedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnSessionDiscardedMethod = HookProviderGrpc.getOnSessionDiscardedMethod) == null) {
          HookProviderGrpc.getOnSessionDiscardedMethod = getOnSessionDiscardedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.SessionDiscardedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnSessionDiscarded"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.SessionDiscardedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnSessionDiscarded"))
              .build();
        }
      }
    }
    return getOnSessionDiscardedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionTakenoverRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionTakenoverMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnSessionTakenover",
      requestType = com.thpower.emqx.java.SessionTakenoverRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionTakenoverRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionTakenoverMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionTakenoverRequest, com.thpower.emqx.java.EmptySuccess> getOnSessionTakenoverMethod;
    if ((getOnSessionTakenoverMethod = HookProviderGrpc.getOnSessionTakenoverMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnSessionTakenoverMethod = HookProviderGrpc.getOnSessionTakenoverMethod) == null) {
          HookProviderGrpc.getOnSessionTakenoverMethod = getOnSessionTakenoverMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.SessionTakenoverRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnSessionTakenover"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.SessionTakenoverRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnSessionTakenover"))
              .build();
        }
      }
    }
    return getOnSessionTakenoverMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionTerminatedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionTerminatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnSessionTerminated",
      requestType = com.thpower.emqx.java.SessionTerminatedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionTerminatedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnSessionTerminatedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.SessionTerminatedRequest, com.thpower.emqx.java.EmptySuccess> getOnSessionTerminatedMethod;
    if ((getOnSessionTerminatedMethod = HookProviderGrpc.getOnSessionTerminatedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnSessionTerminatedMethod = HookProviderGrpc.getOnSessionTerminatedMethod) == null) {
          HookProviderGrpc.getOnSessionTerminatedMethod = getOnSessionTerminatedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.SessionTerminatedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnSessionTerminated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.SessionTerminatedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnSessionTerminated"))
              .build();
        }
      }
    }
    return getOnSessionTerminatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.MessagePublishRequest,
      com.thpower.emqx.java.ValuedResponse> getOnMessagePublishMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnMessagePublish",
      requestType = com.thpower.emqx.java.MessagePublishRequest.class,
      responseType = com.thpower.emqx.java.ValuedResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.MessagePublishRequest,
      com.thpower.emqx.java.ValuedResponse> getOnMessagePublishMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.MessagePublishRequest, com.thpower.emqx.java.ValuedResponse> getOnMessagePublishMethod;
    if ((getOnMessagePublishMethod = HookProviderGrpc.getOnMessagePublishMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnMessagePublishMethod = HookProviderGrpc.getOnMessagePublishMethod) == null) {
          HookProviderGrpc.getOnMessagePublishMethod = getOnMessagePublishMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.MessagePublishRequest, com.thpower.emqx.java.ValuedResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnMessagePublish"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.MessagePublishRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.ValuedResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnMessagePublish"))
              .build();
        }
      }
    }
    return getOnMessagePublishMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageDeliveredRequest,
      com.thpower.emqx.java.EmptySuccess> getOnMessageDeliveredMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnMessageDelivered",
      requestType = com.thpower.emqx.java.MessageDeliveredRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageDeliveredRequest,
      com.thpower.emqx.java.EmptySuccess> getOnMessageDeliveredMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageDeliveredRequest, com.thpower.emqx.java.EmptySuccess> getOnMessageDeliveredMethod;
    if ((getOnMessageDeliveredMethod = HookProviderGrpc.getOnMessageDeliveredMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnMessageDeliveredMethod = HookProviderGrpc.getOnMessageDeliveredMethod) == null) {
          HookProviderGrpc.getOnMessageDeliveredMethod = getOnMessageDeliveredMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.MessageDeliveredRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnMessageDelivered"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.MessageDeliveredRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnMessageDelivered"))
              .build();
        }
      }
    }
    return getOnMessageDeliveredMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageDroppedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnMessageDroppedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnMessageDropped",
      requestType = com.thpower.emqx.java.MessageDroppedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageDroppedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnMessageDroppedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageDroppedRequest, com.thpower.emqx.java.EmptySuccess> getOnMessageDroppedMethod;
    if ((getOnMessageDroppedMethod = HookProviderGrpc.getOnMessageDroppedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnMessageDroppedMethod = HookProviderGrpc.getOnMessageDroppedMethod) == null) {
          HookProviderGrpc.getOnMessageDroppedMethod = getOnMessageDroppedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.MessageDroppedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnMessageDropped"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.MessageDroppedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnMessageDropped"))
              .build();
        }
      }
    }
    return getOnMessageDroppedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageAckedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnMessageAckedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OnMessageAcked",
      requestType = com.thpower.emqx.java.MessageAckedRequest.class,
      responseType = com.thpower.emqx.java.EmptySuccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageAckedRequest,
      com.thpower.emqx.java.EmptySuccess> getOnMessageAckedMethod() {
    io.grpc.MethodDescriptor<com.thpower.emqx.java.MessageAckedRequest, com.thpower.emqx.java.EmptySuccess> getOnMessageAckedMethod;
    if ((getOnMessageAckedMethod = HookProviderGrpc.getOnMessageAckedMethod) == null) {
      synchronized (HookProviderGrpc.class) {
        if ((getOnMessageAckedMethod = HookProviderGrpc.getOnMessageAckedMethod) == null) {
          HookProviderGrpc.getOnMessageAckedMethod = getOnMessageAckedMethod =
              io.grpc.MethodDescriptor.<com.thpower.emqx.java.MessageAckedRequest, com.thpower.emqx.java.EmptySuccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OnMessageAcked"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.MessageAckedRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.thpower.emqx.java.EmptySuccess.getDefaultInstance()))
              .setSchemaDescriptor(new HookProviderMethodDescriptorSupplier("OnMessageAcked"))
              .build();
        }
      }
    }
    return getOnMessageAckedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HookProviderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HookProviderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HookProviderStub>() {
        @java.lang.Override
        public HookProviderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HookProviderStub(channel, callOptions);
        }
      };
    return HookProviderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HookProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HookProviderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HookProviderBlockingStub>() {
        @java.lang.Override
        public HookProviderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HookProviderBlockingStub(channel, callOptions);
        }
      };
    return HookProviderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HookProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HookProviderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HookProviderFutureStub>() {
        @java.lang.Override
        public HookProviderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HookProviderFutureStub(channel, callOptions);
        }
      };
    return HookProviderFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HookProviderImplBase implements io.grpc.BindableService {

    /**
     */
    public void onProviderLoaded(com.thpower.emqx.java.ProviderLoadedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.LoadedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnProviderLoadedMethod(), responseObserver);
    }

    /**
     */
    public void onProviderUnloaded(com.thpower.emqx.java.ProviderUnloadedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnProviderUnloadedMethod(), responseObserver);
    }

    /**
     */
    public void onClientConnect(com.thpower.emqx.java.ClientConnectRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientConnectMethod(), responseObserver);
    }

    /**
     */
    public void onClientConnack(com.thpower.emqx.java.ClientConnackRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientConnackMethod(), responseObserver);
    }

    /**
     */
    public void onClientConnected(com.thpower.emqx.java.ClientConnectedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientConnectedMethod(), responseObserver);
    }

    /**
     */
    public void onClientDisconnected(com.thpower.emqx.java.ClientDisconnectedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientDisconnectedMethod(), responseObserver);
    }

    /**
     */
    public void onClientAuthenticate(com.thpower.emqx.java.ClientAuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientAuthenticateMethod(), responseObserver);
    }

    /**
     */
    public void onClientAuthorize(com.thpower.emqx.java.ClientAuthorizeRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientAuthorizeMethod(), responseObserver);
    }

    /**
     */
    public void onClientSubscribe(com.thpower.emqx.java.ClientSubscribeRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientSubscribeMethod(), responseObserver);
    }

    /**
     */
    public void onClientUnsubscribe(com.thpower.emqx.java.ClientUnsubscribeRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnClientUnsubscribeMethod(), responseObserver);
    }

    /**
     */
    public void onSessionCreated(com.thpower.emqx.java.SessionCreatedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnSessionCreatedMethod(), responseObserver);
    }

    /**
     */
    public void onSessionSubscribed(com.thpower.emqx.java.SessionSubscribedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnSessionSubscribedMethod(), responseObserver);
    }

    /**
     */
    public void onSessionUnsubscribed(com.thpower.emqx.java.SessionUnsubscribedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnSessionUnsubscribedMethod(), responseObserver);
    }

    /**
     */
    public void onSessionResumed(com.thpower.emqx.java.SessionResumedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnSessionResumedMethod(), responseObserver);
    }

    /**
     */
    public void onSessionDiscarded(com.thpower.emqx.java.SessionDiscardedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnSessionDiscardedMethod(), responseObserver);
    }

    /**
     */
    public void onSessionTakenover(com.thpower.emqx.java.SessionTakenoverRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnSessionTakenoverMethod(), responseObserver);
    }

    /**
     */
    public void onSessionTerminated(com.thpower.emqx.java.SessionTerminatedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnSessionTerminatedMethod(), responseObserver);
    }

    /**
     */
    public void onMessagePublish(com.thpower.emqx.java.MessagePublishRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnMessagePublishMethod(), responseObserver);
    }

    /**
     */
    public void onMessageDelivered(com.thpower.emqx.java.MessageDeliveredRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnMessageDeliveredMethod(), responseObserver);
    }

    /**
     */
    public void onMessageDropped(com.thpower.emqx.java.MessageDroppedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnMessageDroppedMethod(), responseObserver);
    }

    /**
     */
    public void onMessageAcked(com.thpower.emqx.java.MessageAckedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOnMessageAckedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getOnProviderLoadedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ProviderLoadedRequest,
                com.thpower.emqx.java.LoadedResponse>(
                  this, METHODID_ON_PROVIDER_LOADED)))
          .addMethod(
            getOnProviderUnloadedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ProviderUnloadedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_PROVIDER_UNLOADED)))
          .addMethod(
            getOnClientConnectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientConnectRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_CLIENT_CONNECT)))
          .addMethod(
            getOnClientConnackMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientConnackRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_CLIENT_CONNACK)))
          .addMethod(
            getOnClientConnectedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientConnectedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_CLIENT_CONNECTED)))
          .addMethod(
            getOnClientDisconnectedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientDisconnectedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_CLIENT_DISCONNECTED)))
          .addMethod(
            getOnClientAuthenticateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientAuthenticateRequest,
                com.thpower.emqx.java.ValuedResponse>(
                  this, METHODID_ON_CLIENT_AUTHENTICATE)))
          .addMethod(
            getOnClientAuthorizeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientAuthorizeRequest,
                com.thpower.emqx.java.ValuedResponse>(
                  this, METHODID_ON_CLIENT_AUTHORIZE)))
          .addMethod(
            getOnClientSubscribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientSubscribeRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_CLIENT_SUBSCRIBE)))
          .addMethod(
            getOnClientUnsubscribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.ClientUnsubscribeRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_CLIENT_UNSUBSCRIBE)))
          .addMethod(
            getOnSessionCreatedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.SessionCreatedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_SESSION_CREATED)))
          .addMethod(
            getOnSessionSubscribedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.SessionSubscribedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_SESSION_SUBSCRIBED)))
          .addMethod(
            getOnSessionUnsubscribedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.SessionUnsubscribedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_SESSION_UNSUBSCRIBED)))
          .addMethod(
            getOnSessionResumedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.SessionResumedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_SESSION_RESUMED)))
          .addMethod(
            getOnSessionDiscardedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.SessionDiscardedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_SESSION_DISCARDED)))
          .addMethod(
            getOnSessionTakenoverMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.SessionTakenoverRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_SESSION_TAKENOVER)))
          .addMethod(
            getOnSessionTerminatedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.SessionTerminatedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_SESSION_TERMINATED)))
          .addMethod(
            getOnMessagePublishMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.MessagePublishRequest,
                com.thpower.emqx.java.ValuedResponse>(
                  this, METHODID_ON_MESSAGE_PUBLISH)))
          .addMethod(
            getOnMessageDeliveredMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.MessageDeliveredRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_MESSAGE_DELIVERED)))
          .addMethod(
            getOnMessageDroppedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.MessageDroppedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_MESSAGE_DROPPED)))
          .addMethod(
            getOnMessageAckedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.thpower.emqx.java.MessageAckedRequest,
                com.thpower.emqx.java.EmptySuccess>(
                  this, METHODID_ON_MESSAGE_ACKED)))
          .build();
    }
  }

  /**
   */
  public static final class HookProviderStub extends io.grpc.stub.AbstractAsyncStub<HookProviderStub> {
    private HookProviderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HookProviderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HookProviderStub(channel, callOptions);
    }

    /**
     */
    public void onProviderLoaded(com.thpower.emqx.java.ProviderLoadedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.LoadedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnProviderLoadedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onProviderUnloaded(com.thpower.emqx.java.ProviderUnloadedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnProviderUnloadedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientConnect(com.thpower.emqx.java.ClientConnectRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientConnack(com.thpower.emqx.java.ClientConnackRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientConnackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientConnected(com.thpower.emqx.java.ClientConnectedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientConnectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientDisconnected(com.thpower.emqx.java.ClientDisconnectedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientDisconnectedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientAuthenticate(com.thpower.emqx.java.ClientAuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientAuthorize(com.thpower.emqx.java.ClientAuthorizeRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientAuthorizeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientSubscribe(com.thpower.emqx.java.ClientSubscribeRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onClientUnsubscribe(com.thpower.emqx.java.ClientUnsubscribeRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnClientUnsubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onSessionCreated(com.thpower.emqx.java.SessionCreatedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnSessionCreatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onSessionSubscribed(com.thpower.emqx.java.SessionSubscribedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnSessionSubscribedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onSessionUnsubscribed(com.thpower.emqx.java.SessionUnsubscribedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnSessionUnsubscribedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onSessionResumed(com.thpower.emqx.java.SessionResumedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnSessionResumedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onSessionDiscarded(com.thpower.emqx.java.SessionDiscardedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnSessionDiscardedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onSessionTakenover(com.thpower.emqx.java.SessionTakenoverRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnSessionTakenoverMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onSessionTerminated(com.thpower.emqx.java.SessionTerminatedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnSessionTerminatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onMessagePublish(com.thpower.emqx.java.MessagePublishRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnMessagePublishMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onMessageDelivered(com.thpower.emqx.java.MessageDeliveredRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnMessageDeliveredMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onMessageDropped(com.thpower.emqx.java.MessageDroppedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnMessageDroppedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void onMessageAcked(com.thpower.emqx.java.MessageAckedRequest request,
        io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOnMessageAckedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HookProviderBlockingStub extends io.grpc.stub.AbstractBlockingStub<HookProviderBlockingStub> {
    private HookProviderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HookProviderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HookProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.thpower.emqx.java.LoadedResponse onProviderLoaded(com.thpower.emqx.java.ProviderLoadedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnProviderLoadedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onProviderUnloaded(com.thpower.emqx.java.ProviderUnloadedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnProviderUnloadedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onClientConnect(com.thpower.emqx.java.ClientConnectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientConnectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onClientConnack(com.thpower.emqx.java.ClientConnackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientConnackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onClientConnected(com.thpower.emqx.java.ClientConnectedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientConnectedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onClientDisconnected(com.thpower.emqx.java.ClientDisconnectedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientDisconnectedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.ValuedResponse onClientAuthenticate(com.thpower.emqx.java.ClientAuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.ValuedResponse onClientAuthorize(com.thpower.emqx.java.ClientAuthorizeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientAuthorizeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onClientSubscribe(com.thpower.emqx.java.ClientSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientSubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onClientUnsubscribe(com.thpower.emqx.java.ClientUnsubscribeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnClientUnsubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onSessionCreated(com.thpower.emqx.java.SessionCreatedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnSessionCreatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onSessionSubscribed(com.thpower.emqx.java.SessionSubscribedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnSessionSubscribedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onSessionUnsubscribed(com.thpower.emqx.java.SessionUnsubscribedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnSessionUnsubscribedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onSessionResumed(com.thpower.emqx.java.SessionResumedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnSessionResumedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onSessionDiscarded(com.thpower.emqx.java.SessionDiscardedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnSessionDiscardedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onSessionTakenover(com.thpower.emqx.java.SessionTakenoverRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnSessionTakenoverMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onSessionTerminated(com.thpower.emqx.java.SessionTerminatedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnSessionTerminatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.ValuedResponse onMessagePublish(com.thpower.emqx.java.MessagePublishRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnMessagePublishMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onMessageDelivered(com.thpower.emqx.java.MessageDeliveredRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnMessageDeliveredMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onMessageDropped(com.thpower.emqx.java.MessageDroppedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnMessageDroppedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.thpower.emqx.java.EmptySuccess onMessageAcked(com.thpower.emqx.java.MessageAckedRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOnMessageAckedMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HookProviderFutureStub extends io.grpc.stub.AbstractFutureStub<HookProviderFutureStub> {
    private HookProviderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HookProviderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HookProviderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.LoadedResponse> onProviderLoaded(
        com.thpower.emqx.java.ProviderLoadedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnProviderLoadedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onProviderUnloaded(
        com.thpower.emqx.java.ProviderUnloadedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnProviderUnloadedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onClientConnect(
        com.thpower.emqx.java.ClientConnectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientConnectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onClientConnack(
        com.thpower.emqx.java.ClientConnackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientConnackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onClientConnected(
        com.thpower.emqx.java.ClientConnectedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientConnectedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onClientDisconnected(
        com.thpower.emqx.java.ClientDisconnectedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientDisconnectedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.ValuedResponse> onClientAuthenticate(
        com.thpower.emqx.java.ClientAuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.ValuedResponse> onClientAuthorize(
        com.thpower.emqx.java.ClientAuthorizeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientAuthorizeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onClientSubscribe(
        com.thpower.emqx.java.ClientSubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientSubscribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onClientUnsubscribe(
        com.thpower.emqx.java.ClientUnsubscribeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnClientUnsubscribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onSessionCreated(
        com.thpower.emqx.java.SessionCreatedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnSessionCreatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onSessionSubscribed(
        com.thpower.emqx.java.SessionSubscribedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnSessionSubscribedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onSessionUnsubscribed(
        com.thpower.emqx.java.SessionUnsubscribedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnSessionUnsubscribedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onSessionResumed(
        com.thpower.emqx.java.SessionResumedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnSessionResumedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onSessionDiscarded(
        com.thpower.emqx.java.SessionDiscardedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnSessionDiscardedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onSessionTakenover(
        com.thpower.emqx.java.SessionTakenoverRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnSessionTakenoverMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onSessionTerminated(
        com.thpower.emqx.java.SessionTerminatedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnSessionTerminatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.ValuedResponse> onMessagePublish(
        com.thpower.emqx.java.MessagePublishRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnMessagePublishMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onMessageDelivered(
        com.thpower.emqx.java.MessageDeliveredRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnMessageDeliveredMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onMessageDropped(
        com.thpower.emqx.java.MessageDroppedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnMessageDroppedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.thpower.emqx.java.EmptySuccess> onMessageAcked(
        com.thpower.emqx.java.MessageAckedRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOnMessageAckedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ON_PROVIDER_LOADED = 0;
  private static final int METHODID_ON_PROVIDER_UNLOADED = 1;
  private static final int METHODID_ON_CLIENT_CONNECT = 2;
  private static final int METHODID_ON_CLIENT_CONNACK = 3;
  private static final int METHODID_ON_CLIENT_CONNECTED = 4;
  private static final int METHODID_ON_CLIENT_DISCONNECTED = 5;
  private static final int METHODID_ON_CLIENT_AUTHENTICATE = 6;
  private static final int METHODID_ON_CLIENT_AUTHORIZE = 7;
  private static final int METHODID_ON_CLIENT_SUBSCRIBE = 8;
  private static final int METHODID_ON_CLIENT_UNSUBSCRIBE = 9;
  private static final int METHODID_ON_SESSION_CREATED = 10;
  private static final int METHODID_ON_SESSION_SUBSCRIBED = 11;
  private static final int METHODID_ON_SESSION_UNSUBSCRIBED = 12;
  private static final int METHODID_ON_SESSION_RESUMED = 13;
  private static final int METHODID_ON_SESSION_DISCARDED = 14;
  private static final int METHODID_ON_SESSION_TAKENOVER = 15;
  private static final int METHODID_ON_SESSION_TERMINATED = 16;
  private static final int METHODID_ON_MESSAGE_PUBLISH = 17;
  private static final int METHODID_ON_MESSAGE_DELIVERED = 18;
  private static final int METHODID_ON_MESSAGE_DROPPED = 19;
  private static final int METHODID_ON_MESSAGE_ACKED = 20;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HookProviderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HookProviderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ON_PROVIDER_LOADED:
          serviceImpl.onProviderLoaded((com.thpower.emqx.java.ProviderLoadedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.LoadedResponse>) responseObserver);
          break;
        case METHODID_ON_PROVIDER_UNLOADED:
          serviceImpl.onProviderUnloaded((com.thpower.emqx.java.ProviderUnloadedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_CLIENT_CONNECT:
          serviceImpl.onClientConnect((com.thpower.emqx.java.ClientConnectRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_CLIENT_CONNACK:
          serviceImpl.onClientConnack((com.thpower.emqx.java.ClientConnackRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_CLIENT_CONNECTED:
          serviceImpl.onClientConnected((com.thpower.emqx.java.ClientConnectedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_CLIENT_DISCONNECTED:
          serviceImpl.onClientDisconnected((com.thpower.emqx.java.ClientDisconnectedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_CLIENT_AUTHENTICATE:
          serviceImpl.onClientAuthenticate((com.thpower.emqx.java.ClientAuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse>) responseObserver);
          break;
        case METHODID_ON_CLIENT_AUTHORIZE:
          serviceImpl.onClientAuthorize((com.thpower.emqx.java.ClientAuthorizeRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse>) responseObserver);
          break;
        case METHODID_ON_CLIENT_SUBSCRIBE:
          serviceImpl.onClientSubscribe((com.thpower.emqx.java.ClientSubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_CLIENT_UNSUBSCRIBE:
          serviceImpl.onClientUnsubscribe((com.thpower.emqx.java.ClientUnsubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_SESSION_CREATED:
          serviceImpl.onSessionCreated((com.thpower.emqx.java.SessionCreatedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_SESSION_SUBSCRIBED:
          serviceImpl.onSessionSubscribed((com.thpower.emqx.java.SessionSubscribedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_SESSION_UNSUBSCRIBED:
          serviceImpl.onSessionUnsubscribed((com.thpower.emqx.java.SessionUnsubscribedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_SESSION_RESUMED:
          serviceImpl.onSessionResumed((com.thpower.emqx.java.SessionResumedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_SESSION_DISCARDED:
          serviceImpl.onSessionDiscarded((com.thpower.emqx.java.SessionDiscardedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_SESSION_TAKENOVER:
          serviceImpl.onSessionTakenover((com.thpower.emqx.java.SessionTakenoverRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_SESSION_TERMINATED:
          serviceImpl.onSessionTerminated((com.thpower.emqx.java.SessionTerminatedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_MESSAGE_PUBLISH:
          serviceImpl.onMessagePublish((com.thpower.emqx.java.MessagePublishRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.ValuedResponse>) responseObserver);
          break;
        case METHODID_ON_MESSAGE_DELIVERED:
          serviceImpl.onMessageDelivered((com.thpower.emqx.java.MessageDeliveredRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_MESSAGE_DROPPED:
          serviceImpl.onMessageDropped((com.thpower.emqx.java.MessageDroppedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        case METHODID_ON_MESSAGE_ACKED:
          serviceImpl.onMessageAcked((com.thpower.emqx.java.MessageAckedRequest) request,
              (io.grpc.stub.StreamObserver<com.thpower.emqx.java.EmptySuccess>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HookProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HookProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.thpower.emqx.java.EmqxExHookProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HookProvider");
    }
  }

  private static final class HookProviderFileDescriptorSupplier
      extends HookProviderBaseDescriptorSupplier {
    HookProviderFileDescriptorSupplier() {}
  }

  private static final class HookProviderMethodDescriptorSupplier
      extends HookProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HookProviderMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HookProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HookProviderFileDescriptorSupplier())
              .addMethod(getOnProviderLoadedMethod())
              .addMethod(getOnProviderUnloadedMethod())
              .addMethod(getOnClientConnectMethod())
              .addMethod(getOnClientConnackMethod())
              .addMethod(getOnClientConnectedMethod())
              .addMethod(getOnClientDisconnectedMethod())
              .addMethod(getOnClientAuthenticateMethod())
              .addMethod(getOnClientAuthorizeMethod())
              .addMethod(getOnClientSubscribeMethod())
              .addMethod(getOnClientUnsubscribeMethod())
              .addMethod(getOnSessionCreatedMethod())
              .addMethod(getOnSessionSubscribedMethod())
              .addMethod(getOnSessionUnsubscribedMethod())
              .addMethod(getOnSessionResumedMethod())
              .addMethod(getOnSessionDiscardedMethod())
              .addMethod(getOnSessionTakenoverMethod())
              .addMethod(getOnSessionTerminatedMethod())
              .addMethod(getOnMessagePublishMethod())
              .addMethod(getOnMessageDeliveredMethod())
              .addMethod(getOnMessageDroppedMethod())
              .addMethod(getOnMessageAckedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
