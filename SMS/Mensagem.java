public class Mensagem
{
	public String mensagem;
	public int destino, origem, codigo = -1;
	private static int cont = 0;

	public Mensagem(String m, int d, int o)
	{
		destino = d;
		origem = o;
		mensagem = m;
		codigo = ++cont;
	}
}
