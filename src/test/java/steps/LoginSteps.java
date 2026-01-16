package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import pages.LoginPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;


    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Dado("que o usuário esteja na tela de login")
    public void que_o_usuario_esteja_na_tela_de_login() {
        loginPage.acessarPagina();
    }


    @Quando("informar usuário e senha válidos")
    public void informar_usuario_e_senha_validos() {
        loginPage.preencherUsuario("tomsmith");
        loginPage.preencherSenha("SuperSecretPassword!");
        loginPage.clicarLogin();
    }

    @Então("o sistema deve permitir o acesso")
    public void o_sistema_deve_permitir_o_acesso() {
        if (!loginPage.loginComSucesso()) {
            throw new AssertionError("Login não foi realizado com sucesso");
        }
    }




}
