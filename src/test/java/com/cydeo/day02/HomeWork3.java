package com.cydeo.day02;

import com.cydeo.utilities.Driver;
import com.cydeo.utilities.PracticeCydeoReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomeWork3 {
    @Test
    public void T1(){
        Driver.getDriver().get(PracticeCydeoReader.getProperty("GoogleTitleVerification"));
        Driver.getDriver().findElement(By.className("(<QS5gu sy4vM>)")).click();
        Driver.getDriver().findElement(By.className("(<gb_d>)")).click();
        //QS5gu sy4vM//

    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */
