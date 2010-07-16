import java.util.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

public class Cliente
{
	static String nick;
	public static void main(String[] ss)
	{
		Socket s = null;
		DataInputStream in;
		DataOutputStream out = null;
		String m;
		Escrevedor e;
		
		try
		{
			nick = JOptionPane.showInputDialog("Qual o seu nick?");
			
			if (nick == null)
				nick = "Sem nick";

			s = new Socket("127.0.0.1", 2010);
			in = new DataInputStream(s.getInputStream());
			out = new DataOutputStream(s.getOutputStream());
			e = new Escrevedor(in);
			e.start();
		}
		catch(Exception eee)
		{
			System.out.printf("\nConexão recusada pelo servidor!\n");
			System.exit(1);
		}

		while(true)
		{
			try
			{
				m = JOptionPane.showInputDialog(nick + ", digite a mensagem a ser enviada:");
				if (m == null)
				{
					s.close();
					System.exit(0);
				}
				out.writeUTF("<" + nick + "> " + m);
			}
			catch(Exception eee)
			{
				System.out.printf("\n\nErro no servidor, conexão fechada!\n\n");
				System.exit(1);
			}
		}
	}
}

