package stepdefinitions;

import java.time.LocalDateTime;

import exceptions.EstoqueZeradoException;

public class Filme {

	private String nome;
	private int estoque;
	private double precoDoAluguel;
	private LocalDateTime dataDeAluguel;
	private LocalDateTime dataDeEntrega;
	private TipoAluguel tipoDoAluguel;

	public Filme() {
	}

	public Filme(String nome, int estoque, double precoDoAluguel, LocalDateTime dataDeAluguel,
			LocalDateTime dataDeEntrega, TipoAluguel tipoDoAluguel) {
		this.nome = nome;
		this.estoque = estoque;
		this.precoDoAluguel = precoDoAluguel;
		this.dataDeAluguel = dataDeAluguel;
		this.dataDeEntrega = dataDeEntrega;
		this.tipoDoAluguel = tipoDoAluguel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPrecoDoAluguel() {
		return precoDoAluguel;
	}

	public void setPrecoDoAluguel(double precoDoAluguel) {
		this.precoDoAluguel = precoDoAluguel;
	}

	public LocalDateTime getDataDeAluguel() {
		return dataDeAluguel;
	}

	public void setDataDeAluguel(LocalDateTime dataDeAluguel) {
		this.dataDeAluguel = dataDeAluguel;
	}

	public LocalDateTime getDataDeEntrega() {
		return dataDeEntrega;
	}

	public void setDataDeEntrega(LocalDateTime dataDeEntrega) {
		this.dataDeEntrega = dataDeEntrega;
	}

	public TipoAluguel getTipoDoAluguel() {
		return tipoDoAluguel;
	}

	public void setTipoDoAluguel(TipoAluguel tipoDoAluguel) {
		this.tipoDoAluguel = tipoDoAluguel;
	}

	public void alugar() throws EstoqueZeradoException {
		if (estoque == 0) {
			throw new EstoqueZeradoException();
		}

		estoque -= 1;

	}

}
