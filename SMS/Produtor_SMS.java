import static java.lang.Math.*;
import java.util.*;

public class Produtor_SMS implements Runnable
{
	private FilaPC<Mensagem> f;

	Produtor_SMS(FilaPC<Mensagem> ff)
	{
		f = ff;
	}

	private Mensagem cria_sms()
	{
		int d = (int) (random()*100000000);
		int o = (int) (random()*100000000);

		return new Mensagem("Mensagem aleatória", d ,o);
	}

	private void espera()
	{
		int tempo = 600 + ((int) (800*random()));
		try
		{
			Thread.sleep(tempo);
		}
		catch(Exception e)
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
				f.insere(cria_sms());
				espera();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
