import static java.lang.Math.*;

public class Cavalo extends Peca
{
	public Cavalo(String c, int xi, int yi)
	{
		cor = c;
		x = xi;
		y = yi;
	}

	public boolean move(int px, int py)
	{
		if ( (abs(x - px) == 2) && (abs(y - py) == 1) )
		{
			x = px;
			y = py;
			return true;
		}

		else if( (abs(y - py) == 2) && ( abs(x - px) == 1) )
		{
			x = px;
			y = py;
			return true;
		}

		else
			return false;

	}

}

