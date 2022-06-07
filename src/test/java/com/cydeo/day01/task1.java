package com.cydeo.day01;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.testng.annotations.Test;

public class task1 {
    @Test
    public void T1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("YahooTitleVerification"));



    }


}

/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com
3. Verify title:
Expected: Yahoo
 */