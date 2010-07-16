import java.util.*;

public class Jogo
{
	public static void main(String[] s)
	{
		Tabuleiro t = new Tabuleiro();
		int xi = -1, yi, xf, yf, op = 0, tempo = 1500;

		Scanner sc = new Scanner(System.in);

		try
		{
			System.out.printf("\nEscolha uma opção:\n1 - Demonstração\n2 - Jogar\n3 - Sair\nOpção: ");
			op = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.printf("\nOpção inválida!\n");
		}

		if (op == 3)
			System.exit(0);

		else if (op == 2)
			while (xi != 9)
			try
			{
				System.out.printf("\nEntre a jogada da seguinte forma:\nxi yi xf yf\n\nOnde:\nxi, xf: linha inicial e final, respecvamente.");
				System.out.printf("\nyi, yf: Coluna inicial e final, respectivamente.\n\nPara terminar o jogo entre com:\"9 0 0 0\"\n\n");

				t.imprime_campo();
				System.out.printf("> ");

				xi = sc.nextInt();
				yi = sc.nextInt();
				xf = sc.nextInt();
				yf = sc.nextInt();

				t.move(xi,yi,xf,yf);
			
			}
			catch(Jogada_invalida e)
			{
				System.out.printf("\n\n******************************************************\nERRO:\n");
				System.out.println(e);
				System.out.printf("******************************************************\n\n");
			}
			catch(Exception e)
			{
				System.out.printf("\n\n******************************************************");
				System.out.printf("\nEntrada inválida! Tente novamente");
				System.out.printf("\n******************************************************\n\n");
				sc.next();
				xi = yi = xf = yf = 0;
			}
		
		else if(op == 1)
			try
			{
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(0,1,2,0);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(7,6,5,7);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(2,0,4,1);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(5,7,3,6);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(4,1,5,3);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(3,6,5,7);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(5,3,7,4);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(5,7,3,6);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(0,4,1,5);
				t.imprime_campo();
				Thread.sleep(tempo);
				t.move(3,6,1,5);
				t.imprime_campo();
				Thread.sleep(tempo);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		else
			System.out.printf("\nOpção inválida!\n");


		t.imprime_campo();
		t.imprime_jogadas();
		t.imprime_capturadas();
	}
}
