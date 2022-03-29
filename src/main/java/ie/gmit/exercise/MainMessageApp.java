package ie.gmit.exercise;

import java.io.IOException;

public class MainMessageApp {

	public static void main(String[] args) throws IOException
	{
		Formatter formatterJ = new JSONFormatter();//creates formatter
		TextFormatter formatterT = new TextFormatter();

		Message msg = new Message("This is a message");
		boolean choice = false;
		if (choice == false)
		{
			MessagePrinter printer = new MessagePrinter();
			printer.writeMessage(msg, "test_msg.txt" , formatterT);
		}
		else
		{
			MessagePrinter printer = new MessagePrinter();
			printer.writeMessage(msg, "test_msg.txt", formatterJ);
		}
	}
}
