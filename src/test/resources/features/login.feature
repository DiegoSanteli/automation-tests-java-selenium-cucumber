# language: pt


Funcionalidade: Login do usuário

  Cenário: Login com dados válidos
    Dado que o usuário esteja na tela de login
    Quando informar os dados de login:
      | usuario  | senha                |
      | tomsmith | SuperSecretPassword! |
    Então o sistema deve permitir o acesso
