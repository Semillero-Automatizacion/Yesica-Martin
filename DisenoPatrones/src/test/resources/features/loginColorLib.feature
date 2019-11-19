#Author: Yesica Andrea Martin
#Feature para el inicio de sesion aplicacion ColorLib
#
@tag
Feature: Inicio sesion ColorLib

  @tag1
  Scenario: Inicio de sesion ColorLib
    Given Ingreso a navegador
    When Ingresar usuario "demo"
    And Ingresar contraseña "demo"
    And Click en el boton ingresar
    Then Se valida ingreso correcto
	
 