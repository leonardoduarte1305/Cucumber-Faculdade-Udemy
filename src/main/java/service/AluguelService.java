package service;

import exceptions.FilmeSemEstoqueException;
import model.Filme;
import model.NotaDeAluguel;
import utils.DataUtil;

public class AluguelService {

	public NotaDeAluguel alugar(Filme filme, String tipoAluguel) throws FilmeSemEstoqueException {
		if (filme.getEstoque() == 0) {
			throw new FilmeSemEstoqueException();
		}

		NotaDeAluguel nota = new NotaDeAluguel();
		filme.setEstoque(filme.getEstoque() - 1);
		nota.setTipoAluguel(tipoAluguel);

		if ("extendido".equals(tipoAluguel)) {
			nota.setPreco(filme.getPrecoDoAluguel() * 2);
			nota.setDataEntrega(DataUtil.obterDataComDiferencaDeDias(3));
			nota.setPontuacao(2);
		} else {
			nota.setPreco(filme.getPrecoDoAluguel());
			nota.setDataEntrega(DataUtil.obterDataComDiferencaDeDias(1));
			nota.setPontuacao(1);
		}

		return nota;
	}

}
