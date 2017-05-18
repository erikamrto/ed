using System;
using Gtk;

namespace Proyecto
{
	public partial class Calculadora: Gtk.Window
	{	
		public Calculadora (): base (Gtk.WindowType.Toplevel)
		{
			this.Build ();
		}

		protected void OnButton1Clicked (object sender, System.EventArgs e)
		{
			//Creo 2 variables de tipo int
			int valor1, valor2;

			valor1 = Convert.ToInt32 (entry1.Text);
			valor2 = Convert.ToInt32 (entry2.Text);
		
			label1.Text = (valor1 + valor2).ToString ();
		}

		protected void OnButton2Clicked (object sender, EventArgs e)
		{
			//Creo 2 variables de tipo int
			int valor1, valor2;

			valor1 = Convert.ToInt32 (entry1.Text);
			valor2 = Convert.ToInt32 (entry2.Text);

			label1.Text = (valor1 - valor2).ToString ();
		}

		protected void OnButton4Clicked (object sender, EventArgs e)
		{
			//Creo 2 variables de tipo int
			int valor1, valor2;

			valor1 = Convert.ToInt32 (entry1.Text);
			valor2 = Convert.ToInt32 (entry2.Text);

			label1.Text = (valor1 * valor2).ToString ();
		}

		protected void OnButton5Clicked (object sender, EventArgs e)
		{
			//Creo 2 variables de tipo int
			int valor1, valor2;

			valor1 = Convert.ToInt32 (entry1.Text);
			valor2 = Convert.ToInt32 (entry2.Text);

			label1.Text = (valor1 / valor2).ToString ();
		}
	}
}