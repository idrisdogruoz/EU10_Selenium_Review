package week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioBtnPractice {
    public static void main(String[] args) {

        clickbutton("Email");

    }

    public static void clickbutton(String btnName) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.tutorialstonight.com/html-radio-button");

        WebElement btn = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//        switch (btnName){
//            case ("Email") :
//                btn= driver.findElement(By.xpath("//input[@type='radio'][1]"));
//                break;
//            case("Phone"):
//                btn = driver.findElement(By.xpath("//input[@type='radio'][2]"));
//                break;
//            case ("Mail"):
//                btn =driver.findElement(By.xpath("//input[@type='radio'][3]"));
//                break;
//        }
        btn.click();
    }

}
