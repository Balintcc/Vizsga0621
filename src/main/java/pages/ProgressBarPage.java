package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class ProgressBarPage {
    WebDriver driver;
    public ProgressBarPage(WebDriver driver) {
        this.driver = driver;
    }




    private final By button = By.id("cricle-btn");
    private final By percent = By.xpath("//*[@id=\"circle\"]/div/div[1]");
    String url = "https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html";

    public void navigate() {
        driver.get(url);
    }
    public String download() {
        driver.findElement(button).click();
        WebElement element = driver.findElement(percent);

        FluentWait wait = new FluentWait(driver);

        wait.withTimeout(Duration.ofSeconds(25));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.textToBePresentInElementLocated(percent, "100%"));
        return element.getText();
    }





}
