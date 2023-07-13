/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HumdityService;

import humidity.HumidityServiceGrpc.HumidityServiceImplBase;
import humidity.Temp;
import humidity.Temp.AdjustHumidityRequest;
import humidity.Temp.AdjustHumidityResponse;
import humidity.Temp.CurrentHumidityRequest;
import humidity.Temp.CurrentHumidityResponse;
import io.grpc.stub.StreamObserver;

/**
 *
 * @author hp
 */
public class HumidityService extends HumidityServiceImplBase{

  @Override
  public void adjustHumidity(AdjustHumidityRequest request, StreamObserver<AdjustHumidityResponse> responseObserver) {
    String zoneId = request.getZoneId();
    float humidityAdjustment = request.getHumidityAdjustment();

    // Simulating server streaming by sending multiple responses
    for (int i = 0; i < 5; i++) {
      // Simulating dummy data for the response
      float adjustedHumidity = (float) (i * humidityAdjustment);

      AdjustHumidityResponse response = AdjustHumidityResponse.newBuilder()
          .setAdjustedHumidity(adjustedHumidity)
          .build();

      responseObserver.onNext(response);

      // Delaying for demonstration purposes (replace with your actual logic)
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    // Indicate that the streaming is complete
    responseObserver.onCompleted();
  }

  @Override
  public void getCurrentHumidity(CurrentHumidityRequest request, StreamObserver<CurrentHumidityResponse> responseObserver) {
    String zoneId = request.getZoneId();

    // Simulating server streaming by sending multiple responses
    for (int i = 0; i < 5; i++) {
      // Simulating dummy data for the response
      float currentHumidity = (float) (Math.random() * 100);

      CurrentHumidityResponse response = CurrentHumidityResponse.newBuilder()
          .setCurrentHumidity(currentHumidity)
          .build();

      responseObserver.onNext(response);

      // Delaying for demonstration purposes (replace with your actual logic)
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    // Indicate that the streaming is complete
    responseObserver.onCompleted();
  }
    
    
}
