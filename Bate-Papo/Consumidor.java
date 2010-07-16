import java.util.*;

public class Consumidor extends Thread
{
	private Fila<Mensagem> f;
	private ArrayList<Conecxao_Cliente> clientes;

	Consumidor(Fila<Mensagem> ff, ArrayList<Conecxao_Cliente> clientes)
	{
		f = ff;
		this.clientes = clientes;
	}

	public void run()
	{
		Mensagem m = null;
		while(1>0)
		{
			try
			{
				
				m = f.retira();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			System.out.printf("%s\n", m.getMensagem());
			for(Conecxao_Cliente c: clientes)
			{
				try
				{
					c.Escrever_Mensagem(String.format("%s\n", m.getMensagem()));
				}
				catch(Exception e)
				{
					clientes.remove(c);
				}
			}
		}
	}
}

