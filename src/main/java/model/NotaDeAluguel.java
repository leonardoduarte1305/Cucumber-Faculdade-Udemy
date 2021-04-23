package model;

import java.util.Date;

public class NotaDeAluguel {

	private double preco;
	private Date dataEntrega;
	private int quantidade;
	private String tipoAluguel;
	private int pontuacao;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date date) {
		this.dataEntrega = date;
	}

	public void setTipoAluguel(String tipoAluguel) {
		this.tipoAluguel = tipoAluguel;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

}
