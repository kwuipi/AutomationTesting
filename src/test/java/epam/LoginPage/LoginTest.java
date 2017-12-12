package epam.LoginPage;

import epam.DriverTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends DriverTest {
    private static final String URL = "https://www.aeroflot.ru/personal/login";

    private static final String login = "gfrsdadga";
    private static final String password = "ghbdajnskl";

    @Test
    public void loginTest() {
        driver.get(URL);
        AeroflotLoginPage loginPage = new AeroflotLoginPage(driver);
        AeroflotLoginPage page = loginPage.login(login, password);
    }
}