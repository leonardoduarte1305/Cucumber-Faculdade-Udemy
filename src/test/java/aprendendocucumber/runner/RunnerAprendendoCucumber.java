package aprendendocucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

//plugin = "pretty" = faz impressões no console
//monochrome = true = deixa as impressões no console bonitas
//snippets = SnippetType.CAMELCASE = escreve os nomes dos métodos de teste em CamelCase
//dryRun = true = pula todos os testes, mas valida se todos estão válidos para rodar / usado para testes demorados
//strict = false = se for colocado um novo passo no cenário este marcador dão deixa passar o teste se não estiver presente
//		o novo método de testes na classe de testes

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = false, //
		strict = false, //
		monochrome = true, //
		plugin = "pretty", //
		snippets = SnippetType.CAMELCASE, //
		features = "src/test/resources/features/AprendendoCucumber.feature", //
		glue = "src/test/java/aprendendocucumber/steps/AprendendoCucumberSteps.java") //
public class RunnerAprendendoCucumber {

}
