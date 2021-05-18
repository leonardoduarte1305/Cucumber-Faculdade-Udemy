#language: pt
Funcionalidade: Acessar varios componentes html

  Contexto: 
    Dado que o usuario acessou o arquivo Campo de Treinamento

  Cenario: Validar campo TextField
    Quando o usuario digitar Batatinha
    Entao o resultado no campo text area deve ser Batatinha

  Esquema do Cenario: Validar campos
    Quando o usuario clicar no <item>
    Entao o <item> deve estar selecionado

    Exemplos: 
      | item        |
      | RadioButton |
      | CheckBox    |

  #  @Ignore
  #  Esquema do Cenario: Deve testar o campo nome
  #    E informo o nome "<nome>"
  #    E informo o sobrenome "<sobrenome>"
  #    E seleciono Cadastrar
  #    Entao recebo uma mensagem: "<mensagem>"
  #
  #    Exemplos:
  #      | nome     | sobrenome | mensagem                 |
  #      | Leopoldo |           | Sobrenome eh obrigatorio |
  #      |          | Felpudo   | Nome eh obrigatorio      |
  #      | Leonel   | Fajuto    | Sexo eh obrigatorio      |
  Cenario: Validar elemento combobox escolaridade
    Quando o usuario selecionar um valor no elemento combo
    Entao o valor aparece selecionado

  Cenario: Validar elemento combobox escolaridade
    Quando o usuario selecionar um valor no combo
    Entao o valor selecionado deve ser apresentado

  Cenario: Verificar a quantidade de itens do combo
    Quando o usuario selecionar Mestrado no combo
    Entao o Mestrado deve estar selecionado

  Cenario: Selecionar opcao Mestrado
    Quando o usuario selecionar Mestrado
    Entao a opcao Mestrado deve estar selecionada

	@Validar_elemento_combo_multiplo
  Cenario: Validar elemento Combo Multiplo
    Quando o usuario selecionar um elemento campo de multipla escolha
    Entao o valor deve aparecer selecionado no elemento combobox 
