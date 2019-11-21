#Author: Yesica Martin
@tag
Feature: Pagina despegar

  @tag1
  Scenario Outline: Buscar un vuelvo de solo ida para dos adultos y tres niños y validar el precio más barato del vuelo
    Given Ingresar pagina
    When Ingresar solo ida
    And Seleccionar destino <destino>
    And Seleccionar fecha ida <fida>
    And Seleccionar habitaciones uno <adultos><ninos><edadnino1><edadnino2><edadnino3>
    Then Validar precio mas barato

    Examples: 
      | destino  | fida | adultos | ninos | edadnino1 | edadnino2 | edadnino3 |
      | "Italia" | "29" | "2"     | "3"   | "7"       | "3"       | "5"       |

  @tag2
  Scenario Outline: Buscar un vuelo de ida y vuelta para cuatro adultos y cinco niños y validar el precio más barato del vuelo
    Given Ingresar pagina
    When Seleccionar origen <origen>
    And Seleccionar destino <destino>
    And Seleccionar fecha ida <fida>
    And Seleccionar fecha vuelta <fvuelta>
    And Seleccionar habitaciones dos <adultos><ninos><edadnino1><edadnino2><edadnino3><edadnino4>
    Then Validar precio mas barato

    Examples: 
      | origen   | destino  | fida | fvuelta | adultos | ninos | edadnino1 | edadnino2 | edadnino3 | edadnino4 |
      | "Bogota" | "Italia" | "26" | "17"    | "4"     | "4"   | "7"       | "3"       | "5"       | "6"       |
