package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxes{

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement box1 = driver.findElement(By.id("box1"));
        WebElement box2 = driver.findElement(By.id("box2"));

        System.out.println(box1.isSelected());
        System.out.println(box2.isSelected());

box2.click();
box1.click();



    }

}
