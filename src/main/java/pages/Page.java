 package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    public Page(WebDriverWait wait) {
        this.wait = wait;
    }

    WebDriverWait wait;

}
