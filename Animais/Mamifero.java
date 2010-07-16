public class Mamifero extends Animais
{
	private static int cont = 0;

	public Mamifero(String n, String s)
	{
		super(n,s);
	}

	public Mamifero(String n)
	{
		super(n);
	}

	public Mamifero()
	{
		super( ++cont + "° mamífero sem nome :(");
	}

	@Override
	public boolean adiciona_amigo(Animais a)
	{
		if ( (a.getClass().getName()) == "Reptil")
		{
			System.out.printf("\nMeu nome é \"%s\" e eu não faço amizade com Répteis!\n", this.nome);
			return false;
		}
		else
			super.adiciona_amigo(a);
		return true;
	}
}

