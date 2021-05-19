package aulasangelica.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		features = "src/test/resources/features/Componentes.feature", //
		glue = "aulasangelica.steps", //
		monochrome = true, //
		plugin = "pretty", //
		snippets = SnippetType.CAMELCASE, //
		tags = "@EmAndamento", //
		dryRun = true //
)
public class ComponentesRunner {

}
