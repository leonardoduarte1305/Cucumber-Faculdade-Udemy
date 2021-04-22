package aprendendocucumber;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class StepsDesafioAula13 {

	@Dado("^que o ticket( especial)? eh (A.\\d{3})$")
	public void queOTicketEhAF(String arg1, String arg2) throws Throwable {
	}

//	@Dado("^que o valor da passagem eh R\\$ (\\d{1,4}),(\\d{2})$")
//	public void queOValorDaPassagemEhR$(int arg1, int arg2) throws Throwable {
//		// Validado
//	}							-> Outra forma de fazer o método abaixo.

	@Dado("^que o valor da passagem eh R\\$ (.*)$")
	public void queOValorDaPassagemEhR$(Double valor) throws Throwable {
		System.out.println(valor);
	}

	@Dado("^que o nome do passageiro eh (.{5,25})$")
	public void queONomeDoPassageiroEh(String arg1) throws Throwable {
		// Validado
	}

	@Dado("^que o telefone do passageiro eh (9\\d{3}-\\d{4})$")
	public void queOTelefoneDoPassageiroEh(String arg1) throws Throwable {
		// Validado
	}

	@Quando("^criar os steps$")
	public void criarOsSteps() throws Throwable {
		// Validado
	}

	@Entao("^o teste vai funcionar$")
	public void oTesteVaiFuncionar() throws Throwable {
		// Validado
	}
}
