using API.Protos;
using Grpc.Core;
using Grpc.Net.Client;
using Microsoft.AspNetCore.SignalR;
using SmartBuildingClient.Hubs;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using TemperatureControl;
using Zeroconf;


namespace API
{
    public class JavaCall
    {
       
        public static async Task Main(string[] args)
        {

            //GetCurrentHumidityStream("exampleZone");
            // await GetTemperatureData("Location");
            //string message = await AdjustTemperature("002",00.32f);

            // Console.WriteLine(GetTemperatureData("Location"));

         //   string location = "Your desired location"; // Replace this with the actual location
           /// await ContinuousPrintTemperatureStream(location);

        }

        //public static async Task ContinuousStreamToClients(string location, IHubContext<TemperatureHub> hubContext)
        //{
        //    try
        //    {
        //        var results = await ZeroconfResolver.ResolveAsync("_tempcontrol._tcp.local.");

        //        if (results.Count == 0)
        //        {
        //            Console.WriteLine("No services found.");
        //            return;
        //        }

        //        var service = results[0];

        //        var ipAddress = service.IPAddresses.FirstOrDefault()?.ToString();
        //        var port = jDmsServicePort.JdnsPortTemp;

        //        var channel = GrpcChannel.ForAddress($"http://{ipAddress}:{port}");
        //        var client = new TemperatureControlService.TemperatureControlServiceClient(channel);

        //        var request = new TemperatureRequest { Location = location };
        //        while (true)
        //        {
        //            using (var reply = client.GetTemperature(request))
        //            {
        //                await foreach (var temperatureReading in reply.ResponseStream.ReadAllAsync())
        //                {
        //                    // Send the temperature data to connected SignalR clients
        //                    await hubContext.Clients.All.SendAsync("UpdateTemperature",
        //                        temperatureReading.Temperature,
        //                        temperatureReading.Location,
        //                        temperatureReading.DateTime);
        //                }
        //            }

        //            // Add a delay between consecutive streams to avoid overwhelming the server
        //            await Task.Delay(1000); // 1 second delay
        //        }
        //    }
        //    catch (RpcException ex)
        //    {
        //        Console.WriteLine("RPC error occurred: " + ex.Message);
        //    }
        //    catch (Exception ex)
        //    {
        //        Console.WriteLine("An error occurred: " + ex.Message);
        //    }
        //}


        public static async Task ContinuousStreamToClients(string location, IHubContext<TemperatureHub> hubContext)
        {
            try
            {
                var results = await ZeroconfResolver.ResolveAsync("_tempcontrol._tcp.local.");

                if (results.Count == 0)
                {
                    Console.WriteLine("No services found.");
                    return;
                }

                var service = results[0];

                var ipAddress = service.IPAddresses.FirstOrDefault()?.ToString();
                var port = jDmsServicePort.JdnsPortTemp;

                var channel = GrpcChannel.ForAddress($"http://{ipAddress}:{port}");
                var client = new TemperatureControlService.TemperatureControlServiceClient(channel);

                var request = new TemperatureRequest { Location = location };

                // Start the streaming call
                using (var reply = client.GetTemperature(request))
                {
                    await foreach (var temperatureReading in reply.ResponseStream.ReadAllAsync())
                    {
                        // Send the temperature data to connected SignalR clients
                        await hubContext.Clients.All.SendAsync("UpdateTemperature",
                            temperatureReading.Temperature,
                            temperatureReading.Location,
                            temperatureReading.DateTime);
                    }
                }
            }
            catch (RpcException ex)
            {
                Console.WriteLine("RPC error occurred: " + ex.Message);
            }
            catch (Exception ex)
            {
                Console.WriteLine("An error occurred: " + ex.Message);
            }
        }








        public static async Task<string> AdjustTemperature(String zoneId, float temperatureAdjustment)
        {

            try
            {
                var results = await ZeroconfResolver.ResolveAsync("_tempcontrol._tcp.local.");

                if (results.Count == 0)
                {
                    Console.WriteLine("No services found.");
                   
                }

                var service = results[0];

                var ipAddress = service.IPAddresses.FirstOrDefault()?.ToString();
                var port = jDmsServicePort.JdnsPortTemp;

                var channel = GrpcChannel.ForAddress($"http://{ipAddress}:{port}");
                var client = new TemperatureControlService.TemperatureControlServiceClient(channel);

               var request = new AdjustTemperatureRequest { TemperatureAdjustment = temperatureAdjustment,ZoneId=zoneId };
                    AdjustTemperatureRequest objRequest = new AdjustTemperatureRequest();
                objRequest.ZoneId = zoneId;
                objRequest.TemperatureAdjustment = temperatureAdjustment;

                var reply = await client.AdjustTemperatureAsync(request);

                

                return reply.Message.ToString();


            }
            catch (RpcException ex)
            {
                Console.WriteLine("RPC error occurred: " + ex.Message);
                return ex.StackTrace;
            }
            catch (Exception ex)
            {
                Console.WriteLine("An error occurred: " + ex.Message);
                return ex.StackTrace;
            }
        }



     //private static async void GetCurrentHumidityStream(string zoneId)
     //   {

     //       try
     //       {
     //           //var results = await ZeroconfResolver.ResolveAsync("_humidity._tcp.local.");

     //           //if (results.Count == 0)
     //           //{
     //           //    Console.WriteLine("No services found.");

     //           //}

     //           //var service = results[0];

     //           var ipAddress = "172.26.80.1";
     //           var port = jDmsServicePort.JdnsPortH;

     //           var channel = GrpcChannel.ForAddress($"http://{ipAddress}:{port}");
     //           var client = new TemperatureControlService.TemperatureControlServiceClient(channel);

     //          var request = new CurrentHumidityRequest {ZoneId = zoneId };

     //           using (var call = client.GetCurrentHumidity(request))
     //           {
     //               var responseStream = call.ResponseStream;

     //               while (responseStream.MoveNext().Result)
     //               {
     //                   var response = responseStream.Current;
     //                   float currentHumidity = response.CurrentHumidity;

     //                   Console.WriteLine("Received current humidity: " + currentHumidity);
     //               }
     //           }




     //       }
     //       catch (RpcException ex)
     //       {
     //           Console.WriteLine("RPC error occurred: " + ex.Message);
     //          // return ex.StackTrace;
     //       }
     //       catch (Exception ex)
     //       {
     //           Console.WriteLine("An error occurred: " + ex.Message);
     //           //=return ex.StackTrace;
     //       }
     //   }

       





    }

}
