package aprendendocucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = false, //
		strict = false, //
		monochrome = true, //
		tags = "~@ignore", //
		plugin = "pretty", //
		snippets = SnippetType.CAMELCASE, //
		features = "src/test/resources/features/Locadora.feature") //
public class RunnerLocadora {

}
