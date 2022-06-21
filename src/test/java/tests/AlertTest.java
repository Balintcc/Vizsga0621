package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AlertBoxPage;

public class AlertTest extends BaseTest{


    @Test
    public void TestSubmitValidInput()
    {
        AlertBoxPage alertBoxPage = new AlertBoxPage(driver);
        alertBoxPage.navigate();

        alertBoxPage.openPromptBox();

        alertBoxPage.inputTextAccept("Monica Bellucci");
        Assertions.assertEquals("You have entered 'Monica Bellucci' !", alertBoxPage.getAnswer());
    }

    @Test
    public void TestInputCancel()
    {
        AlertBoxPage alertBoxPage = new AlertBoxPage(driver);
        alertBoxPage.navigate();

        alertBoxPage.openPromptBox();

        alertBoxPage.inputTextAccept("Monica Bellucci");
        Assertions.assertEquals("You have entered 'Monica Bellucci' !", alertBoxPage.getAnswer());

        alertBoxPage.openPromptBox();
        alertBoxPage.inputTextCancel("Kim Basinger");
        Assertions.assertEquals("You have entered 'Monica Bellucci' !", alertBoxPage.getAnswer());

    }





}
