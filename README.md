# Automação de Testes com Java, Selenium e Cucumber

Projeto de automação de testes end-to-end (E2E) desenvolvido em **Java**, utilizando **Selenium WebDriver** e **Cucumber**, com aplicação do padrão **BDD (Behavior Driven Development)** e **Page Object**, seguindo boas práticas utilizadas em ambientes corporativos.

O projeto automatiza um fluxo real de login em uma aplicação web de testes, com foco em organização, legibilidade, manutenibilidade e preparação para entrevistas técnicas na área de automação de testes.

---

## Tecnologias Utilizadas

- Java 21
- Maven
- Selenium WebDriver
- Cucumber (BDD)
- JUnit
- WebDriverManager
- IntelliJ IDEA

---

## Funcionalidades Automatizadas

- Acesso à página de login
- Preenchimento de usuário e senha
- Clique no botão de login
- Validação de login realizado com sucesso
- Abertura e fechamento automático do navegador
- Execução de testes end-to-end (E2E)

---

## Cenário Automatizado (BDD)

- Login com credenciais válidas
- Validação da mensagem de sucesso após autenticação
- Escrita de cenários em linguagem natural (português)

---

## Executando o Projeto

### Pré-requisitos

- Java JDK 17 ou superior (recomendado Java 21)
- Maven
- Google Chrome
- IntelliJ IDEA (ou outra IDE Java)

---

### Passos para executar

1. Clonar o repositório:

-git clone https://github.com/SEU_USUARIO/automation-tests-java-selenium-cucumber.git

-Abrir o projeto na IDE

-Aguardar o Maven baixar todas as dependências

-Executar a classe TestRunner

## Estrutura do Projeto

``` text
src
└── test
    ├── java
    │   ├── pages        # Page Objects (interações com a página)
    │   ├── steps        # Steps do Cucumber
    │   └── runners      # Runner de execução dos testes
    └── resources
        └── features     # Cenários BDD (.feature)
``` 
        

### Boas Práticas Aplicadas

- Padrão Page Object
- Separação de responsabilidades (Steps x Pages)
- Uso de Hooks do Cucumber (@Before e @After)
- BDD com cenários legíveis e claros
- Código organizado, reutilizável e de fácil manutenção

### Testes
- Os testes são executados utilizando Cucumber integrado ao JUnit, simulando o comportamento real do usuário em um navegador web.

- Para executar os testes via terminal:
 - mvn test

### Observação
- Este projeto foi desenvolvido com foco em aprendizado, prática e preparação para entrevistas técnicas na área de automação de testes, simulando padrões e práticas comuns em projetos reais de mercado.