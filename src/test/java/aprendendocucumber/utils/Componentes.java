package aprendendocucumber.utils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Componentes {

	private WebDriver driver;

	public void inicializar() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void inicializar(String arquivo) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///" + System.getProperty("user.dir") + "\\htmls\\" + arquivo);
		driver.manage().window().maximize();
	}

	public void fechar() {
		driver.quit();
	}

	public void printarVersaoNavegador() {
		Assert.assertTrue(driver.toString().contains("chrome"));
	}

}
