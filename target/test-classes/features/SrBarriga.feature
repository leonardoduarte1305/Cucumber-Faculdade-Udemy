#language: pt
Funcionalidade: Cadastro de contas
  Como um usuario 
  Gostaria de cadastrar contas
  Para que eu possa distribuir meu dinheiro de uma forma mais organizada

  Cenario: Deve inserir uma conta com sucesso
    Dado que estou acessando a aplicacao
    Quando informo o usuario "leonardoduarte1305@gmail.com"
    E a senha "123456"
    E seleciono entrar
    Entao visualizo a pagina inicial
    Quando seleciono Contas
    E seleciono Adicionar
    E informo a conta "Conta de Testes"
    E seleciono Salvar
    Entao a conta eh inserida com sucesso
@Ignore
  Cenario: Nao deve inserir uma conta sem nome
    Dado que estou acessando a aplicacao
    Quando informo o usuario "leonardoduarte1305@gmail.com"
    E a senha "123456"
    E seleciono entrar
    Entao visualizo a pagina inicial
    Quando seleciono Contas
    E seleciono Adicionar
    E seleciono Salvar
    Entao sou notificar que o nome da conta eh obrigatorio
@Ignore
  Cenario: Nao deve inserir uma conta com nome ja existente
    Dado que estou acessando a aplicacao
    Quando informo o usuario "leonardoduarte1305@gmail.com"
    E a senha "123456"
    E seleciono entrar
    Entao visualizo a pagina inicial
    Quando seleciono Contas
    E seleciono Adicionar
    E informo a conta "Conta de Teste"
    E seleciono Salvar
    Entao sou notificado que ja existe uma conta com esse nome
