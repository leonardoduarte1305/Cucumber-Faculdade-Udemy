# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Quero aprender Cucumber
  Para que eu possa automatizar critérios de aceitacao

  Cenario: Deve executar especificacao
    Dado que criei o arquivo corretamente
    Quando executa-lo
    Entao a Especificacao deve finalizar com sucesso

  Cenario: Feature do contador
    Dado que o valor do contador eh 15
    Quando eu incrementar em 3
    Entao o valor sera 18

  Cenario: Feature do contador
    Dado que o valor do contador eh 123
    Quando eu incrementar em 35
    Entao o valor sera 158

  Cenario: Deve calcular atraso no prazo de entrega
    Dado que o prazo eh dia 05/04/2021
    Quando a entrega atrasar 2 dias
    Entao a entrega sera efetuada em 07/04/2021

  Cenario: Deve calcular atraso no prazo de entrega da China
    Dado que o prazo eh dia 05/04/2021
    Quando a entrega atrasar 2 meses
    Entao a entrega sera efetuada em 05/06/2021
