package aprendendocucumber.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.junit.Assert;

import exceptions.FilmeSemEstoqueException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import model.Filme;
import model.NotaDeAluguel;
import model.TipoAluguel;
import service.AluguelService;
import utils.DataUtil;

public class Locadora {

	private Filme filme;
	private AluguelService serviceAluguel = new AluguelService();
	private NotaDeAluguel nota;
	private String erro;
	private TipoAluguel tipoAluguel;
	private int pontuacao;

	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int estoque) throws Throwable {
		filme = new Filme();
		filme.setEstoque(estoque);
	}

	@Dado("^que o preco do aluguel seja R\\$ (.*)$")
	public void queOPrecoDoAluguelSejaR$(double valorDoAluguel) throws Throwable {
		filme.setPrecoDoAluguel(valorDoAluguel);
	}

	@Dado("um filme")
	public void umFilme(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);

		filme = new Filme();
		filme.setEstoque(Integer.parseInt(map.get("estoque")));
		filme.setPrecoDoAluguel(Integer.parseInt(map.get("preco")));

		String tipo = map.get("tipo");
		tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
				: tipo.equals("extendido") ? TipoAluguel.EXTENDIDO : TipoAluguel.COMUM;
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
		try {
			nota = serviceAluguel.alugar(filme, tipoAluguel);
		} catch (FilmeSemEstoqueException e) {
			erro = e.getMessage();
		}
	}

	@Entao("^o preco do aluguel sera R\\$ (.*)$")
	public void oPrecoDoAluguelSeraR$(double arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPreco(), 0.0002);
	}

//	Cenário não utilizado, abaixo ha outro melhor
//	@Entao("^a data de entrega sera no da seguinte$")
//	public void aDataDeEntregaSeraNoDaSeguinte() throws Throwable {
//		Calendar cal = Calendar.getInstance();
//		cal.add(Calendar.DAY_OF_MONTH, 1);
//
//		Date dataRetorno = nota.getDataEntrega();
//		Calendar calRetorno = Calendar.getInstance();
//		calRetorno.setTime(dataRetorno);
//
//		Assert.assertEquals(cal.get(Calendar.DAY_OF_MONTH), calRetorno.get(Calendar.DAY_OF_MONTH));
//		Assert.assertEquals(cal.get(Calendar.MONTH), calRetorno.get(Calendar.MONTH));
//		Assert.assertEquals(cal.get(Calendar.YEAR), calRetorno.get(Calendar.YEAR));
//	}

	@Entao("^o estoque do filme sera (\\d+) unidades$")
	public void oEstoqueDoFilmeSeraUnidades(int arg1) throws Throwable {
		Assert.assertEquals(filme.getEstoque(), arg1);
	}

	@Entao("^nao sera possivel por falta de estoque$")
	public void naoSeraPossivelPorFaltaDeEstoque() throws Throwable {
		Assert.assertEquals("Filme sem estoque", erro);
	}

	@Dado("^que o tipo do aluguel seja (.*)$")
	public void queOTipoDoAluguelSejaExtendido(String tipo) throws Throwable {
		tipoAluguel = tipo.equals("semanal") ? TipoAluguel.SEMANAL
				: tipo.equals("extendido") ? TipoAluguel.EXTENDIDO : TipoAluguel.COMUM;
	}

	@Entao("^a data de entrega sera em (\\d+) dias?$")
	public void aDataDeEntregaSeraEmDias(int arg1) throws Throwable {
		Date dataEsperada = DataUtil.obterDataComDiferencaDeDias(arg1);
		Date dataReal = nota.getDataEntrega();

		DateFormat form = new SimpleDateFormat("dd/MM/yyyy");

		Assert.assertEquals(form.format(dataEsperada), form.format(dataReal));
	}

	@Entao("^a pontuacao recebida sera de (\\d+) pontos?$")
	public void aPontuacaoRecebidaSeraDePontos(int arg1) throws Throwable {
		pontuacao = arg1;

		Assert.assertEquals(pontuacao, nota.getPontuacao());
	}

}
