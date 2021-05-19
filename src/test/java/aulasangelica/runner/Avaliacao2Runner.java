package aulasangelica.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		features = "src/test/resources/features/Avaliacao2.feature", //
		glue = "aulasangelica.steps", //
		monochrome = true, //
		plugin = "pretty", //
		snippets = SnippetType.CAMELCASE, //
		tags = "@EmAndamento", //
		dryRun = false //
)
public class Avaliacao2Runner {

}
