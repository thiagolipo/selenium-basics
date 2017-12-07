package br.com.lojasrenner.pages;

import br.com.lojasrenner.config.DriverConfig;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends Page {
    private static final String URL = new DriverConfig().getProperties().getProperty("urlHome");

    WebDriver driver;

    public Home(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input#lst-ib")
    public static WebElement inputSearch;

    public void searchForText(String text) {
        waitForElement(inputSearch);
        typeText(inputSearch, text);
        inputSearch.sendKeys(Keys.ENTER);
    }

    @Override
    public void start() {
        driver.get(URL);
        driver.manage().window().maximize();
    }
}
