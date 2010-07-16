public class Reptil extends Animais
{
	private static int cont = 0;

	public Reptil(String n, String s)
	{
		super(n,s);
	}

	public Reptil()
	{
		super( ++cont + "° réptil sem nome :(");
	}

	public Reptil(String n)
	{
		super(n);
	}
	
	@Override
	public boolean adiciona_amigo(Animais a)
	{
		 if ( (a.getClass().getName()) == "Mamifero")
		 {
			 System.out.printf("\nMeu nome é \"%s\" e eu não faço amizade com Mamiferos!\n", this.nome);
			 return false;
		 }
		 else
			 super.adiciona_amigo(a);
		 return true;
	}
}

