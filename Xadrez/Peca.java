public abstract class Peca
{
	protected int x,y;
	protected String cor;

	public abstract boolean move(int px, int py);

	public String getCor()
	{
		return cor;
	}
}
