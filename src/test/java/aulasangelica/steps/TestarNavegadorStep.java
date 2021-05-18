package aulasangelica.steps;

import aulasangelica.utils.Componentes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class TestarNavegadorStep {

	private Componentes componentes = new Componentes();

	@Dado("que instalei o drive")
	public void queInstaleiODrive() {
	}

	@Quando("instancar chrome-driver")
	public void instancarChromeDriver() {
		componentes.inicializar();
	}

	@Entao("o navegador Google Chrome deve abrir")
	public void oNavegadorGoogleChromeDeveAbrir() {
		componentes.fechar();
	}
}
