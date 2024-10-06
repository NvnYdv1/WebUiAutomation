package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
    public static WebDriver driver;

    @BeforeMethod
    public void starDriver(){
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void stopDriver(){
        driver.close();
    }

    public void launchUrl(String url){
        driver.get(url);
    }
}
