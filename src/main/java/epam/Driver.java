package epam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Driver {
    protected WebDriver driver;

    public Driver(WebDriver driver1) {
        this.driver = driver1;
        PageFactory.initElements(driver1, this );
    }
}

