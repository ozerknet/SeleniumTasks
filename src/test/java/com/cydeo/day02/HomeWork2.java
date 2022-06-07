package com.cydeo.day02;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.PracticeCydeoReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork2 {
    @Test
    public void T1() {
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        Driver.getDriver().get(PracticeCydeoReader.getProperty("BankHeaderVerification"));

        //3. Verify header text
        //Expected: “Log in to ZeroBank”
        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = Driver.getDriver().findElement(By.xpath("//h3")).getText();

        Assert.assertTrue(actualHeader.equalsIgnoreCase(expectedHeader));
        //Expected:

    }
}
/*
TC #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Zero Log in”
 */
