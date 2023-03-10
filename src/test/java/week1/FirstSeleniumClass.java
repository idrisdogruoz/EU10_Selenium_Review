package week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;

public class FirstSeleniumClass {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //1. step
        WebDriverManager.edgedriver().setup();

        WebDriver driverChrome = new ChromeDriver(); // 2 .step

        driverChrome.get("https://practice.cydeo.com/");

        WebDriver driverEdge = new EdgeDriver();

        driverEdge.get("https://www.google.com");
    }
}