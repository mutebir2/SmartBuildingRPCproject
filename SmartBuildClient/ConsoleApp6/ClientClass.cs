using Grpc.Net.Client;
using System;
using System.Collections.Generic;
using TemperatureControl;

namespace API
{ 
   public  class ClientClass
    {
      public  static  void Main(string[] args)
        {
            GetTemperatureData("Location");
        }

        public static List<TemperatureReading> GetTemperatureData(string location)
        {
            List<TemperatureReading> lst = new List<TemperatureReading>();
            try
            {
                var input = new TemperatureRequest { Location = location };
                var channel = GrpcChannel.ForAddress("http://localhost:5004");
                var client = new TemperatureControlService.TemperatureControlServiceClient(channel);
                var reply = client.GetTemperature(input);

                TemperatureReading obj = new TemperatureReading();
                obj.Temperature = reply.Temperature.ToString();
                obj.Location = reply.Location;
                obj.DateAndTime = reply.DateTime;

                lst.Add(obj);

               // Console.WriteLine(reply.ToString());
               // Console.ReadLine();

                return lst;
            }
            catch (Exception)
            {

                throw;
            }
            
        }
    }
}
