package aprendendocucumber.runners;
//plugin = "pretty" = faz impress�es no console

//monochrome = true = deixa as impress�es no console bonitas
//snippets = SnippetType.CAMELCASE = escreve os nomes dos m�todos de teste em CamelCase
//dryRun = true = pula todos os testes, mas valida se todos est�o v�lidos para rodar / usado para testes demorados
//strict = false = se for colocado um novo passo no cen�rio este marcador d�o deixa passar o teste se n�o estiver presente
//		o novo m�todo de testes na classe de testes

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
