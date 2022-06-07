package com.cydeo;

import com.utilities.Driver;
import com.utilities.PracticeCydeoReader;
import org.testng.annotations.Test;

public class CydeoLinks {
    @Test
    public void T1(){
        Driver.getDriver().get(PracticeCydeoReader.getProperty(""));
    }

}




