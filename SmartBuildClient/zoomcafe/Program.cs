using Grpc.Core;
using Grpc.Net.Client;
using System;
using System.Linq;
using System.Threading.Tasks;
using Zeroconf;

namespace GRPCClient
    {
        class Program
        {
        static async Task Main(string[] args)
        {
            // Discover the service using Zeroconf
            var results = await ZeroconfResolver.ResolveAsync("_tempcontrol._tcp.local.");

            if (results.Count == 0)
            {
                Console.WriteLine("No services found.");
                return;
            }

            // Assume there is only one service found
            var service = results[0];
            var ipAddress = service.IPAddresses.FirstOrDefault();
            var port = service.IPAddress;

            // Create a channel to connect to the discovered server
            var channel = GrpcChannel.ForAddress($"http://{ipAddress}:{port}");

            // Create a client using the generated client code
            var client = new TemperatureControlService.TemperatureControlServiceClient(channel);

            // Make gRPC calls to the server
            try
            {
                var request = new YourGeneratedNamespace.YourRequest(); // Replace with the appropriate request message
                var response = await client.YourServiceMethodAsync(request); // Replace with the appropriate service method

                Console.WriteLine("Response received from the server: " + response.ToString());
            }
            catch (RpcException ex)
            {
                Console.WriteLine("An error occurred: " + ex.Message);
            }

            // Shutdown the channel
            await channel.ShutdownAsync();
        }
    }
    }



