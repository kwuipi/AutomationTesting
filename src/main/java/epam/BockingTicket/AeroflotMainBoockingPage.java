package epam.BockingTicket;

import epam.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AeroflotMainBoockingPage extends Driver {

   @FindBy(name = "ori0")
    private WebElement departure;

    @FindBy(name = "dest0")
    private WebElement destination;

    @FindBy(id = "ttSubmitBtn")
    private WebElement submitButton;

    public AeroflotMainBoockingPage (WebDriver driver ) { super(driver);}

    public AeroflotMainBoockingPage book (String dep, String dest) {
        departure.sendKeys(dep);
        destination.sendKeys(dest);
        submitButton.click();
        return new AeroflotMainBoockingPage(driver);
    }

}
