package com.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;

import java.util.Date;
import java.util.Set;

public class ReviewUtils {

    public static void staticWait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {

        }
    }

    // will be used in demoblaze application, to navigate to different links at the page
    // will click on different elements/links at the page
    public static void getLink(WebDriver driver, String link) {
        driver.findElement(By.partialLinkText(link)).click();
        staticWait(1);
    }

    public static double addProduct(WebDriver driver, String category, String product) {
        getLink(driver, category); // click on category
        getLink(driver, product); // click on product
        // Let's get product's price
        String priceText = driver.findElement(By.tagName("h3")).getText();
        double price = Double.parseDouble(priceText.substring(1, 4));

        getLink(driver, "Add to cart");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return price;
    }

    public static void fillForm(WebDriver driver) {

        Faker faker = new Faker();
        driver.findElement(By.id("name")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("country")).sendKeys(faker.country().name());
        driver.findElement(By.id("city")).sendKeys(faker.address().city());
        driver.findElement(By.id("card")).sendKeys(faker.finance().creditCard());
        driver.findElement(By.id("month")).sendKeys("" + faker.number().numberBetween(1, 12));
        driver.findElement(By.id("year")).sendKeys("" + faker.number().numberBetween(2022, 2032));
        driver.findElement(By.xpath("//button[.='Purchase']")).click();
        staticWait(2);
    }


    public static void windowHandle(WebDriver driver, String pickDateWindowTitle) {
        Set<String> windowHandles = driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);

            if (driver.getTitle().equals(pickDateWindowTitle)) {
                break;
            }
        }
    }

    public static void ourForm(WebDriver driver) {

        Faker faker = new Faker();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(faker.name().fullName()); // Customer name
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(faker.address().streetAddress()); //Street
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(faker.address().city()); //City
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(faker.address().state()); //State
        WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
        String zip = faker.address().zipCode().replaceAll("-","");
        staticWait(2);
        zipCode.sendKeys(zip);

    }

    public static void IdSelectClick(WebDriver driver, String Id) {
        driver.findElement(By.xpath(Id)).click();
    }

    public static void IdSelectSendKeyCardNumber(WebDriver driver, String Id) {
        Faker faker = new Faker();
        String SendKey = faker.business().creditCardNumber().replaceAll("-","");
        staticWait(2);
        WebElement cardNumber = driver.findElement(By.xpath(Id));
        cardNumber.sendKeys(SendKey);
    }

    public static void isVisibleThisId(WebDriver driver, String Id){
        WebElement thisId = driver.findElement(By.xpath(Id));
        thisId.isDisplayed();
    }

}
