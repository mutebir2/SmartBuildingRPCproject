using Microsoft.AspNetCore.Mvc;
using SmartBuildingClient.Models;
using System.Diagnostics;
using API;
using Microsoft.AspNetCore.SignalR;
using SmartBuildingClient.Hubs;

namespace SmartBuildingClient.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;
        private readonly IHubContext<TemperatureHub> _hubContext;

        public HomeController(ILogger<HomeController> logger, IHubContext<TemperatureHub> hubContext)
        {
            _logger = logger;
            _hubContext = hubContext;
        }

        [HttpPost]
        public async Task<IActionResult> Search(string Location)
        {



            //List<TemperatureReading> Temp = await ClientClass.ContinuousPrintTemperatureStream(Location);
            //TemperatureReadingViewModel obj = new TemperatureReadingViewModel();

            //foreach (var item in Temp)
            //{
            //    obj.Temperature = item.Temperature;
            //    obj.DateAndTime = item.DateAndTime;
            //    obj.Location = item.Location;
            //}
            //return View(obj);

            return RedirectToAction("TemperatureData", new { location = Location });
        }


        //public async Task<IActionResult> TemperatureData(string location)
        //{
        //    // Start the continuous stream to clients
        //    await JavaCall.ContinuousStreamToClients(location, _hubContext);

        //    // Return the view where real-time updates will be displayed
        //     return  View();


        //}

        public IActionResult TemperatureData(string location)
        {
            // Start the continuous stream to clients in the background
            // Task.Run allows the stream to run independently while the action returns immediately.
            Task.Run(() => JavaCall.ContinuousStreamToClients(location, _hubContext));

            // Return the view where real-time updates will be displayed
            return View();
        }

        public IActionResult Search()
        {
            TemperatureReadingViewModel obj1 = new TemperatureReadingViewModel();
            return View(obj1);
        }

        [HttpPost]
        public async Task<IActionResult> setTemperature(string ZoneId, float TemperatureToSet)
        {
            string response = await JavaCall.AdjustTemperature(ZoneId, TemperatureToSet);
            SetTemperatureViewModel obj = new SetTemperatureViewModel();
            obj.Message = response;
            return View(obj);
        }


        public  IActionResult setTemperature()
        {
            return View();
        }




        public IActionResult index()
        {
            return View();
        }




        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}