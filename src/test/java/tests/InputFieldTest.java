package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.InputPage;

public class InputFieldTest extends BaseTest{


    @Test
    public void TestSumTwoNumbers()
    {
        InputPage inputPage = new InputPage(driver);
        inputPage.navigate();
        inputPage.fillFields("5","6");
        Assertions.assertEquals(11, Integer.parseInt(inputPage.getAnswer()));

    }

    @Test
    public void TestSumTwoInvalidInputs()
    {
        InputPage inputPage = new InputPage(driver);
        inputPage.navigate();
        inputPage.fillFields("abc","def");
        Assertions.assertEquals("NaN", inputPage.getAnswer());
    }
}
