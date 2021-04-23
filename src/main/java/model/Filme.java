package model;

public class Filme {

	private String nome;
	private int estoque;
	private double precoDoAluguel;

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double getPrecoDoAluguel() {
		return precoDoAluguel;
	}

	public void setPrecoDoAluguel(double precoDoAluguel) {
		this.precoDoAluguel = precoDoAluguel;
	}

	public int getEstoque() {
		return this.estoque;
	}

}
