package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.ProgressBarPage;

import java.time.Duration;

public class ProgressBarTest extends BaseTest{


    @Test
    public void TestProgressBarDownload()
    {
        ProgressBarPage progressBarPage = new ProgressBarPage(driver);
        progressBarPage.navigate();
        String result = progressBarPage.download();
        Assertions.assertEquals("100%",result);
    }


}
