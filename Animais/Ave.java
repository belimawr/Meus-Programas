public class Ave extends Animais
{
	private static int cont = 0;

	public Ave(String n, String s)
	{
		super(n,s);
	}

	public Ave()
	{
		super( ++cont + "° ave sem nome :(");
	}

	public Ave(String n)
	{
		super(n);
	}
}
