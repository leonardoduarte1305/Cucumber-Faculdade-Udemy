package aulasangelica.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import aulasangelica.utils.Componentes;
import io.cucumber.java.AfterStep;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ComponentesSteps {

	private Componentes componente = new Componentes();
	private WebDriver driver = new ChromeDriver();
	private String arquivo = "componentes.html";

	@AfterStep
	public void fecharBrowser() {
		driver.quit();
	}

//	@Dado("que o usuario acessou o arquivo Campo de Treinamento")
//	public void queOUsuarioAcessouOArquivoCampoDeTreinamento() {
//		componente.inicializar(arquivo);
//	}

	@Quando("o usuario digitar Batatinha")
	public void oUsuarioDigitarBatatinha() {
		componente.testeTextField();
	}

	@Entao("o resultado no campo text area deve ser Batatinha")
	public void oResultadoNoCampoTextFieldDeveSerBatatinha() {
		componente.testeTextArea();
		driver.close();
	}

	@Quando("o usuario clicar no RadioButton")
	public void oUsuarioClicarNoRadioButton() {
		componente.testeRadioButton();
	}

	@Quando("o usuario clicar no CheckBox")
	public void oUsuarioClicarNoCheckBox() {
		componente.testeCheckBox();
	}

	@Quando("o usuario selecionar um valor no elemento combo")
	public void oUsuarioSelecionarUmValorNoElementoCombo() {
		componente.selecionarValorComboEscolaridade();
	}

	@Entao("o valor aparece selecionado")
	public void ooValorApareceSelecionado() {
		componente.validarComboBoxEscolaridade();
		driver.close();
	}

	@Quando("o usuario selecionar um valor no combo")
	public void oUsuarioSelecionarUmValorNoCombo() {
		componente.selecionarValorComboPeloTextoEscolaridade();
	}

	@Entao("o valor selecionado deve ser apresentado")
	public void oValorSelecionadoDeveSerApresentado() {
		componente.validarValorComboPeloTextoEscolaridade();
		driver.close();
	}

	@Quando("o usuario selecionar Mestrado no combo")
	public void oUsuarioSelecionarMestradoNoCombo() {
		componente.selecionarMestradoNoCombo();
	}

	@Entao("o Mestrado deve estar selecionado")
	public void oMestradoDeveSerSelecionado() {
		componente.verificaSeMestradoEstaSelecionado();
		driver.close();
	}

	@Quando("o usuario selecionar Mestrado")
	public void oUsuarioSelecionarMestrado() {
		componente.selecionarMestrado();
	}

	@Entao("a opcao Mestrado deve estar selecionada")
	public void aOpcaoMestradoDeveEstarSelecionada() {
		componente.verificarSeMestradoEstaSelecionado();
	}

	@Quando("o usuario selecionar um elemento campo de multipla escolha")
	public void oUsuarioSelecionarUmElementoCampoDeMultiplaEscolha() {
		componente.selecionarComboMultiplaEscolha();
	}

	@Entao("o valor deve aparecer selecionado no elemento combobox")
	public void oValorDeveAparecerSelecionadoNoElementoCombobox() {
		componente.verificarSeOValorApareceSelecionado();
	}

	@Quando("o usuario clicar no botao Clique Me")
	public void oUsuarioClicarNoBotaoCliqueMe() {
		componente.clicarNoBotaoCliqueMe();
	}

	@Entao("o nome do botao deve ser alterado para Obrigado!")
	public void oNomeDoBotaoDeveSerAlteradoParaObrigado() {
		componente.verificarOBotaoCliqueMeAposOClique();
	}

	@Quando("o usuario clicar no botao alert")
	public void oUsuarioClicarNoBotaoAlert() {
		componente.clicarNoAlert();
	}

	@Entao("deve aparecer a mensagem de feedback Alert simples")
	public void deveAparecerAMensagemDeFeedbackAlertSimples() {
		componente.verificarMensagem();
	}

	@Quando("o usuario clicar no botao Confirm")
	public void oUsuarioClicarNoBotaoConfirm() {
		componente.clicarNoBotaoConfirm();
	}

	@Entao("deve aparecer a mensagem de feedback Confirm Simples")
	public void deveAparecerAMensagemDeFeedbackConfirmSimples() {
		componente.verificarMensagemDeConfirmSimples();
	}

	@Entao("deve clicar em Ok")
	public void deveClicarEmOk() {
		componente.clicarEmOk();
	}

	@Entao("deve aparecer a mensagem de feedback Confirmado")
	public void deveAparecerAMensagemDeFeedbackConfirmado() {
		componente.verificarMensagemDeConfirm();
	}
}
