#language: pt
Funcionalidade: Gerenciamento de locadora
  Como um usuário
  Eu quero cadastrar aluguéis de filmes
  Para controlar preços e datas de entrega

  Cenario: Deve alugar filme com sucesso
    Dado um filme com estoque de 2 unidades
    E que o preco de aluguel seja R$ 3,00
    Quando alugar
    Entao o preco do qluguel sera R$ 3,00
    E a data de entrega sera no da seguinte
    E o estoque do filme será 1 unidade

  Cenario: Nao deve alugar filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Entao nao sera possivel por falta de estoque
    E o estoque do filme sera 0 unidades

  Cenario: Deve dar condicoes especiais para categoria extendida
    Dado um filme com estoque de 2 unidades
    E que o preco do aluguel seja R$ 4,00
    E que o tipo do aluguel seja extendido
    Quando alugar
    Entao o preco do aluguel sera R$ 8,00
    E a data de entrega sera em 3 dias
    E a pontuacao recebida sera de 2 pontos
