Feature: Crear unidad de negocios en el sitio

  Background:
    Given Diana se encuentra en el sitio web
    When Diana digita la siguiente informacion
      | usuario | contrasena |
      | admin   | serenity   |
    Then Diana podra ver el Dashboard en el sitio

  Scenario: crear unidad de negocios
    When accede a nueva unidad de negocios
    Then podra ver la unidad de negocios creada
