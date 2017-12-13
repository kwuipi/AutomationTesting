package epam.FeedBackPage;

import epam.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AeroflotFeedbackPage extends BasicPage  {

    @FindBy(id = "id_go_menu")
    private WebElement menuButton;

    public AeroflotFeedbackPage(WebDriver driver) {super(driver);}

    public  AeroflotFeedbackPage goButtonClick() {
        { menuButton.click();}
        return new AeroflotFeedbackPage(driver);
    }
}
