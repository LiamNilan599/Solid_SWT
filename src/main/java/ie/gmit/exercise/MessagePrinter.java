package ie.gmit.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, String fileName , Formatter format) throws IOException
	{
		//Formatter formatter = new JSONFormatter();//creates formatter

		try(PrintWriter writer = new PrintWriter(new FileWriter(fileName)))
		{ //creates print writer
			writer.println(format.format(msg)); //formats and writes message
			writer.flush();
			writer.close();
		}
	}
}
