namespace GUIDeskTop
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.btnSetTemperature = new System.Windows.Forms.Button();
            this.btngetTemperature = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // btnSetTemperature
            // 
            this.btnSetTemperature.Location = new System.Drawing.Point(209, 99);
            this.btnSetTemperature.Name = "btnSetTemperature";
            this.btnSetTemperature.Size = new System.Drawing.Size(409, 60);
            this.btnSetTemperature.TabIndex = 0;
            this.btnSetTemperature.Text = "SetTemperatue(Unary)";
            this.btnSetTemperature.UseVisualStyleBackColor = true;
            this.btnSetTemperature.Click += new System.EventHandler(this.btnSetTemperature_Click);
            // 
            // btngetTemperature
            // 
            this.btngetTemperature.Location = new System.Drawing.Point(209, 183);
            this.btngetTemperature.Name = "btngetTemperature";
            this.btngetTemperature.Size = new System.Drawing.Size(409, 60);
            this.btngetTemperature.TabIndex = 1;
            this.btngetTemperature.Text = "GetTemperature(Server Streaming)";
            this.btngetTemperature.UseVisualStyleBackColor = true;
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(209, 269);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(409, 60);
            this.button3.TabIndex = 2;
            this.button3.Text = "SetHumidity(ClientSteaming)";
            this.button3.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft YaHei UI", 28.2F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline))), System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(77, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(606, 62);
            this.label1.TabIndex = 3;
            this.label1.Text = "GRPC-SMART BUILDING";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.btngetTemperature);
            this.Controls.Add(this.btnSetTemperature);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.SizeGripStyle = System.Windows.Forms.SizeGripStyle.Hide;
            this.Text = "JavaGRPCGUI";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button btnSetTemperature;
        private System.Windows.Forms.Button btngetTemperature;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Label label1;
    }
}

