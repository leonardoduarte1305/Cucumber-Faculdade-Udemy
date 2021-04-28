package aulasangelica.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import aprendendocucumber.utils.Componentes;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ComponentesSteps {

	private Componentes componentes = new Componentes();
	private WebDriver driver = new ChromeDriver();
	private String arquivo = "componentes.html";

	@Dado("que o usuario acessou o arquivo Campo de Treinamento")
	public void queOUsuarioAcessouOArquivoCampoDeTreinamento() {
		componentes.inicializar(arquivo);

	}

	@Quando("o usuario digitar {string}")
	public void oUsuarioDigitar(String string) {
		String text = driver.findElement(By.id("elementosForm:nome")).getText();
		Assert.assertEquals(string, text);
	}

	@Entao("o resultado no campo text field deve ser {string}")
	public void oResultadoNoCampoTextFieldDeveSer(String string) {

	}
}
