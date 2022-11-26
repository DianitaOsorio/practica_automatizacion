#languaje:ES
Feature: probar login en el sitio web

  Scenario Outline: login en el sitio

    Given Diana se encuentra en el sitio web
    When Diana digita la siguiente informacion
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Then Diana podra ver el <texto> en el sitio
    Examples:
      | usuario | contrasena | texto     |
      | admin   | serenity   | Dashboard |