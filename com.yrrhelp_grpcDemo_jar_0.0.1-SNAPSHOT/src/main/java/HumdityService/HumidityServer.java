/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HumdityService;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class HumidityServer {

    private static final int PORT = 5010;
    private static final String SERVICE_TYPE = "_humidity._tcp.local.";

    public static void main(String args[]) throws InterruptedException {
        if (isPortAvailable(PORT)) {
            startServer();
        } else {
            System.out.println("Port " + PORT + " is already in use.");
        }
    }

    private static boolean isPortAvailable(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            return true; // Port is available to use
        } catch (IOException e) {
            return false; // Port is already in use
        }
    }

    private static void startServer() throws InterruptedException {
        Server server = null;
        try {
            server = ServerBuilder.forPort(PORT).addService(new HumidityService()).build();
            server.start();

            System.out.println("Temperature control server started at port " + server.getPort());

            // Register the service with JmDNS
            registerService();

            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                server.shutdownNow();
            }
        }
    }

    private static void registerService() {
        try {
            // Create JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Create service information
            ServiceInfo serviceInfo = ServiceInfo.create(SERVICE_TYPE, "Humidity Service", PORT,
                    "Humidity control service");

            // Register the service
            jmdns.registerService(serviceInfo);

            System.out.println("Service registered: " + serviceInfo);

        } catch (IOException e) 
        {
            
        }
    }

    public void onError(Throwable t) {
        t.printStackTrace();
    }
}
