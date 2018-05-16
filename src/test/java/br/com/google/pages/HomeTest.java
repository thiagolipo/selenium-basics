package br.com.google.pages;

import br.com.google.config.DriverConfig;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class HomeTest {
    Home home;
    DriverConfig config;
    WebDriver driver;

    @Before
    public void setup() {
        config = new DriverConfig();
        config.setChromeDriverConfig();

        driver = new ChromeDriver();
        home = new Home(driver);
        home.start();
    }

    @Test
    public void searchTest() {
        home.searchForText("perfume");

        assertTrue(driver.getCurrentUrl().contains("q=perfume"));
    }

    @Test
    public void searchTestSample() {
        home.searchForTextSample("perfume");
        assertTrue(driver.getCurrentUrl().contains("q=perfume"));
    }
}