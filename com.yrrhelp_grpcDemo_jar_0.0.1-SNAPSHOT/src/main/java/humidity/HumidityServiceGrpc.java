package humidity;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: temp.proto")
public final class HumidityServiceGrpc {

  private HumidityServiceGrpc() {}

  public static final String SERVICE_NAME = "humidity.HumidityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<humidity.Temp.CurrentHumidityRequest,
      humidity.Temp.CurrentHumidityResponse> getGetCurrentHumidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentHumidity",
      requestType = humidity.Temp.CurrentHumidityRequest.class,
      responseType = humidity.Temp.CurrentHumidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<humidity.Temp.CurrentHumidityRequest,
      humidity.Temp.CurrentHumidityResponse> getGetCurrentHumidityMethod() {
    io.grpc.MethodDescriptor<humidity.Temp.CurrentHumidityRequest, humidity.Temp.CurrentHumidityResponse> getGetCurrentHumidityMethod;
    if ((getGetCurrentHumidityMethod = HumidityServiceGrpc.getGetCurrentHumidityMethod) == null) {
      synchronized (HumidityServiceGrpc.class) {
        if ((getGetCurrentHumidityMethod = HumidityServiceGrpc.getGetCurrentHumidityMethod) == null) {
          HumidityServiceGrpc.getGetCurrentHumidityMethod = getGetCurrentHumidityMethod = 
              io.grpc.MethodDescriptor.<humidity.Temp.CurrentHumidityRequest, humidity.Temp.CurrentHumidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "humidity.HumidityService", "GetCurrentHumidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  humidity.Temp.CurrentHumidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  humidity.Temp.CurrentHumidityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HumidityServiceMethodDescriptorSupplier("GetCurrentHumidity"))
                  .build();
          }
        }
     }
     return getGetCurrentHumidityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<humidity.Temp.AdjustHumidityRequest,
      humidity.Temp.AdjustHumidityResponse> getAdjustHumidityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustHumidity",
      requestType = humidity.Temp.AdjustHumidityRequest.class,
      responseType = humidity.Temp.AdjustHumidityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<humidity.Temp.AdjustHumidityRequest,
      humidity.Temp.AdjustHumidityResponse> getAdjustHumidityMethod() {
    io.grpc.MethodDescriptor<humidity.Temp.AdjustHumidityRequest, humidity.Temp.AdjustHumidityResponse> getAdjustHumidityMethod;
    if ((getAdjustHumidityMethod = HumidityServiceGrpc.getAdjustHumidityMethod) == null) {
      synchronized (HumidityServiceGrpc.class) {
        if ((getAdjustHumidityMethod = HumidityServiceGrpc.getAdjustHumidityMethod) == null) {
          HumidityServiceGrpc.getAdjustHumidityMethod = getAdjustHumidityMethod = 
              io.grpc.MethodDescriptor.<humidity.Temp.AdjustHumidityRequest, humidity.Temp.AdjustHumidityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "humidity.HumidityService", "AdjustHumidity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  humidity.Temp.AdjustHumidityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  humidity.Temp.AdjustHumidityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HumidityServiceMethodDescriptorSupplier("AdjustHumidity"))
                  .build();
          }
        }
     }
     return getAdjustHumidityMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HumidityServiceStub newStub(io.grpc.Channel channel) {
    return new HumidityServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HumidityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HumidityServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HumidityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HumidityServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HumidityServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the current humidity level for a specific zone
     * </pre>
     */
    public void getCurrentHumidity(humidity.Temp.CurrentHumidityRequest request,
        io.grpc.stub.StreamObserver<humidity.Temp.CurrentHumidityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentHumidityMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adjust the humidity level for a specific zone
     * </pre>
     */
    public void adjustHumidity(humidity.Temp.AdjustHumidityRequest request,
        io.grpc.stub.StreamObserver<humidity.Temp.AdjustHumidityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdjustHumidityMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentHumidityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                humidity.Temp.CurrentHumidityRequest,
                humidity.Temp.CurrentHumidityResponse>(
                  this, METHODID_GET_CURRENT_HUMIDITY)))
          .addMethod(
            getAdjustHumidityMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                humidity.Temp.AdjustHumidityRequest,
                humidity.Temp.AdjustHumidityResponse>(
                  this, METHODID_ADJUST_HUMIDITY)))
          .build();
    }
  }

  /**
   */
  public static final class HumidityServiceStub extends io.grpc.stub.AbstractStub<HumidityServiceStub> {
    private HumidityServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HumidityServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumidityServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HumidityServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current humidity level for a specific zone
     * </pre>
     */
    public void getCurrentHumidity(humidity.Temp.CurrentHumidityRequest request,
        io.grpc.stub.StreamObserver<humidity.Temp.CurrentHumidityResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrentHumidityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adjust the humidity level for a specific zone
     * </pre>
     */
    public void adjustHumidity(humidity.Temp.AdjustHumidityRequest request,
        io.grpc.stub.StreamObserver<humidity.Temp.AdjustHumidityResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAdjustHumidityMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HumidityServiceBlockingStub extends io.grpc.stub.AbstractStub<HumidityServiceBlockingStub> {
    private HumidityServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HumidityServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumidityServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HumidityServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the current humidity level for a specific zone
     * </pre>
     */
    public java.util.Iterator<humidity.Temp.CurrentHumidityResponse> getCurrentHumidity(
        humidity.Temp.CurrentHumidityRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrentHumidityMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adjust the humidity level for a specific zone
     * </pre>
     */
    public java.util.Iterator<humidity.Temp.AdjustHumidityResponse> adjustHumidity(
        humidity.Temp.AdjustHumidityRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAdjustHumidityMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HumidityServiceFutureStub extends io.grpc.stub.AbstractStub<HumidityServiceFutureStub> {
    private HumidityServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HumidityServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HumidityServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HumidityServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_CURRENT_HUMIDITY = 0;
  private static final int METHODID_ADJUST_HUMIDITY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HumidityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HumidityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_HUMIDITY:
          serviceImpl.getCurrentHumidity((humidity.Temp.CurrentHumidityRequest) request,
              (io.grpc.stub.StreamObserver<humidity.Temp.CurrentHumidityResponse>) responseObserver);
          break;
        case METHODID_ADJUST_HUMIDITY:
          serviceImpl.adjustHumidity((humidity.Temp.AdjustHumidityRequest) request,
              (io.grpc.stub.StreamObserver<humidity.Temp.AdjustHumidityResponse>) responseObserver);
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

  private static abstract class HumidityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HumidityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return humidity.Temp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HumidityService");
    }
  }

  private static final class HumidityServiceFileDescriptorSupplier
      extends HumidityServiceBaseDescriptorSupplier {
    HumidityServiceFileDescriptorSupplier() {}
  }

  private static final class HumidityServiceMethodDescriptorSupplier
      extends HumidityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HumidityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HumidityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HumidityServiceFileDescriptorSupplier())
              .addMethod(getGetCurrentHumidityMethod())
              .addMethod(getAdjustHumidityMethod())
              .build();
        }
      }
    }
    return result;
  }
}
