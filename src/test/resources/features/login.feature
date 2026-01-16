# language: pt


Funcionalidade: Login do usuário

  Cenário: Login com dados válidos
    Dado que o usuário esteja na tela de login
    Quando informar usuário e senha válidos
    Então o sistema deve permitir o acesso
