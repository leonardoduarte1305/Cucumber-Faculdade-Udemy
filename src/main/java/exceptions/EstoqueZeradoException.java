package exceptions;

public class EstoqueZeradoException extends Exception {

	public EstoqueZeradoException() {
		super("Estoque zerado, adicione filmes para alugar.");
	}
}
