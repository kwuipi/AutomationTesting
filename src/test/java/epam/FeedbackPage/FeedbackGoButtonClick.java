package epam.FeedbackPage;

import epam.BasicPageTest;
import epam.FeedBackPage.AeroflotFeedbackPage;
import org.testng.annotations.Test;

import java.net.URL;

public  class FeedbackGoButtonClick extends BasicPageTest {
    private static final String URL = "https://www.aeroflot.ru/feedback";

    @Test
    public void goButtonTest() {
        driver.get(URL);
        AeroflotFeedbackPage mainpage = new AeroflotFeedbackPage(driver);
        AeroflotFeedbackPage page = mainpage.goButtonClick();
    }
}