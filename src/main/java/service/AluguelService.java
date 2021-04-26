package service;

import exceptions.FilmeSemEstoqueException;
import model.Filme;
import model.NotaDeAluguel;
import model.TipoAluguel;
import utils.DataUtil;

public class AluguelService {

	public NotaDeAluguel alugar(Filme filme, TipoAluguel tipoAluguel) throws FilmeSemEstoqueException {
		if (filme.getEstoque() == 0) {
			throw new FilmeSemEstoqueException();
		}

		NotaDeAluguel nota = new NotaDeAluguel();
		filme.setEstoque(filme.getEstoque() - 1);
		nota.setTipoAluguel(tipoAluguel);

		switch (tipoAluguel) {
		case EXTENDIDO:
			nota.setPreco(filme.getPrecoDoAluguel() * 2);
			nota.setDataEntrega(DataUtil.obterDataComDiferencaDeDias(3));
			nota.setPontuacao(2);
			break;

		case SEMANAL:
			nota.setPreco(filme.getPrecoDoAluguel() * 3);
			nota.setDataEntrega(DataUtil.obterDataComDiferencaDeDias(7));
			nota.setPontuacao(3);
			break;

		case COMUM:
			nota.setPreco(filme.getPrecoDoAluguel());
			nota.setDataEntrega(DataUtil.obterDataComDiferencaDeDias(1));
			nota.setPontuacao(1);
			break;
		}

		return nota;
	}

}
