package aulasangelica.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AcessarGoogleSteps {

	private WebDriver driver;

	@Dado("que abri o navegadorGoogle Chrome")
	public void queAbriONavegadorGoogleChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Quando("acessei o site do Google")
	public void acesseiOSiteDoGoogle() {
		String text = driver.findElement(By.xpath("//div[starts-with(@class, 'gb_4')]")).getText();
		Assert.assertEquals("Fazer login", text);
	}

	@Entao("a pagina abriu")
	public void aPaginaAbriu() {
		//
	}
}
