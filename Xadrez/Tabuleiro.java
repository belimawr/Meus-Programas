import java.util.*;

public class Tabuleiro
{
	protected ArrayList<Peca> capturadas;
	protected ArrayList<Jogadas> hist;
	protected String prox, p1, p2;
	protected Peca campo[][];

	Tabuleiro()
	{
		capturadas = new ArrayList<Peca>();
		hist = new ArrayList<Jogadas>();
		campo = new Peca[8][8];
		p1 = prox = "Branco";
		p2 = "Preto";

		campo[0][1] = new Cavalo(p1, 0, 1);
		campo[0][6] = new Cavalo(p1, 0, 6);
		campo[0][4] = new Rei(p1, 0, 4);

		campo[7][1] = new Cavalo(p2, 7, 1);
		campo[7][6] = new Cavalo(p2, 7, 6);
		campo[7][4] = new Rei(p2, 7, 4);
	}

	public void move(int xi, int yi, int xf, int yf) throws Jogada_invalida 
	{
		if ( (xi >= 0 ) && (xi < 8) && (yi >= 0) && (yi < 8) &&
		     (xf >= 0 ) && (xf < 8) && (yf >= 0) && (yf < 8) )
			if (campo[xi][yi] != null)
				if(prox == campo[xi][yi].getCor())
					if (campo[xi][yi].move(xf,yf) == true)
						if (campo[xf][yf] != null)
							if (campo[xi][yi].getCor() != campo[xf][yf].getCor())
							{
								hist.add(new Jogadas(campo[xi][yi], xi, yi, xf, yf));
								captura(xi, yi, xf, yf);
								campo[xf][yf] = campo[xi][yi];
								campo[xi][yi] = null;
								prox = (prox == p1)?p2:p1;
							}
							else
								throw new Jogada_invalida("Você não pode capturar uma peça sua!");
						else
						{
							hist.add(new Jogadas(campo[xi][yi], xi, yi, xf, yf));
							campo[xf][yf] = campo[xi][yi];
							campo[xi][yi] = null;
							prox = (prox == p1)?p2:p1;
						}


					else
						throw new Jogada_invalida("Um " + campo[xi][yi].getClass().getName() +
								" não pode se mover de (" + xi + "," + yi + ") para (" + xf + "," + yf + ")");
				else
					throw new Jogada_invalida (String.format("É a vez da cor \"%s\" jogar!", prox));
			else
				throw new Jogada_invalida("Não existe peça na posição: (" + xi + "," + yi + ")");
		else
			throw new Jogada_invalida("Uma das posições indicadas não pertence ao tabuleiro!");
	}

	private void captura(int xi, int yi, int xf, int yf)
	{
		if( campo[xf][yf] != null)
			if ( campo[xi][yi].getCor() != campo[xf][yf].getCor() )
				capturadas.add(campo[xf][yf]);
	}

	public void imprime_capturadas()
	{
		System.out.printf("\nAs peças capturadas foram:\n");

		for(Peca p: capturadas)
			if( p != null)
				System.out.printf("%s %s\n", p.getClass().getName(), p.getCor());
	}


	public void imprime_jogadas()
	{
		System.out.printf("\nAs jogadas realizadas foram:\n");
		for (Jogadas j: hist)
			System.out.print(j.getHora() + ": " + " " + j.getPeca().getClass().getName() + " " + j.getPeca().getCor() + " " + 
					"da posição (" + j.getXi() + "," + j.getYi() + ")" +
					" para a posição (" + j.getXf() + "," + j.getYf() + ")" +
					".\n");
	}

	public void imprime_campo()
	{
		int i,j;

		System.out.print("\n   ");
		for(i=0;i<8;i++)
			System.out.printf("  %d  ", i);

		for(i=0;i<8;i++)
		{
			System.out.printf("\n%d: ",i);
			for (j=0;j<8;j++)
			{
				if(campo[i][j] == null)
					System.out.print("____ ");
				else
					System.out.print(campo[i][j].getClass().getName().substring(0,2) + " " + campo[i][j].getCor().substring(0,1) + " ");
			}
		}

		System.out.print("\n");
	}
}

