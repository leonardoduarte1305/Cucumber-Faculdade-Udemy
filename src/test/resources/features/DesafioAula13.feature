#language: pt
Funcionalidade: Tres cenarios de desafio para usar com Expressoes Regulares.

  Cenario: Deve criar steps genericos para estes passos
    Dado que o ticket eh AF345
    Dado que o valor da passagem eh R$ 230,45
    Dado que o nome do passageiro eh "Fulano da Silva"
    Dado que o telefone do passageiro eh 9999-9999
    Quando criar os steps
    Entao o teste vai funcionar

  Cenario: Deve reaproveitar os steps "Dado" do cenario anterior
    Dado que o ticket eh AB167
    Dado que o ticket especial eh AB167
    Dado que o valor da passagem eh R$ 1120,23
    Dado que o nome do passageiro eh "Cicrano de Oliveira"
    Dado que o telefone do passageiro eh 9888-8888

  @ignore
  Cenario: Deve negar todos os steps "Dado" dos cenarios anteriores
    Dado que o ticket eh CD123
    Dado que o ticket eh AG1234
    Dado que o valor da passagem eh R$ 1.1345,56
    Dado que o nome do passageiro eh "Beltrano Souza Matos de Alcântara Azevedo"
    Dado que o telefone do passageiro eh 1234-5678
    Dado que o telefone do passageiro eh 999-2223
