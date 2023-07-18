package temp;

import java.io.IOException;
import java.net.ServerSocket;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

public class GRPCTEMPServer {
    
    private static final int PORT = 5006;
    private static final String SERVICE_TYPE = "_tempcontrol._tcp.local.";
    private static final String SERVICE_NAME = "TemperatureControlService";

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
        JmDNS jmdns = null;
        try {
            // Create a JmDNS instance
            jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create(SERVICE_TYPE, SERVICE_NAME, PORT, "path=index.html");
            jmdns.registerService(serviceInfo);

            server = ServerBuilder.forPort(PORT).addService(new TemperatureService()).build();
            server.start();
            System.out.println("Temperature control server started at port " + server.getPort());
            server.awaitTermination();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                server.shutdownNow();
            }
            if (jmdns != null) {
                jmdns.unregisterAllServices();
                try {
                    jmdns.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void onError(Throwable t) {
        t.printStackTrace();
    }
}
