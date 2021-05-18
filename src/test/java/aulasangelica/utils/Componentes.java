package aulasangelica.utils;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.Entao;

public class Componentes {

	private WebDriver driver;
	private Select combo;
	private List<WebElement> lista;
	private String opcao;

	public void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void inicializar(String arquivo) {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/test/resources/htmls/" + arquivo);
		driver.manage().window().maximize();
	}

	public void fechar() {
		driver.quit();
	}

	public void printarVersaoNavegador() {
		Assert.assertTrue(driver.toString().contains("chrome"));
	}

	public void testeTextField() {
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Batatinha");
		Assert.assertEquals("Batatinha", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
	}

	public void testeTextArea() {
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Batatinha \n \n Batatinha2");
		Assert.assertEquals("Batatinha \n \n Batatinha2",
				driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
	}

	public void testeRadioButton() {
		driver.findElement(By.id("elementosForm:sexo:0")).click();
//		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isEnabled());
	}

	@Entao("o RadioButton deve estar selecionado")
	public void oRadioButtonDeveEstarSelecionado() {
		Assert.assertTrue(driver.findElement(By.id("elementosForm:sexo:0")).isSelected());
		driver.quit();
	}

	public void testeCheckBox() {
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
//		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
	}

	@Entao("o CheckBox deve estar selecionado")
	public void oCheckBoxDeveEstarSelecionado() {
		Assert.assertTrue(driver.findElement(By.id("elementosForm:comidaFavorita:0")).isSelected());
		driver.quit();
	}

	public void selecionarValorComboEscolaridade() {
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		combo = new Select(elemento);
		combo.selectByIndex(5);
	}

	public void validarComboBoxEscolaridade() {
		Assert.assertEquals("Especializacao", combo.getFirstSelectedOption().getText());
		driver.quit();
	}

	public void selecionarValorComboPeloTextoEscolaridade() {
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		combo = new Select(elemento);
		combo.selectByValue("Superior");
	}

	public void validarValorComboPeloTextoEscolaridade() {
		Assert.assertEquals("Superior", combo.getFirstSelectedOption().getText());
		driver.quit();
	}

	public void selecionarMestradoNoCombo() {
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		combo = new Select(elemento);
	}

	public void verificaSeMestradoEstaSelecionado() {
		lista = combo.getOptions();
		Assert.assertEquals(8, lista.size());
	}

	public void selecionarMestrado() {
		WebElement elemento = driver.findElement(By.id("elementosForm:escolaridade"));
		combo = new Select(elemento);
		lista = combo.getOptions();

		for (WebElement e : lista) {
			if ("Mestrado".equals(e.getText())) {
				opcao = e.getText();
				break;
			}
		}
	}

	public void verificarSeMestradoEstaSelecionado() {
		Assert.assertEquals("Mestrado", opcao);
	}

	public void selecionarComboMultiplaEscolha() {
		WebElement elemento = driver.findElement(By.id("elementosForm:esportes"));
		combo = new Select(elemento);
		combo.selectByVisibleText("Futebol");
		combo.selectByValue("Karate");

	}

	public void verificarSeOValorApareceSelecionado() {
		List<WebElement> lista = combo.getAllSelectedOptions();
		Assert.assertEquals(2, lista.size());

	}
}
