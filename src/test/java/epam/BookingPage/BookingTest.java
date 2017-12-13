package epam.BookingPage;

import epam.BockingTicket.AeroflotMainBoockingPage;
import epam.BasicPageTest;
import org.testng.annotations.Test;

public class BookingTest extends BasicPageTest {
    private static final String URL = "https://www.aeroflot.ru";

    private static final String dep = "minsk";

    private static final String dest = "moscow";

    @Test
    public void bookingTest() {
        driver.get(URL);
        AeroflotMainBoockingPage bookPage = new AeroflotMainBoockingPage(driver);
        AeroflotMainBoockingPage page = bookPage.book(dep, dest);
    }

}
