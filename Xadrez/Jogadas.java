import java.util.Date;

public class Jogadas
{
	private Date hora_jogada;
	private int xi,yi,xf,yf;
	private Peca p;

	public Jogadas(Peca pc, int Xi, int Yi, int Xf, int Yf)
	{
		this.xi = Xi;
		this.yi = Yi;
		this.xf = Xf;
		this.yf = Yf;
		p = pc;
		hora_jogada = new Date();
	}

	public Date getHora()
	{
		return hora_jogada;
	}

	public Peca getPeca()
	{
		return p;
	}

	public int getXi()
	{
		return xi;
	}
	public int getXf()
	{
		return xf;
	}
	public int getYi()
	{
		return yi;
	}
	public int getYf()
	{
		return yf;
	}
}
