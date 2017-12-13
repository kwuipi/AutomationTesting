package epam.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import epam.BasicPage;


public class AeroflotMainPage extends BasicPage {

    @FindBy(className = "menu-btn login-icon")
    private WebElement menubtn_loginicon;

    public AeroflotMainPage(WebDriver driver) { super(driver); }

    public void logginButton() { menubtn_loginicon.click(); }
}