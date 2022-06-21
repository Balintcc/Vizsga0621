package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class AlertBoxPage {
    WebDriver driver;
    public AlertBoxPage(WebDriver driver) {
        this.driver = driver;
    }
    static final String url = "http://demo.seleniumeasy.com/javascript-alert-box-demo.html";
    static final By clickForPrompt = By.cssSelector("#easycont div.panel:nth-of-type(3) button");
    public final By promptDemoText = By.id("prompt-demo");

    public void navigate() { driver.get(url); }
    public void openPromptBox() {
               driver.findElement(clickForPrompt).click();
    }
    public void inputTextAccept(String textInput) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(textInput);
        alert.accept();
    }
    public void inputTextCancel(String textInput) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(textInput);
        alert.dismiss();
    }
    public String getAnswer() {
        return (driver.findElement(promptDemoText).getText());
    }


}
