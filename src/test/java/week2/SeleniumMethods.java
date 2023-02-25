package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new ChromeDriver();

//        driver.get("https://www.google.com");
//        Thread.sleep(1000);
//        driver.get("https://www.cydeo.com");
//        Thread.sleep(1000);
//
//        driver.navigate().back(); // google
//        driver.navigate().forward();    // cydeo
//        driver.navigate().refresh();    // cydeo
//
//        driver.navigate().to("https://www.ebay.com");
//
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());


        driver.navigate().to("https://www.abc.com");

        String actualTitle = driver.getTitle();
        String actualUrl= driver.getCurrentUrl();


        if(actualTitle.equals("ABC Home Page - ABC.com")){
            System.out.println("First test is passed");
        }else{
            System.out.println("First Test FAILED");
        }


        if(actualUrl.equals("https://abc.com/")){
            System.out.println("URL test Passed");
        }else{
            System.out.println("URL test FAILED");
        }

        driver.close();
        driver.get("https://www.google.com");
    }
}
