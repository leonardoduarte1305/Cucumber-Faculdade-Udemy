package aprendendocucumber.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class SrBarriga {

	private WebDriver driver;

	@Before
	public void antes() {
		System.out.println("Iniciando teste!");
	}

	@After(order = 1)
	public void screenShot(Scenario cenario) {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try { //|"file:///" + |
			FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "\\target\\screenshot\\" + cenario.getId() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After(order = 0)
	public void fecharBrowser() {
		driver.quit();
	}

	@Dado("que estou acessando a aplicacao")
	public void queEstouAcessandoAAplicacao() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");
	}

	@Quando("informo o usuario {string}")
	public void informoOUsuario(String string) {
		driver.findElement(By.id("email")).sendKeys(string);
	}

	@Quando("a senha {string}")
	public void aSenha(String string) {
		driver.findElement(By.name("senha")).sendKeys(string);
	}

	@Quando("seleciono entrar")
	public void selecionoEntrar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Entao("visualizo a pagina inicial")
	public void visualizoAPaginaInicial() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Bem vindo, Leonardo Duarte!", texto);
	}

	@Quando("seleciono Contas")
	public void selecionoContas() {
		driver.findElement(By.linkText("Contas")).click();
	}

	@Quando("seleciono Adicionar")
	public void selecionoAdicionar() {
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@Quando("informo a conta {string}")
	public void informoAConta(String string) {
		driver.findElement(By.name("nome")).sendKeys(string);
	}

	@Quando("seleciono Salvar")
	public void selecionoSalvar() {
		driver.findElement(By.tagName("button")).click();
	}

	@Entao("a conta eh inserida com sucesso")
	public void aContaEhInseridaComSucesso() {
		String text = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", text);
	}

	@Entao("sou notificado que o nome da conta eh obrigatorio")
	public void souNotificadoQueONomeDaContaEhObrigatorio() {
		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Informe o nome da conta", text);
	}

	@Entao("sou notificado que ja existe uma conta com esse nome")
	public void souNotificadoQueJaExisteUmaContaComEsseNome() {
		String text = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!", text);
	}

	@Entao("recebo uma {string}")
	public void receboUma(String string) {
		String text = driver.findElement(By.xpath("//div[starts-with(@class,'alert alert-')]")).getText();

		Assert.assertEquals(string, text);
	}

}
