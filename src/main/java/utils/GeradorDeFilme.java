package utils;

import java.time.LocalDateTime;

import stepdefinitions.Filme;
import stepdefinitions.TipoAluguel;

public class GeradorDeFilme {

	private Filme filme = new Filme();

	public GeradorDeFilme comNome(String nome) {
		this.filme.setDataDeAluguel(LocalDateTime.now());
		this.filme.setNome(nome);
		return this;
	}

	public GeradorDeFilme comEstoque(int estoque) {
		this.filme.setEstoque(estoque);
		return this;
	}

	public GeradorDeFilme comPrecoDeAlugel(double preco) {
		this.filme.setPrecoDoAluguel(preco);
		return this;
	}

	public GeradorDeFilme comDataDeEntrega(LocalDateTime dataDeEntrega) {
		this.filme.setDataDeEntrega(dataDeEntrega);
		return this;
	}

	public GeradorDeFilme tipoDeAluguel(TipoAluguel tipo) {
		this.filme.setTipoDoAluguel(tipo);
		return this;
	}

	public Filme gera() {
		return this.filme;
	}

}
