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

  Cenario: Validar elemento Combo Multiplo
    Quando o usuario selecionar um elemento campo de multipla escolha
    Entao o valor deve aparecer selecionado no elemento combobox

  Cenario: Interagir com o botao
    Quando o usuario clicar no botao Clique Me
    Entao o nome do botao deve ser alterado para Obrigado!

  Cenario: Interagir com alert simples
    Quando o usuario clicar no botao alert
    Entao deve aparecer a mensagem de feedback Alert simples

  
  Cenario: Interagir com o confirm simples
    Quando o usuario clicar no botao Confirm
    Entao deve aparecer a mensagem de feedback Confirm Simples
    Entao deve clicar em Ok
    Entao deve aparecer a mensagem de feedback Confirmado
    