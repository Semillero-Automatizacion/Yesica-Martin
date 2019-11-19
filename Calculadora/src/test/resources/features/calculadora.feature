#Author: Yesica Andrea Martin
#
@tag
Feature: Calculadora

  @tag1
  Scenario Outline: Calculadora de windows
    Given Abrir calculadora
    When Recibir primer numero <num1>
    And Elegir operador <operador>
    And Recibir segundo numero <num2>
    Then Mostrar resultado

    Examples: 
      | num1 | operador | num2 |
      | "" |"" | "" |
