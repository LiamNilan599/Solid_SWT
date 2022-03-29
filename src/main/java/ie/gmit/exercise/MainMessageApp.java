package ie.gmit.exercise;

import java.io.IOException;

public class MainMessageApp {

	public static void main(String[] args) throws IOException
	{
		Formatter formatterJ = new JSONFormatter();//creates formatter
		TextFormatter formatterT = new TextFormatter();
		MessagePrinter printer = new MessagePrinter();

		Message msg = new Message("This is a message");
		int choice = 3;
		if (choice == 0)
		{

			printer.writeMessage(msg, "test_msg.txt" , formatterT);
		}
		else if (choice == 1)
		{
			printer.writeMessage(msg, "test_msg.txt", formatterJ);
		}
		else if (choice == 2)
		{
			String text = formatterT.format(msg);
			System.out.println(text);
		}
		else if (choice == 3)
		{
			String json = formatterJ.format(msg);
			System.out.println(json);
		}
	}
}
