
class Fila <Tipo> 
{

	private Tipo [] elementos;
	private int n_elementos;
	private int primeiro, ultimo;
	
	
	Fila (int tamaho) 
	{
		elementos = (Tipo []) new Object[tamaho];
		n_elementos = primeiro =  0;
		ultimo = -1;
	}

	public  void insere(Tipo el) throws InterruptedException 
	{
		ultimo++;
		if (ultimo == elementos.length)  ultimo = 0;
		elementos[ultimo] = el;
		n_elementos++;
	}

	public Tipo retira() throws InterruptedException  
	{
		Tipo el = elementos[primeiro];
		primeiro++;
		if (primeiro == elementos.length)  primeiro = 0;
		n_elementos--;
		return el;
	}

	public boolean cheia() 
	{
		return n_elementos == elementos.length;
	}

	public boolean vazia()
	{
		return n_elementos == 0;
	}
}
