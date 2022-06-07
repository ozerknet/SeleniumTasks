package com.cydeo.day01;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.PracticeCydeoReader;
import com.cydeo.utilities.ReviewUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class task1 {
    @Test
    public void T1() {
        //1. Open Chrome browser
        //2. Go to https://www.yahoo.com
        Driver.getDriver().get(PracticeCydeoReader.getProperty("YahooTitleVerification"));
        Driver.getDriver().findElement(By.xpath("//button[@type]")).click();

        //3. Verify title:
        String expectedTitle = "Yahoo UK | News, email and search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equalsIgnoreCase(expectedTitle));
        //Expected: Yahoo



    }


}

/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com
3. Verify title:
Expected: Yahoo
 */