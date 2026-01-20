package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import pages.LoginPage;
import io.cucumber.datatable.DataTable;
import utils.ConfigReader;

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


    @Quando("informar os dados de login:")
    public void informar_os_dados_de_login(DataTable dataTable) {

        var dados = dataTable.asMaps(String.class, String.class);

        String usuario = dados.get(0).get("usuario");
        String senha = dados.get(0).get("senha");

        loginPage.preencherUsuario(ConfigReader.get("usuario"));
        loginPage.preencherSenha(ConfigReader.get("senha"));
        loginPage.clicarLogin();
    }


    @Então("o sistema deve permitir o acesso")
    public void o_sistema_deve_permitir_o_acesso() {
        if (!loginPage.loginComSucesso()) {
            throw new AssertionError("Login não foi realizado com sucesso");
        }
    }




}
