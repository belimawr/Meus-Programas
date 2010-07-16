import java.io.IOException;

public class Jogada_invalida extends IOException
{
	protected String erro;

	Jogada_invalida()
	{
		erro = "Jogada Inválida!";
	}

	Jogada_invalida(String e)
	{
		erro = e;
	}

	public String toString()
	{
		return erro;
	}
}
