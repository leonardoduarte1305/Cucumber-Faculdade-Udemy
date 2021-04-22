package aprendendocucumber;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprendendoCucumber {

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
	}

	@Quando("^executa-lo$")
	public void executaLo() throws Throwable {
	}

	@Entao("^a Especificacao deve finalizar com sucesso$")
	public void aEspecificacaoDeveFinalizarComSucesso() throws Throwable {
	}

	// =========================================================================================================

	private int contador = 0;

	@Dado("^que o valor do contador eh (\\d+)$")
	public void queOValorDoContadorEh(int arg1) throws Throwable {
		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
		contador += arg1;
	}

	@Entao("^o valor sera (\\d+)$")
	public void oValorSera(int arg1) throws Throwable {
		Assert.assertEquals(arg1, contador);
	}

	// =========================================================================================================

//	@Dado("^que o prazo eh dia (.*)$")
//	public void queOPrazoEhDia(@Transform(DateConverterAula15.class) Date data) throws Throwable {
//		entrega = data;
//	}							-> Outra forma de fazer o método abaixo.

	@Dado("^que o prazo eh dia (\\d{2})/(\\d{2})/(\\d{4})$")
	public void queOPrazoEhDia(int dia, int mes, int ano) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
	}

	@Quando("^a entrega atrasar (\\d+) (dia|dias|mes|meses)$")
	public void aEntregaAtrasarDias(int arg1, String tempo) throws Throwable {
		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);

		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);
		}

		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);
		}

		entrega = cal.getTime();
	}

	@Entao("^a entrega sera efetuada em (\\d{2}/\\d{2}/\\d{4})$")
	public void aEntregaSerEfetuadaEm(String data) throws Throwable {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		assertEquals(data, dataFormatada);
	}

	Date entrega = new Date();
}
