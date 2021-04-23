package exceptions;

@SuppressWarnings("serial")
public class FilmeSemEstoqueException extends Exception {

	public FilmeSemEstoqueException() {
		super("Filme sem estoque");
	}
}
