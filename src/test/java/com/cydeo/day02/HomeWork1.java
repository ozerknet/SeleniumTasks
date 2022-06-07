package com.cydeo.day02;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.PracticeCydeoReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork1 {
    @Test
    public void T1() {


        Driver.getDriver().get(PracticeCydeoReader.getProperty("EtsyTitleVerification"));
        Driver.getDriver().findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']")).click();

        //3. Verify title:
        String expectedTitle = "Etsy United Kingdom - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
        //Expected:

    }
}

/*
TC #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon | Etsy”
 */