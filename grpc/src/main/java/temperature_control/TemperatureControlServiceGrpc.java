package temperature_control;

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
public final class TemperatureControlServiceGrpc {

  private TemperatureControlServiceGrpc() {}

  public static final String SERVICE_NAME = "temperature_control.TemperatureControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<temperature_control.Temp.TemperatureRequest,
      temperature_control.Temp.TemperatureReading> getGetTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTemperature",
      requestType = temperature_control.Temp.TemperatureRequest.class,
      responseType = temperature_control.Temp.TemperatureReading.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<temperature_control.Temp.TemperatureRequest,
      temperature_control.Temp.TemperatureReading> getGetTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature_control.Temp.TemperatureRequest, temperature_control.Temp.TemperatureReading> getGetTemperatureMethod;
    if ((getGetTemperatureMethod = TemperatureControlServiceGrpc.getGetTemperatureMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getGetTemperatureMethod = TemperatureControlServiceGrpc.getGetTemperatureMethod) == null) {
          TemperatureControlServiceGrpc.getGetTemperatureMethod = getGetTemperatureMethod = 
              io.grpc.MethodDescriptor.<temperature_control.Temp.TemperatureRequest, temperature_control.Temp.TemperatureReading>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "temperature_control.TemperatureControlService", "GetTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature_control.Temp.TemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature_control.Temp.TemperatureReading.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("GetTemperature"))
                  .build();
          }
        }
     }
     return getGetTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<temperature_control.Temp.DesiredTemperatureRequest,
      temperature_control.Temp.SetTemperatureResponse> getSetDesiredTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetDesiredTemperature",
      requestType = temperature_control.Temp.DesiredTemperatureRequest.class,
      responseType = temperature_control.Temp.SetTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<temperature_control.Temp.DesiredTemperatureRequest,
      temperature_control.Temp.SetTemperatureResponse> getSetDesiredTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature_control.Temp.DesiredTemperatureRequest, temperature_control.Temp.SetTemperatureResponse> getSetDesiredTemperatureMethod;
    if ((getSetDesiredTemperatureMethod = TemperatureControlServiceGrpc.getSetDesiredTemperatureMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getSetDesiredTemperatureMethod = TemperatureControlServiceGrpc.getSetDesiredTemperatureMethod) == null) {
          TemperatureControlServiceGrpc.getSetDesiredTemperatureMethod = getSetDesiredTemperatureMethod = 
              io.grpc.MethodDescriptor.<temperature_control.Temp.DesiredTemperatureRequest, temperature_control.Temp.SetTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "temperature_control.TemperatureControlService", "SetDesiredTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature_control.Temp.DesiredTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature_control.Temp.SetTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("SetDesiredTemperature"))
                  .build();
          }
        }
     }
     return getSetDesiredTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<temperature_control.Temp.AdjustTemperatureRequest,
      temperature_control.Temp.AdjustTemperatureResponse> getAdjustTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AdjustTemperature",
      requestType = temperature_control.Temp.AdjustTemperatureRequest.class,
      responseType = temperature_control.Temp.AdjustTemperatureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<temperature_control.Temp.AdjustTemperatureRequest,
      temperature_control.Temp.AdjustTemperatureResponse> getAdjustTemperatureMethod() {
    io.grpc.MethodDescriptor<temperature_control.Temp.AdjustTemperatureRequest, temperature_control.Temp.AdjustTemperatureResponse> getAdjustTemperatureMethod;
    if ((getAdjustTemperatureMethod = TemperatureControlServiceGrpc.getAdjustTemperatureMethod) == null) {
      synchronized (TemperatureControlServiceGrpc.class) {
        if ((getAdjustTemperatureMethod = TemperatureControlServiceGrpc.getAdjustTemperatureMethod) == null) {
          TemperatureControlServiceGrpc.getAdjustTemperatureMethod = getAdjustTemperatureMethod = 
              io.grpc.MethodDescriptor.<temperature_control.Temp.AdjustTemperatureRequest, temperature_control.Temp.AdjustTemperatureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "temperature_control.TemperatureControlService", "AdjustTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature_control.Temp.AdjustTemperatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  temperature_control.Temp.AdjustTemperatureResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TemperatureControlServiceMethodDescriptorSupplier("AdjustTemperature"))
                  .build();
          }
        }
     }
     return getAdjustTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemperatureControlServiceStub newStub(io.grpc.Channel channel) {
    return new TemperatureControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemperatureControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TemperatureControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemperatureControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TemperatureControlServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TemperatureControlServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTemperature(temperature_control.Temp.TemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature_control.Temp.TemperatureReading> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void setDesiredTemperature(temperature_control.Temp.DesiredTemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature_control.Temp.SetTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetDesiredTemperatureMethod(), responseObserver);
    }

    /**
     */
    public void adjustTemperature(temperature_control.Temp.AdjustTemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature_control.Temp.AdjustTemperatureResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAdjustTemperatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                temperature_control.Temp.TemperatureRequest,
                temperature_control.Temp.TemperatureReading>(
                  this, METHODID_GET_TEMPERATURE)))
          .addMethod(
            getSetDesiredTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                temperature_control.Temp.DesiredTemperatureRequest,
                temperature_control.Temp.SetTemperatureResponse>(
                  this, METHODID_SET_DESIRED_TEMPERATURE)))
          .addMethod(
            getAdjustTemperatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                temperature_control.Temp.AdjustTemperatureRequest,
                temperature_control.Temp.AdjustTemperatureResponse>(
                  this, METHODID_ADJUST_TEMPERATURE)))
          .build();
    }
  }

  /**
   */
  public static final class TemperatureControlServiceStub extends io.grpc.stub.AbstractStub<TemperatureControlServiceStub> {
    private TemperatureControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTemperature(temperature_control.Temp.TemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature_control.Temp.TemperatureReading> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setDesiredTemperature(temperature_control.Temp.DesiredTemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature_control.Temp.SetTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetDesiredTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void adjustTemperature(temperature_control.Temp.AdjustTemperatureRequest request,
        io.grpc.stub.StreamObserver<temperature_control.Temp.AdjustTemperatureResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TemperatureControlServiceBlockingStub extends io.grpc.stub.AbstractStub<TemperatureControlServiceBlockingStub> {
    private TemperatureControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public temperature_control.Temp.TemperatureReading getTemperature(temperature_control.Temp.TemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public temperature_control.Temp.SetTemperatureResponse setDesiredTemperature(temperature_control.Temp.DesiredTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetDesiredTemperatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public temperature_control.Temp.AdjustTemperatureResponse adjustTemperature(temperature_control.Temp.AdjustTemperatureRequest request) {
      return blockingUnaryCall(
          getChannel(), getAdjustTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TemperatureControlServiceFutureStub extends io.grpc.stub.AbstractStub<TemperatureControlServiceFutureStub> {
    private TemperatureControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TemperatureControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemperatureControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TemperatureControlServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<temperature_control.Temp.TemperatureReading> getTemperature(
        temperature_control.Temp.TemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<temperature_control.Temp.SetTemperatureResponse> setDesiredTemperature(
        temperature_control.Temp.DesiredTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetDesiredTemperatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<temperature_control.Temp.AdjustTemperatureResponse> adjustTemperature(
        temperature_control.Temp.AdjustTemperatureRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAdjustTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEMPERATURE = 0;
  private static final int METHODID_SET_DESIRED_TEMPERATURE = 1;
  private static final int METHODID_ADJUST_TEMPERATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TemperatureControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TemperatureControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEMPERATURE:
          serviceImpl.getTemperature((temperature_control.Temp.TemperatureRequest) request,
              (io.grpc.stub.StreamObserver<temperature_control.Temp.TemperatureReading>) responseObserver);
          break;
        case METHODID_SET_DESIRED_TEMPERATURE:
          serviceImpl.setDesiredTemperature((temperature_control.Temp.DesiredTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<temperature_control.Temp.SetTemperatureResponse>) responseObserver);
          break;
        case METHODID_ADJUST_TEMPERATURE:
          serviceImpl.adjustTemperature((temperature_control.Temp.AdjustTemperatureRequest) request,
              (io.grpc.stub.StreamObserver<temperature_control.Temp.AdjustTemperatureResponse>) responseObserver);
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

  private static abstract class TemperatureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemperatureControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return temperature_control.Temp.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TemperatureControlService");
    }
  }

  private static final class TemperatureControlServiceFileDescriptorSupplier
      extends TemperatureControlServiceBaseDescriptorSupplier {
    TemperatureControlServiceFileDescriptorSupplier() {}
  }

  private static final class TemperatureControlServiceMethodDescriptorSupplier
      extends TemperatureControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TemperatureControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TemperatureControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemperatureControlServiceFileDescriptorSupplier())
              .addMethod(getGetTemperatureMethod())
              .addMethod(getSetDesiredTemperatureMethod())
              .addMethod(getAdjustTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
