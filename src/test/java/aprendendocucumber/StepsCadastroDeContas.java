package aprendendocucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsCadastroDeContas {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");
	}
}
