#language: pt
Funcionalidade: Cadastro de contas
  Como um usuario 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Contexto: 
    Dado que estou acessando a aplicacao
    Quando informo o usuario "leonardoduarte13052@gmail.com"
    E a senha "123456"
    E seleciono entrar
    Entao visualizo a pagina inicial
    Quando seleciono Contas
    E seleciono Adicionar

  @Ignore
  Cenario: Deve inserir uma conta com sucesso
    E informo a conta "Conta de Teste"
    E seleciono Salvar
    Entao a conta eh inserida com sucesso

  @Ignore
  Cenario: Nao deve inserir uma conta sem nome
    E informo a conta ""
    E seleciono Salvar
    Entao sou notificado que o nome da conta eh obrigatorio

  @Ignore
  Cenario: Nao deve inserir uma conta com nome ja existente
    E informo a conta "Conta mesmo nome"
    E seleciono Salvar
    Entao sou notificado que ja existe uma conta com esse nome

  Esquema do Cenario: Deve validar regras
    E informo a conta "<conta>"
    E seleciono Salvar
    Entao recebo uma "<mensagem>"

    Exemplos: 
      | conta            | mensagem                           |
      | Conta de Teste   | Conta adicionada com sucesso!      |
      |                  | Informe o nome da conta            |
      | Conta mesmo nome | Já existe uma conta com esse nome! |
