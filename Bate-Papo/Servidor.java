import java.util.*;
import java.net.*;

public class Servidor
{
	private int cont = 0;
	private ServerSocket servidor;
	private ArrayList<Conecxao_Cliente> clientes;
	private Fila<Mensagem> f;
	private Consumidor c;

	Servidor(int porta)
	{
		try
		{
			servidor = new ServerSocket(porta);
			clientes = new ArrayList<Conecxao_Cliente>();
			f = new Fila<Mensagem>(100);
			c = new Consumidor(f, clientes);
			c.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public void Execute()
	{
		Conecxao_Cliente s;
		Socket ss;
		while(1>0)
		{
			try
			{
				ss = servidor.accept();
				s = new Conecxao_Cliente(ss, f);
				System.out.printf("\n\nCliente %d Conectado!\n", ++cont);
				s.start();
				clientes.add(s);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
