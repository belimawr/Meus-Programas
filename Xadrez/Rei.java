import static java.lang.Math.*;

public class Rei extends Peca
{
	Rei(String c, int xi, int yi)
	{
		cor = c;
		x = xi;
		y = yi;
	}

	public boolean move(int px, int py)
	{
		if ( abs(x-px) <= 1)
			if ( abs(y - py) <= 1)
			{
				x = px;
				y = py;
				return true;
			}
			else
				return false;
		return false;
	}
}



