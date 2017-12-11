package epam.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import epam.Driver;

public class AeroflotLoginPage {

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
//package epam.LoginPage;
//
//        import org.openqa.selenium.support.FindBy;
//        import org.openqa.selenium.WebElement;
//        import org.openqa.selenium.WebDriver;
//        import epam.Driver;
//
//public class AeroflotLoginPage extends Driver {
//
//    @FindBy(name = "login");
//    private WebElement login;
//
//    @FindBy(name = "password");
//    private WebElement password;
//
//    @FindBy(name = "submit0");
//    private WebElement submit;
//
//    public AeroflotLoginPage(WebDriver driver) { super(driver); }
//
//    public AeroflotLoginPagePage lgoin(String user, String pass) {
//        login.sendKeys(user);
//        password.sendKeys(pass);
//        submit.click();
//        return new AeroflotMainPage(driver);
//    }
//}