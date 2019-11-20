#Author: Yesica Martin
@tag
Feature: Pagina despegar

  @tag1
  Scenario Outline: Buscar un vuelvo de solo ida para dos adultos y tres niños y validar el precio más barato del vuelo
    Given Ingresar pagina
    When Seleccionar origen y destino <origen><destino>
    And Seleccionar fechas <fida><fvuelta>
    And Seleccionar habitaciones <adultos><ninos><edadnino1><edadnino2><edadnino3>
    Then Validar precio mas barato
    
        Examples: 
      | origen   | destino  | fida | fvuelta | adultos | ninos | edadnino1 | edadnino2 | edadnino3 |
      | "Bogota" | "Italia" | ""   | ""      | "2"     | "3"   | "7"       | "3"       | "5"       |
    

  