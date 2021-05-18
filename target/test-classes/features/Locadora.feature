#language: pt
Funcionalidade: Gerenciamento de locadora
  Como um usuário
  Eu quero cadastrar aluguéis de filmes
  Para controlar preços e datas de entrega

  Cenario: Deve alugar filme com DataTable
    Dado um filme
      | estoque |     2 |
      | preco   |     3 |
      | tipo    | comum |
    Quando alugar
    Entao o preco do aluguel sera R$ 3
    E a data de entrega sera em 1 dia
    E o estoque do filme sera 1 unidades

  Cenario: Nao deve alugar filme sem estoque
    Dado um filme com estoque de 0 unidades
    Quando alugar
    Entao nao sera possivel por falta de estoque
    E o estoque do filme sera 0 unidades

  Esquema do Cenario: Deve dar condicoes conforme o tipo de aluguel
    Dado um filme com estoque de 2 unidades
    E que o preco do aluguel seja R$ <preco>
    E que o tipo do aluguel seja <tipo>
    Quando alugar
    Entao o preco do aluguel sera R$ <valor>
    E a data de entrega sera em <qtdDias> dias
    E a pontuacao recebida sera de <pontuacao> pontos

    Exemplos: 
      | preco | tipo      | valor | qtdDias | pontuacao |
      |     4 | extendido |     8 |       3 |         2 |
      |     4 | comum     |     4 |       1 |         1 |
      |    10 | extendido |    20 |       3 |         2 |
      |     5 | semanal   |    15 |       7 |         3 |

  Cenario: Deve dar condicoes especiais para categoria extendida
    Dado um filme com estoque de 2 unidades
    E que o preco do aluguel seja R$ 4,00
    E que o tipo do aluguel seja extendido
    Quando alugar
    Entao o preco do aluguel sera R$ 8,00
    E a data de entrega sera em 3 dias
    E a pontuacao recebida sera de 2 pontos

  Cenario: Deve alugar para categoria comum
    Dado um filme com estoque de 2 unidades
    E que o preco do aluguel seja R$ 4,00
    E que o tipo do aluguel seja comum
    Quando alugar
    Entao o preco do aluguel sera R$ 4,00
    E a data de entrega sera em 1 dia
    E a pontuacao recebida sera de 1 ponto
