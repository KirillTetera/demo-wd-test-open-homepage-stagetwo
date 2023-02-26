package by.itacademy.kirilltetera.webdriver.stagetwo;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HomePageTest {
    @Test
    public void testOpenOnliner(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by/");
        WebElement element = driver.findElement
                (By.xpath("/html/body/div[1]/div/div/div/header/div[3]/div/div[1]/a/img"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }
    @Test
    public void testOpenAmazon(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement element = driver.findElement
                (By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/div[1]/a"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }
    @Test
    public void testOpenTicketpro(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ticketpro.by/");
        WebElement element = driver.findElement
                (By.xpath("/html/body/div[2]/header/div/div[1]/div[1]/div/a/img"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }
    @Test
    public void testOpenAlatantour(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://alatantour.by/");
        WebElement element = driver.findElement
                (By.xpath("/html/body/header/div/div/div/div/a/img"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }
    @Test
    public void testOpenOlx(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.olx.pl/");
        WebElement element = driver.findElement
                (By.xpath("/html/body/div[1]/header/div[2]/div/h1/a/span[3]"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }
    @Test
    public void testOpenTripadvisor(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.com/");
        WebElement element = driver.findElement
                (By.xpath("/html/body/div[1]/header/div/nav/h1/picture/img"));
        Assert.assertTrue(element.isDisplayed());
        driver.quit();
    }
}
