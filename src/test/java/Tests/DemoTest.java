package Tests;

import Pages.BasePage;
import org.testng.annotations.Test;

public class DemoTest extends BasePage {


    @Test
    public void testFb() throws InterruptedException {
        launchUrl("https://www.facebook.com/");
        Thread.sleep(5000);
    }
}
