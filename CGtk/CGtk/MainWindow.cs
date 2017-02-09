using System;
using Gtk;

public partial class MainWindow: Gtk.Window
{	
	public MainWindow (): base (Gtk.WindowType.Toplevel)
	{
		Build ();

		Console.WriteLine ("27/18 = " + 27 / 10 + " resto = " + 27 % 10);

		buttonGoForward.Clicked += delegate {
			labelSaludo.Text = "Hola. Pon tu nombre y pulsa Adelante" + entryNombre.Text;
	};

		Table table = new Table (9, 10, true);
//		for (uint index = 0; index < 90; index++) {
//			Button button = new Button ();
//			button.Label = " " + (index + 1);
//			button.Visible = true;
//			uint row = index / 10;
//			uint colum = index % 10;
//			table.Attach (button, colum, colum + 1, row, row + 1);
//			button.Clicked += delegate {
//				Console.WriteLine ("Clicked en " + button.Label);
//			};
//		}
		for (uint row = 0; row < 9; row++) 
			for (uint column = 0; column < 10; column++){
				uint index = row * 10 + column;
			Button button = new Button ();
			button.Label = " " + (index + 1);
			button.Visible = true;
			table.Attach (button, column, column + 1, row, row + 1);
			button.Clicked += delegate {
				Console.WriteLine ("Clicked en " + button.Label);
			};
		}
//			vBoxMain.Add (button);
			//button.Clicked += OnButtonGoForwardClicked;
		table.Visible = true;
		vBoxMain.Add (table);
	}

	protected void OnDeleteEvent (object sender, DeleteEventArgs a)
	{
//		Console.WriteLine ("OnDeleteEvent");
		Application.Quit ();
		a.RetVal = true;
	}

//	protected void OnButtonGoForwardClicked (object sender, EventArgs e)
//	{
//		Button button = (Button)sender;
//		labelSaludo.Text = "Hola " + entryNombre.Text + "pulsado " + button.Label;
//	}
}
