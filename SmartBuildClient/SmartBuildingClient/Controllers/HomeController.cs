using Microsoft.AspNetCore.Mvc;
using SmartBuildingClient.Models;
using System.Diagnostics;
using API;

namespace SmartBuildingClient.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        [HttpPost]
        public async Task<IActionResult> Search(string Location)
        {

            //if (string.IsNullOrEmpty(Location))
            //{
            //    TemperatureReadingViewModel obj1 = new TemperatureReadingViewModel();
            //    return View(obj1);
            //}

            List<TemperatureReading> Temp = await ClientClass.GetTemperatureData(Location);
            TemperatureReadingViewModel obj = new TemperatureReadingViewModel();

            foreach (var item in Temp)
            {
                obj.Temperature = item.Temperature;
                obj.DateAndTime = item.DateAndTime;
                obj.Location = item.Location;
            }
            return View(obj);
        }

        public IActionResult Search()
        {
            TemperatureReadingViewModel obj1 = new TemperatureReadingViewModel();
            return View(obj1);
        }

        [HttpPost]
        public async Task<IActionResult> setTemperature(string ZoneId, float TemperatureToSet)
        {
            string response = await ClientClass.AdjustTemperature(ZoneId, TemperatureToSet);
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