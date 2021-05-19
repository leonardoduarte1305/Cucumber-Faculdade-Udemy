package aulasangelica.utils;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Avaliacao2Componentes {

	private WebDriver driver;
	private WebElement elemento;
	private Alert alerta;
	private String sobrenome;
	private String nome;
	private String sexo;
	private WebElement span;
	private Select combo;
	private String sugestoes;
	private String comida = "";
	private String escolaridade;
	private String esporte;

	public void inicializar(String arquivo) {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/htmls/" + arquivo);
		driver.manage().window().maximize();
	}

	public void informarNome(String string) {
		elemento = driver.findElement(By.id("elementosForm:nome"));
		elemento.sendKeys(string);
		nome = string;
	}

	public void informarSobrenome(String string) {
		elemento = driver.findElement(By.id("elementosForm:sobrenome"));
		elemento.sendKeys(string);
		sobrenome = string;
	}

	public void informarSexo() {
		driver.findElement(By.id("elementosForm:sexo:0"));
	}

	public void clicarEmCadastrar() {
		driver.findElement(By.id("elementosForm:cadastrar")).click();
	}

	public void verificarMensagemDeAlertaRecebida(String string) {
		alerta = driver.switchTo().alert();
		Assert.assertEquals(string, alerta.getText());
	}

	public void informarSexoMasculino() {
		WebElement elementoSexo = driver.findElement(By.id("elementosForm:sexo:0"));
		elementoSexo.click();
		sexo = "Masculino";
	}

	public void informarSexoFeminino() {
		WebElement elementoSexo = driver.findElement(By.id("elementosForm:sexo:1"));
		elementoSexo.click();
		sexo = "Feminino"; // O problema é que ficou chumbado aqui né...
	}

	public void confirmarNomeSobrenomeSexo() {
		String confirmar;

		span = driver.findElement(By.id("descNome"));
		confirmar = "Nome: " + nome;
		Assert.assertEquals(confirmar, span.getText());

		span = driver.findElement(By.id("descSobrenome"));
		confirmar = "Sobrenome: " + sobrenome;
		Assert.assertEquals(confirmar, span.getText());

		span = driver.findElement(By.id("descSexo"));
		confirmar = "Sexo: " + sexo;
		Assert.assertEquals(confirmar, span.getText());
	}

	public void selecionarCarne() {
		elemento = driver.findElement(By.id("elementosForm:comidaFavorita:0"));
		elemento.click();
		comida = elemento.getAttribute("value");
	}

	public void selecionarEscolaridadeSuperior() {
		escolaridade = "superior";
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		combo = new Select(elemento);
		combo.selectByValue(escolaridade);

	}

	public void selecionarEsporteKarate() {
		esporte = "Karate";
		WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
		combo = new Select(elemento);
		combo.selectByVisibleText(esporte);
	}

	public void sugerir(String string) {
		sugestoes = string;
		elemento = driver.findElement(By.id("elementosForm:sugestoes"));
		elemento.sendKeys(sugestoes);
	}

	public void verificarTodasAsConfirmacoes() {
		this.confirmarNomeSobrenomeSexo();
		this.confirmarComidaEscolaridadeEsporteSugestao();
	}

	private void confirmarComidaEscolaridadeEsporteSugestao() {
		String confirmar;

		span = driver.findElement(By.id("descComida"));
		confirmar = "Comida: " + "Carne";
		Assert.assertEquals(confirmar, span.getText());

		span = driver.findElement(By.id("descEscolaridade"));
		confirmar = "Escolaridade: " + escolaridade;
		Assert.assertEquals(confirmar, span.getText());

		span = driver.findElement(By.id("descSugestoes"));
		confirmar = "Sugestoes: " + sugestoes;
		Assert.assertEquals(confirmar, span.getText());

	}

}
