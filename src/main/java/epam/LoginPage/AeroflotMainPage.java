package epam.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import epam.Driver;


public class AeroflotMainPage extends Driver {

    @FindBy(className = "menu-btn login-icon")
    private WebElement menubtn_loginicon;

    public AeroflotMainPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLogged() { return menubtn_loginicon.isDisplayed();
    }
}