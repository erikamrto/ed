using System;
using Gtk;

namespace Proyecto
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Application.Init ();
			Calculadora win = new Calculadora ();
			win.Show ();
			Application.Run ();
		}
	}
}
