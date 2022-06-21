package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonPage {


    WebDriver driver;
    private final String url = "https://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private final By radioButtonFemale = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input");
    private final By getCheckValue = By.xpath("//*[@id=\"buttoncheck\"]");
    private final By stringValue = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");

    private final By radioButtonFemale2 = By.xpath("//*[@name='gender' and @value='Female']");
    private final By radioButtonAge = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]");
    private final By getValues = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");
    private final By stringValues = By.xpath("//p[@class='groupradiobutton']");

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate() {
        driver.get(url);
    }

    public void clickOnRadioButton() {
        driver.findElement(radioButtonFemale).click();
    }


    public void clickCheckValue() {
        driver.findElement(getCheckValue).click();
    }

    public String getStringValue() {
        String text = driver.findElement(stringValue).getText();
        return text;
    }
    public void clickOnGenderButton() {
        driver.findElement(radioButtonFemale2).click();
    }

    public void clickOnAgeButton() { driver.findElement(radioButtonAge).click(); }

    public void clickCheckValues() { driver.findElement(getValues).click(); }


    public String getStringValues() {
            String text2 = driver.findElement(stringValues).getText();
            return text2;
        }


    }

