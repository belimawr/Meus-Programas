import java.util.ArrayList;

public abstract class Animais
{
	protected ArrayList<Animais> lista;
	protected String nome, especie;
	private int cont = 0;

	public Animais(String n, String s)
	{
		nome = new String(n);
		especie = new String(s);
		lista = new ArrayList<Animais>();
	}

	public Animais(String n)
	{
		nome = new String(n);
		especie = "Desconhecida";
		lista = new ArrayList<Animais>();
	}

	public Animais()
	{
		nome = String.format("%d° animal sem nome :(", ++cont);
		especie = "Desconhecida";
		lista = new ArrayList<Animais>();
	}

	public void setNome(String n)
	{
		nome = new String(n);
	}

	public String getNome()
	{
		return this.nome;
	}

	public boolean adiciona_amigo(Animais a)
	{
		lista.add(a);
		System.out.printf("\nMeu nome é \"%s\" e meu novo amigo se chama \"%s\"\n", this.nome, a.nome);
		return true;
	}

	public void imprime_amigos()
	{
		if (lista.isEmpty() == true)
			System.out.printf("\nMeu nome é \"%s\", eu sou um \"%s\" da espécie \"%s\" e eu não tenho amigos :(\n\n", 
					this.nome, this.getClass().getName(), especie);
		else
		{
			System.out.printf("\nMeu nome é \"%s\", eu sou um \"%s\" da espécie \"%s\" e os meus amigos são:\n", 
					this.nome, this.getClass().getName(), especie);
			for(Animais a: lista)
				System.out.printf("\n%s",a.nome);
			System.out.printf("\n\n");
		}
	}

}

