public class CentralSMS
{
	private FilaPC<Mensagem> f;
	Comsumidor_SMS[] c;
	Produtor_SMS[] p;
	Thread[] tc, tp;
	private int prod, cons;

	public CentralSMS(int prod, int cons)
	{
		int i;
		this.prod = prod;
		this.cons = cons;

		f = new FilaPC<Mensagem>(100);
		c = new Comsumidor_SMS[cons];
		p = new Produtor_SMS[prod];
		tc = new Thread[cons];
		tp = new Thread[prod];

		for(i=0;i<cons;i++)
			c[i] = new Comsumidor_SMS(f);

		for(i=0;i<prod;i++)
			p[i] = new Produtor_SMS(f);

	}

	public void start()
	{
		int i;

		for(i=0;i<prod;i++)
		{
			tp[i] = new Thread(p[i]);
			tp[i].start();
		}

		for(i=0;i<cons;i++)
		{
			tc[i] = new Thread(c[i]);
			tc[i].start();
		}
	}
}

