package aprendendocucumber.runners;
//plugin = "pretty" = faz impressões no console

//monochrome = true = deixa as impressões no console bonitas
//snippets = SnippetType.CAMELCASE = escreve os nomes dos métodos de teste em CamelCase
//dryRun = true = pula todos os testes, mas valida se todos estão válidos para rodar / usado para testes demorados
//strict = false = se for colocado um novo passo no cenário este marcador dão deixa passar o teste se não estiver presente
//		o novo método de testes na classe de testes

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = true, //
		monochrome = true, //
		tags = "not @Ignore", //
		plugin = "pretty", //
		snippets = SnippetType.CAMELCASE, //
		features = "src/test/resources/features/DesafioAula13.feature", //
		glue = { "aprendendocucumber.utils", "aprendendocucumber.steps" } //
) //
public class RunnerDesafioAula13 {

}
