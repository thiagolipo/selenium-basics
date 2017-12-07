package br.com.lojasrenner.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    protected WebDriver driver;
    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public void start() {
        driver.get("http://www.lojasrenner.com.br/");
        driver.manage().window().maximize();
    }

    public void close() {
        driver.close();
    }

    public void typeText(WebElement element, String text) {
        waitForElement(element);
        element.sendKeys(text);
    }

    public void click(WebElement element) {
        waitForElement(element);
        element.click();
    }

    public void waitForElement(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
    }
}
