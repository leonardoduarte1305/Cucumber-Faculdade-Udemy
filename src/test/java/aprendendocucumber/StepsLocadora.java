package aprendendocucumber;

import java.time.LocalDateTime;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import stepdefinitions.Filme;

public class StepsLocadora {

	Filme filme = new Filme();

	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int unidades) throws Throwable {

		filme.setEstoque(unidades);
	}

	@Dado("^que o preco do aluguel (seja|sera) R\\$ (.*)$")
	public void queOPrecoDeAluguelSejaSeraR$(double preco) throws Throwable {

		filme.setPrecoDoAluguel(preco);
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {

		filme.alugar();
	}

	@Entao("^a data de entrega sera no da seguinte$")
	public void aDataDeEntregaSeraNoDaSeguinte() throws Throwable {
		LocalDateTime amanha = LocalDateTime.now();
		amanha = amanha.plusDays(1L);

		this.filme.setDataDeEntrega(amanha);
	}

	@Entao("^o estoque do filme sera (\\d+) unidades$")
	public void oEstoqueDoFilmeSeraUnidades(int unidades) throws Throwable {

		if (this.filme.getEstoque() != unidades) {
			throw new RuntimeException();
		}
	}

	@Entao("^nao sera possivel por falta de estoque$")
	public void naoSeraPossivelPorFaltaDeEstoque() throws Throwable {
		Assert.fail("Estoque zerado, adicione filmes para alugar.");
	}

	@Dado("^que o tipo do aluguel seja extendido$")
	public void queOTipoDoAluguelSejaExtendido() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^o preco do aluguel sera R\\$ (\\d+),(\\d+)$")
	public void oPrecoDoAluguelSeraR$(int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^a data de entrega sera em (\\d+) dias$")
	public void aDataDeEntregaSeraEmDias(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Entao("^a pontuacao recebida sera de (\\d+) pontos$")
	public void aPontuacaoRecebidaSeraDePontos(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
