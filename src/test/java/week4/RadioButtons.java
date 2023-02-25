package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");


        WebElement blueBtn = driver.findElement(By.id("blue"));
        WebElement redBtn = driver.findElement(By.id("red"));
        WebElement greenBtn = driver.findElement(By.id("green"));

        redBtn.click();
        Thread.sleep(2000);
        blueBtn.click();


//        System.out.println(redBtn.isDisplayed());
//        System.out.println(blueBtn.isSelected());
//        System.out.println(redBtn.getText());
//        System.out.println(redBtn.isEnabled());
//        System.out.println(greenBtn.isEnabled());


        List<WebElement> btns = driver.findElements(By.xpath("//input[@type='radio'"));

        for (WebElement btn : btns){
            btn.click();
            Thread.sleep(1000);
            System.out.println(btn.isEnabled());
        }


    }
}
