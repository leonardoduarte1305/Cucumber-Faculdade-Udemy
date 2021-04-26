package aprendendocucumber.runners;

import org.junit.runner.RunWith;

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

}
