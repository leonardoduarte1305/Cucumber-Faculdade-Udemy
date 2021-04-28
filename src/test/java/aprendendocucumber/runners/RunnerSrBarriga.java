package aprendendocucumber.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		features = "src/test/resources/features/SrBarriga.feature", //
		glue = { "aprendendocucumber.steps" }, //
		tags = "not @Ignore", //
		plugin = "pretty", // "html:target/report-html", "json:target/report.json" }, //
		monochrome = true, //
		snippets = SnippetType.CAMELCASE, //
		dryRun = false, //
		strict = false //
) //
public class RunnerSrBarriga {

	//HOOK
	@BeforeClass
	public static void resetDoBanco() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");
		driver.findElement(By.id("email")).sendKeys("leonardoduarte13052@gmail.com");
		driver.findElement(By.name("senha")).sendKeys("123456");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}
}
