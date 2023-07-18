package temp;

import java.util.Random;

import io.grpc.stub.StreamObserver;
import java.time.LocalDateTime;
import temperature_control.Temp;
import temperature_control.Temp.AdjustTemperatureRequest;
import temperature_control.Temp.AdjustTemperatureResponse;
import temperature_control.Temp.TemperatureReading;
import temperature_control.Temp.TemperatureRequest;
import temperature_control.TemperatureControlServiceGrpc.TemperatureControlServiceImplBase;

public class TemperatureService extends TemperatureControlServiceImplBase {

    @Override
    public void adjustTemperature(AdjustTemperatureRequest request, StreamObserver<AdjustTemperatureResponse> responseObserver) {
        String zoneId = request.getZoneId();
        float temperatureAdjustment = request.getTemperatureAdjustment();

      
        // Retrieve the current temperature for the zone (dummy data)
        float currentTemperature = 25.0f;

        // Calculate the adjusted temperature
        float adjustedTemperature = currentTemperature + temperatureAdjustment;

        // TODO: Implement the actual update mechanism based on your requirements
        // Sample response
        String responseMessage = "Temperature in zone " + zoneId + " adjusted by " + temperatureAdjustment +
                ". Current temperature: " + adjustedTemperature;
        AdjustTemperatureResponse response = AdjustTemperatureResponse.newBuilder()
                .setMessage(responseMessage)
                .build();

        // Send the response back to the client
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void setDesiredTemperature(Temp.DesiredTemperatureRequest request, StreamObserver<Temp.SetTemperatureResponse> responseObserver) {
        
    }

	@Override
	public void getTemperature(TemperatureRequest request, StreamObserver<TemperatureReading> responseObserver) {
		 String location = request.getLocation();
                 LocalDateTime currentDateTime = LocalDateTime.now();

		    // Retrieve temperature from sensors based on the location
		    float temperature = getTemperatureFromSensors(location);

		    // Create the temperature reading
		    TemperatureReading temperatureReading = TemperatureReading.newBuilder()
		            .setTemperature(temperature)
		            .setLocation("  NCI, Level3 Oriel suit")
                            .setDateTime(currentDateTime.toString())
		            .build();

		    // Send the temperature reading as the response
		    responseObserver.onNext(temperatureReading);
		    responseObserver.onCompleted();
	}
	
	private float getTemperatureFromSensors(String location) {
	    // Simulate temperature retrieval from sensors
	    Random random = new Random();
	    float temperature = random.nextFloat() * 10 + 20; // Random temperature between 20 and 30 degrees Celsius
              
           // temperature = (float) -36.02;
	    return temperature;
	}

}
