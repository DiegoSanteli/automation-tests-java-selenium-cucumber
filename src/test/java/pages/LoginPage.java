package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // elementos da página
    By campoUsuario = By.id("username");
    By campoSenha = By.id("password");
    By botaoLogin = By.cssSelector("button[type='submit']");
    By mensagemSucesso = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarPagina() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void preencherUsuario(String usuario) {
        driver.findElement(campoUsuario).sendKeys(usuario);
    }

    public void preencherSenha(String senha) {
        driver.findElement(campoSenha).sendKeys(senha);
    }

    public void clicarLogin() {
        driver.findElement(botaoLogin).click();
    }

    public boolean loginComSucesso() {
        return driver.findElement(mensagemSucesso)
                .getText()
                .contains("You logged into a secure area!");
    }
}
