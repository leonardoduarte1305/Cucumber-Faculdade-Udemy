#language: pt
Funcionalidade: Acessar varios componentes html

  Contexto: 
    Dado que o usuario acessou o arquivo Campo de Treinamento

  Esquema do Cenario: Deve verificar Alertas
    Dado que o usuario informou o nome "<nome>"
    E informou o sobrenome "<sobrenome>"
    E informou o sexo <sexo>
    E selecionou Cadastrar
    Entao recebeu uma mensagem: "<mensagem>"

    Exemplos: 
      | nome     | sobrenome | sexo      | mensagem                 |
      |          | Felpudo   | Feminino  | Nome eh obrigatorio      |
      | Leopoldo |           | Masculino | Sobrenome eh obrigatorio |
      | Leonel   | Fajuto    |           | Sexo eh obrigatorio      |


  Esquema do Cenario: Deve confirmar cadastro
    Dado que o usuario informou o nome "<nome>"
    E informou o sobrenome "<sobrenome>"
    E informou o sexo <sexo>
    E selecionou Cadastrar
    Entao recebeu uma mensagem confimando nome sobrenome e sexo

    Exemplos: 
      | nome     | sobrenome | sexo      |
      | Leonidas | Falante   | Masculino |

  @EmAndamento
  Esquema do Cenario: Deve testar mais partes do formulario
    Dado que o usuario informou o nome "<nome>"
    E informou o sobrenome "<sobrenome>"
    E informou o sexo <sexo>
    E selecionou a comida Carne
    E selecionou a escolaridade Superior
    E selecionou o esporte Karate
    E sugeriu "<sugestao>"
    E selecionou Cadastrar
    Entao recebo uma mensagem com todos os dados cadastrados

    Exemplos: 
      | nome     | sobrenome | sexo      | sugestao |
      | Leocadia | Filomena  | Masculino | Topzera  |
