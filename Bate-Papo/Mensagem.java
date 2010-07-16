import java.util.*;

public class Mensagem
{
	private String mensagem;
	private Date data;

	Mensagem(String m)
	{
		mensagem = new String(m);
		data = new Date();
	}

	public String getMensagem()
	{
		return String.format("[%d:%d:%d] %s", data.getHours(), data.getMinutes(), data.getSeconds(), mensagem);
	}
}
