package epam.BookingPage;

import epam.BookingTicket.AeroflotMainBookingPage;
import epam.BasicPageTest;
import org.testng.annotations.Test;

public class BookingTest extends BasicPageTest {
    private static final String URL = "https://www.aeroflot.ru";

    private static final String dep = "minsk";

    private static final String dest = "moscow";

    @Test
    public void bookingTest() {
        driver.get(URL);
        AeroflotMainBookingPage bookPage = new AeroflotMainBookingPage(driver);
        AeroflotMainBookingPage page = bookPage.book(dep, dest);
    }

}
