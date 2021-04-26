package aprendendocucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( //
		features = "src\\test\\resources\\features\\CadastroDeContas.feature", //
		glue = "", dryRun = false, //
		tags = "~@ignore", //
		plugin = { "pretty", "html:target/report-html", "json:target/report.json" }, //
		monochrome = false, //
		snippets = SnippetType.CAMELCASE //
)
public class RunnerCadastroDeContas {

}
