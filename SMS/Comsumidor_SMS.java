import java.util.*;
import static java.lang.Math.*;

public class Comsumidor_SMS implements Runnable
{
	private FilaPC<Mensagem> f;

	public Comsumidor_SMS(FilaPC<Mensagem> ff)
	{
		f = ff;
	}

	private void espera()
	{
		int tempo;
		tempo = 200 + (int) (600*random());
		try
		{
			Thread.sleep(tempo);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void run()
	{
		while(true)
		{
			try
			{
				Mensagem m = f.retira();
				System.out.printf("\nCódigo: %d\nOrigem: %d\nDestino: %d\nMensagem: \"%s\"\n", m.codigo, m.origem, m.destino, m.mensagem);
				espera();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

