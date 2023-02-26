package by.itacademy.kirilltetera.webdriver.stagetwo;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest {
    @Test
    public void testOpenOnliner(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        driver.quit();
    }
}
