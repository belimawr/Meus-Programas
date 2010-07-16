import java.util.*;

public class Testes_SMS
{
	public static void main(String[] s)
	{
		int p,c;
		Scanner sc = new Scanner(System.in);

		System.out.printf("\nQuantos produtores devo cirar?\n>");
		p = sc.nextInt();
		System.out.printf("\nQuantos consumidores devo criar?\n>");
		c = sc.nextInt();

		CentralSMS central = new CentralSMS(p,c);
		central.start();
	}
}
