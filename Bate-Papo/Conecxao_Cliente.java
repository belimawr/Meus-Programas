import java.net.*;
import java.util.*;
import java.io.*;

public class Conecxao_Cliente extends Thread
{
	private static int cont = 0;
	private int eu;
	private Socket cliente;
	private DataInputStream in;
	private DataOutputStream out;
	private Fila<Mensagem> f;
	

	Conecxao_Cliente(Socket c, Fila<Mensagem> ff)
	{
		eu = ++cont;
		f = ff;
		cliente = c;
		try
		{
			in = new DataInputStream(cliente.getInputStream());
			out = new DataOutputStream(cliente.getOutputStream());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void Escrever_Mensagem(String m) throws Exception
	{
		out.writeUTF(m);
	}

	public void run()
	{
		boolean ok = true;
		while(ok)
		{
			try
			{
				f.insere(new Mensagem(in.readUTF()));
			}
			catch(Exception e)
			{
				System.out.printf("\nCliente %d desconectou!\n", eu);
				ok = false;
			}
		}
	}
}

