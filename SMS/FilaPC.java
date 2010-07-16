import java.util.*;

public class FilaPC<Tipo> extends Fila<Tipo>
{
	public FilaPC(int t)
	{
		super(t);
	}

	public synchronized void insere(Tipo m) throws InterruptedException
	{
		while(super.cheia())
			this.wait();

		super.insere(m);
		this.notifyAll();
	}

	public synchronized Tipo retira() throws InterruptedException
	{
		Tipo m;
		while(vazia())
			this.wait();
		
		m = super.retira();
		this.notifyAll();
		return m;
	}
}
