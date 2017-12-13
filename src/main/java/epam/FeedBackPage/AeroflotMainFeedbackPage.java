package epam.FeedBackPage;

import epam.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AeroflotMainFeedbackPage extends BasicPage {

    @FindBy(className = "menu-btn orange")
    private WebElement feedbackbutton;

    public AeroflotMainFeedbackPage(WebDriver driver) {super(driver);}

    public void feedBackButton() { feedbackbutton.click();}

}
