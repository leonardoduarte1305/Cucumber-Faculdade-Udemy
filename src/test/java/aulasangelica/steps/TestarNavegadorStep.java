package aulasangelica.steps;

import aprendendocucumber.utils.Componentes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TestarNavegadorStep {

	private Componentes componentes = new Componentes();

	@Dado("que instalei o drive")
	public void que_instalei_o() {
		componentes.inicializar();

	}

	@Quando("instancar chrome-driver")
	public void instancar_chrome_driver() {
		// Write code here that turns the phrase above into concrete actions
				throw new cucumber.api.PendingException();
	}

	@Entao("o navegador Google Chrome deve abrir")
	public void o_navegador_Google_Chrome_deve_abrir() {
		// Write code here that turns the phrase above into concrete actions
		throw new cucumber.api.PendingException();
	}
}
