package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DualListBoxPage extends Page {
    public DualListBoxPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "http://demo.seleniumeasy.com/jquery-dual-list-box-demo.html";
    private final By addAllBtn = By.className("pAddAll");
    private final By addBtn = By.className("pAdd");
    private final By pickListResult = By.className("pickListResult");
    private final By pickListData = By.className("pickData");

    public void navigate() {
        driver.navigate().to(url);
    }

    public void add(String name) {
        WebElement item = driver.findElement(pickListData).findElement(By.xpath("./option[text()=\"" + name + "\"]"));
        item.click();
        driver.findElement(addBtn).click();

    }
    public void addAll() {
        driver.findElement(addAllBtn).click();
    }

    public List<String> items(By select) {
        List<WebElement> elements = driver.findElement(select).findElements(By.xpath("./option"));
        List<String> out = new ArrayList<>();
        for (WebElement element : elements) {
            out.add(element.getText());
        }
        return out;
    }
    public List<String> results() {
        return items(pickListResult);
    }
    public List<String> datas() {
        return items(pickListData);
    }
}
