package aulasangelica.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = false, //
		monochrome = true, //
		plugin = { "pretty" }, // , "html:target/report-html", "json:target/report.json"
		snippets = SnippetType.CAMELCASE, //
		features = "src\\test\\java\\stepdefinitions\\AcessarGoogle.feature", //
		glue = { "stepdefinitions" } //
) //
public class AcessarGoogleRunner {

}
