package ie.gmit.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainMessageApp {

	public static void main(String[] args) throws IOException
	{
		Formatter formatterJ = new JSONFormatter();//creates formatter
		TextFormatter formatterT = new TextFormatter();
		MessagePrinter printer = new MessagePrinter();
		String fileName = "test_msg.txt";


		Message msg = new Message("This is a message");
		int choice = 3;
		if (choice == 0)
		{
			PrintWriter writer = new PrintWriter(new FileWriter(fileName));
			printer.writeMessage(msg, formatterT ,writer);
		}
		else if (choice == 1)
		{
			PrintWriter writer = new PrintWriter(new FileWriter(fileName));
			printer.writeMessage(msg, formatterJ ,writer);
		}
		else if (choice == 2)
		{
			PrintWriter writer = new PrintWriter(System.out);
			String text = formatterT.format(msg);
			printer.writeMessage(msg, formatterJ ,writer);
			//System.out.println(text);
		}
		else if (choice == 3)
		{
			String json = formatterJ.format(msg);
			PrintWriter writer = new PrintWriter(System.out);
			printer.writeMessage(msg, formatterJ ,writer);
			//System.out.println(json);
		}
	}
}
