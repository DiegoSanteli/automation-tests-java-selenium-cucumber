package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

public class LoginPage extends BasePage {

    By campoUsuario = By.id("username");
    By campoSenha = By.id("password");
    By botaoLogin = By.cssSelector("button[type='submit']");
    By mensagemSucesso = By.id("flash");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void acessarPagina() {
        driver.get(ConfigReader.get("url"));
    }

    public void preencherUsuario(String usuario) {
        digitar(campoUsuario, usuario);
    }

    public void preencherSenha(String senha) {
        digitar(campoSenha, senha);
    }

    public void clicarLogin() {
        clicar(botaoLogin);
    }

    public boolean loginComSucesso() {
        return obterTexto(mensagemSucesso)
                .contains("You logged into a secure area!");
    }
}
