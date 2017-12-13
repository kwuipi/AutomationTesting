package epam.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import epam.BasicPage;

public class AeroflotLoginPage extends BasicPage {

    @FindBy(name = "login")
    private WebElement login;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "submit0")
    private WebElement submit;

    public AeroflotLoginPage(WebDriver driver) { super(driver); }

    public AeroflotLoginPage login(String user, String pass) {
        login.sendKeys(user);
        password.sendKeys(pass);
        submit.click();
        return new AeroflotLoginPage(driver);
    }
}