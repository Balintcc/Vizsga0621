package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InputPage {
    public InputPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    private final String url="http://demo.seleniumeasy.com/basic-first-form-demo.html";

    final static By acceptButton  = By.xpath("//*[@title='Close']");

    private final By fieldA=By.id("sum1");
    private final By fieldB=By.id("sum2");
    private final By totalBtn=By.xpath("//*[@id=\"gettotal\"]/button");
    private final By result=By.id("displayvalue");

    public void navigate() {
        driver.get(url);
        driver.findElement(acceptButton).click();

    }

    public  void fillFields(String a, String b) {
        driver.findElement(fieldA).sendKeys(a);
        driver.findElement(fieldB).sendKeys(b);
        driver.findElement(totalBtn).click();
    }
    public String getAnswer() {
        String text = driver.findElement(result).getText();
        return text;
    }


}
