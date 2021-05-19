package aulasangelica.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import aulasangelica.utils.Avaliacao2Componentes;
import io.cucumber.java.AfterStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class Avaliacao2Steps {

	private Avaliacao2Componentes componente = new Avaliacao2Componentes();
	private WebDriver driver = new ChromeDriver();
	private String arquivo = "componentes.html";

	@AfterStep
	public void fecharBrowser() {
		driver.quit();
	}

	@Dado("que o usuario acessou o arquivo Campo de Treinamento")
	public void queOUsuarioAcessouOArquivoCampoDeTreinamento() {
		componente.inicializar(arquivo);
	}

	@Dado("que o usuario informou o nome {string}")
	public void queOUsuarioInformouONome(String string) {
		componente.informarNome(string);
	}

	@Dado("informou o sobrenome {string}")
	public void informouOSobrenome(String string) {
		componente.informarSobrenome(string);
	}

	@Dado("informou o sexo Feminino")
	public void informouOSexoFeminino() {
		componente.informarSexoFeminino();
	}

	@Dado("informou o sexo Masculino")
	public void informouOSexoMasculino() {
		componente.informarSexoMasculino();
	}

	@Dado("informou o sexo ")
	public void informouOSexoSexo() {
		componente.informarSexo();
	}

	@Dado("selecionou Cadastrar")
	public void selecionouCadastrar() {
		componente.clicarEmCadastrar();
	}

	@Entao("recebeu uma mensagem: {string}")
	public void recebeuUmaMensagem(String string) {
		componente.verificarMensagemDeAlertaRecebida(string);
	}

	@Entao("recebeu uma mensagem confimando nome sobrenome e sexo")
	public void recebeuUmaMensagemConfimandoNomeSobrenomeESexo() {
		componente.confirmarNomeSobrenomeSexo();
	}

	@Dado("selecionou a comida Carne")
	public void selecionouAsComidasFrangoECarne() {
		componente.selecionarCarne();
	}

	@Dado("selecionou a escolaridade Superior")
	public void selecionouAEscolaridadeSuperior() {
		componente.selecionarEscolaridadeSuperior();
	}

	@Dado("selecionou o esporte Karate")
	public void selecionouOEsporteKarate() {
		componente.selecionarEsporteKarate();
	}

	@Dado("sugeriu {string}")
	public void sugeriu(String string) {
		componente.sugerir(string);
	}

	@Entao("recebo uma mensagem com todos os dados cadastrados")
	public void receboUmaMensagemComTodosOsDadosCadastrados() {
		componente.verificarTodasAsConfirmacoes();
	}
}
