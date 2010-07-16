import java.util.*;

public class Zologico
{
	public static void main (String[] s)
	{
		Mamifero c1 = new Mamifero("Fay", "Canis lupos");
		Mamifero c2 = new Mamifero("Panqueca", "Canis lupos familiaris");
		Ave p = new Ave("Periquito Verde", "Brotogeris tirica");
		Reptil j = new Reptil("Jacaré", "Caiman latirostris");
		Reptil cro = new Reptil("Crocodilo", "Crocodylus porosus");

		p.adiciona_amigo(c1);
		p.adiciona_amigo(c2);
		p.adiciona_amigo(j);
		p.adiciona_amigo(cro);
		p.imprime_amigos();

		j.adiciona_amigo(c1);
		j.adiciona_amigo(c2);
		j.adiciona_amigo(cro);
		j.imprime_amigos();

		c1.adiciona_amigo(c2);
		c1.adiciona_amigo(p);
		c1.adiciona_amigo(j);
		c1.adiciona_amigo(cro);
		c1.imprime_amigos();

		c2.imprime_amigos();
		cro.imprime_amigos();
	}
}
