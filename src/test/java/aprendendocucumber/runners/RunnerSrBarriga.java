package aprendendocucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = false, //
		monochrome = true, //
		plugin = { "pretty" }, // , "html:target/report-html", "json:target/report.json" }, //
		snippets = SnippetType.CAMELCASE, //
		features = "src\\test\\resources\\features\\SrBarriga.feature", //
		glue = { "aprendendocucumber.utils", "aprendendocucumber.steps" } //
) //
public class RunnerSrBarriga {

}
