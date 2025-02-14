package aprendendocucumber;
//plugin = "pretty" = faz impress�es no console

//monochrome = true = deixa as impress�es no console bonitas
//snippets = SnippetType.CAMELCASE = escreve os nomes dos m�todos de teste em CamelCase
//dryRun = true = pula todos os testes, mas valida se todos est�o v�lidos para rodar / usado para testes demorados
//strict = false = se for colocado um novo passo no cen�rio este marcador d�o deixa passar o teste se n�o estiver presente
//		o novo m�todo de testes na classe de testes

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( //
		dryRun = false, //
		monochrome = true, //
		tags = "~@ignore", //
		plugin = "pretty", //
		snippets = SnippetType.CAMELCASE, //
		features = "src/test/resources/features/") //
public class RunnerDesafioAula13 {

}
