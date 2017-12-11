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
//package org.epam.selenium.loginPage;
//
//        import org.epam.selenium.BasicTest;
//        import org.testng.Assert;
//        import org.testng.annotations.Test;
//
//public class LoginTest extends BasicTest {
//    private static final String URL = "https://imgur.com/signin";
//
//    // That is not my username and password
//    // so they may be changed
//    private static final String login = "asdfasdfasdfafawef";
//
//    private static final String password = "asdfasdf1";
//
//    @Test
//    public void loginTest() {
//        driver.get(URL);
//        ImgurLoginPage loginPage = new ImgurLoginPage(driver);
//        ImgurMainPage page = loginPage.login(login, password);
//        Assert.assertTrue(page.isLogged());
//    }
//}