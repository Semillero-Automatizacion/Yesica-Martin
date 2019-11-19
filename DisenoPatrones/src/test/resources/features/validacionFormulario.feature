#Author: Yesica Andrea Martin
#Creación formulario
#
@tag
Feature: Validacion formulario ColorLib

  @tagValidarForm
  Scenario Outline: Caso002_Validacion formulario
    Given Ingreso a navegador
    And Ingresar sesion <usuario><contrasena>
    When Diligencio formulario <nombre><direccion><correo><pass><numeroMin><caracterMax><numeroFlotante><ip><date><dateAntes>

    Examples: 
      | usuario | contrasena | nombre   | direccion      | correo | pass  | numeroMin | caracterMax | numeroFlotante | ip  | date         | dateAntes    |
      | "demo"  | "demo"     | "Yesica" | "miprueba.com" | ""     | "123" | "123456"  | "abc123"    | "-12.08"       | "8" | "2019-11-15" | "2011-09-12" |
