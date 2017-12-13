package epam.FeedbackPage;

import epam.BasicPageTest;
import epam.FeedBackPage.FeedbackSearchPage;
import org.testng.annotations.Test;

public class FeedBackSearchButton extends BasicPageTest {
    private static final String URL = "https://www.aeroflot.ru/feedback";

    private static final String search = "dsagsd";
    private static final String email = "jfdla@mail.ru";

    @Test
    public void searchButton() {
       FeedbackSearchPage mainpage = new FeedbackSearchPage(driver);
       FeedbackSearchPage page = mainpage.feedBackInsert(search,email);
    }
}
