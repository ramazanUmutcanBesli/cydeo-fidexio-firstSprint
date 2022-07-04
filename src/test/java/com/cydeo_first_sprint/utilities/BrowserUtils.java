package com.cydeo_first_sprint.utilities;

import org.junit.Assert;

public class BrowserUtils {
    public static void sleep(int second){
        second*=1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }
    public static void BasePageAchieve(){
        Driver.getDriver().get("https://qa.fidexio.com/");
    }
    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */
    public static void verifyTitle(String actualMessageString,String expectedMessage){
        Assert.assertEquals(expectedMessage,actualMessageString);
    }
}
