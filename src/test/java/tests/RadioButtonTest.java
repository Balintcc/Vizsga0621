package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.RadioButtonPage;

public class RadioButtonTest extends BaseTest{


    @Test
    public void TestSingleCheckedButton()
    {
        RadioButtonPage radioButton = new RadioButtonPage(driver);
        radioButton.navigate();
        radioButton.clickOnRadioButton();
        radioButton.clickCheckValue();
        radioButton.getStringValue();
        String actual = radioButton.getStringValue();

        Assertions.assertEquals("Radio button 'Female' is checked", actual);
    }


    @Test
    public void TestMultipleCheckedButton()
    {
        RadioButtonPage buttons = new RadioButtonPage(driver);
        buttons.navigate();
        buttons.clickOnGenderButton();
        buttons.clickOnAgeButton();
        buttons.clickCheckValues();

        String content = (buttons.getStringValues());
        Assertions.assertTrue(content.startsWith("Sex : Female"));
        Assertions.assertTrue(content.endsWith("Age group: 15 - 50"));

    }
}
