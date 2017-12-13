package epam.LoginPage;

import epam.BasicPageTest;
import org.testng.annotations.Test;

public class LoginTest extends BasicPageTest {
    private static final String URL = "https://www.aeroflot.ru";

    private static final String login = "gfrsdadga";
    private static final String password = "ghbdajnskl";

    @Test
    public void loginTest() {
        driver.get(URL);
        AeroflotMainPage mainPage = new AeroflotMainPage(driver);
        AeroflotLoginPage loginPage = new AeroflotLoginPage(driver);
        AeroflotLoginPage page = loginPage.login(login, password);
    }
}