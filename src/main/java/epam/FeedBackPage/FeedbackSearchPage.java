package epam.FeedBackPage;

import epam.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedbackSearchPage extends BasicPage{

    @FindBy(id = "id_question_number")
    private WebElement searchAreaInsert;

    @FindBy(id = "id_email")
    private WebElement emailInsert;

    @FindBy(id = "id_submit0")
    private WebElement searchButton;

    public FeedbackSearchPage(WebDriver driver) { super(driver);}

    public FeedbackSearchPage feedBackInsert (String searchText, String email) {
        searchAreaInsert.sendKeys(searchText);
        searchAreaInsert.sendKeys(email);
        searchButton.click();
        return new FeedbackSearchPage(driver);
    }
}
