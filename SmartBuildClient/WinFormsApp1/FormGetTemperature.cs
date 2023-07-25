using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using API;

namespace WinFormsApp1
{
    public partial class FormGetTemperature : Form
    {
        //ClientClass obj = new ClientClass();
        public FormGetTemperature()
        {
            // Subscribe to the event for temperature updates
            ClientClass.OnTemperatureUpdate += TemperatureUpdateHandler;
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
           
        }

        private async Task StartTemperatureStreaming(string location)
        {
            // Start the continuous temperature stream
            await ClientClass.ContinuousPrintTemperatureStream(location);
        }

        private void TemperatureUpdateHandler(string temperatureData)
        {
            // Use Invoke to update UI controls on the main thread
            Invoke(new Action(() =>
            {
                // Update the label with the temperature data
                //label1.Text = temperatureData;

                label3.Text = temperatureData;



            }));
        }

        private void MainForm_FormClosing(object sender, FormClosingEventArgs e)
        {
            // Unsubscribe from the event when the form is closing to avoid memory leaks
            ClientClass.OnTemperatureUpdate -= TemperatureUpdateHandler;
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            string location = textBox1.Text;
            if (!string.IsNullOrWhiteSpace(location))
            {
                // Start the temperature streaming in a separate Task
                Task.Run(async () => await StartTemperatureStreaming(location));
            }
            else
            {
                MessageBox.Show("Please enter a valid location.");
            }
        }
    }
}
