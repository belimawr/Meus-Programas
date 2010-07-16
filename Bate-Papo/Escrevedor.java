import java.io.*;
import java.util.*;

public class Escrevedor extends Thread
{
	private DataInputStream in;

	Escrevedor(DataInputStream i)
	{
		in = i;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				System.out.printf("\n%s", in.readUTF());
			}
			catch(Exception e)
			{
				break;
			}
		}
	}
}
