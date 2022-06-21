package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.DualListBoxPage;

public class DualListBoxTest extends BaseTest{


    @Test
    public void TestAddSingleElement()
    {
        DualListBoxPage dualListBoxPage =   new DualListBoxPage(driver);
        dualListBoxPage.navigate();
        dualListBoxPage.add("Isabella");

        Assertions.assertTrue(dualListBoxPage.results().contains("Isabella"));
        Assertions.assertEquals(14, dualListBoxPage.datas().size());

    }

    @Test
    public void TestAddAllElementButton()
    {
        DualListBoxPage dualListBoxPage =   new DualListBoxPage(driver);
        dualListBoxPage.navigate();
        dualListBoxPage.addAll();
        Assertions.assertEquals(15, dualListBoxPage.results().size());
    }

}
