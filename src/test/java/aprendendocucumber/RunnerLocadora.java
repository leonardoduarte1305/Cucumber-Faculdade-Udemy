package aprendendocucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = false, //
		monochrome = true, //
		publish = true, //
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, //
		snippets = SnippetType.CAMELCASE, //
		features = "src\\test\\resources\\features\\Locadora.feature") //
public class RunnerLocadora {

}
