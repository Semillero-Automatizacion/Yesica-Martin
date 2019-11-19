#Author: Yesica Martin
#
@tag
Feature: Pagina Despegar

  @tag1_CP0010M
  Scenario Outline: Buscar un vuelo de solo ida para dos adultos y tres niños y validar el precio más barato del vuelo
    Given Ingreso a navegador
    When Seleccionar origen y destino <origen><destino>
    And Seleccionar fechas <fida><fvuelta>
    And Seleccionar habitaciones <adultos><ninos><edadnino1><edadnino2><edadnino3>
    Then Validar precio mas barato <precioBajo>

    Examples: 
      | origen   | destino  | fida | fvuelta | adultos | ninos | edadnino1 | edadnino2 | edadnino3 | precioBajo |
      | "Bogota" | "Italia" | ""   | ""      | "2"     | "3"   | "7"       | "3"       | "5"       | ""         |

  @tag2_CP0020M
  Scenario Outline: Buscar un vuelo de ida y vuelta para cuatro adultos y cinco niños y validar el precio más barato del vuelo
    Given Ingreso a navegador
    When Seleccionar origen y destino <origen><destino>
    And Seleccionar fechas <fida><fvuelta>
    And Seleccionar habitaciones <adultos><ninos><edadnino1><edadnino2><edadnino3><edadnino4><edadnino5>
    Then Validar precio mas barato <precioBajo>

    Examples: 
      | origen   | destino  | fida | fvuelta | adultos | ninos | edadnino1 | edadnino2 | edadnino3 | edadnino4 | edadnino5 | precioBajo |
      | "Bogota" | "Italia" | ""   | ""      | "2"     | "3"   | "7"       | "3"       | "5"       | "3"       | "9"       |            |

  @tag3_CP0030M
  Scenario Outline: Buscar un vuelo para tres niños dos adultos sin decidir fecha validar el precio más alto del vuelo.
    Given Ingreso a navegador
    When Seleccionar origen y destino <origen><destino>
    And Seleccionar habitaciones <adultos><ninos><edadnino1><edadnino2><edadnino3>
    Then Validar precio mas alto <precioAlto>

    Examples: 
      | origen   | destino  | adultos | ninos | edadnino1 | edadnino2 | edadnino3 | precioAlto |
      | "Bogota" | "Italia" | "2"     | "3"   | "7"       | "3"       | "5"       | ""         |
