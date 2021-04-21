#language: pt
Funcionalidade: AcessarGoogle

  Cenário: Acesar Google
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  Esquema do Cenário: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Exemplos: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
