package epam.BookingTicket;

import epam.BasicPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AeroflotMainBookingPage extends BasicPage {

   @FindBy(name = "ori0")
    private WebElement departure;

    @FindBy(name = "dest0")
    private WebElement destination;

    @FindBy(id = "ttSubmitBtn")
    private WebElement submitButton;

    public AeroflotMainBookingPage(WebDriver driver ) { super(driver);}

    public AeroflotMainBookingPage book (String dep, String dest) {
        departure.sendKeys(dep);
        destination.sendKeys(dest);
        submitButton.click();
        return new AeroflotMainBookingPage(driver);
    }

}
