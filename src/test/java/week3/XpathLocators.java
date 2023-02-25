package week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window();

//        xpath is another  custom locators
//        we have  two types  of syntax  of xpath
//        1. Absolute
//         /html/body/div/div[1]  //baştan sırayla hepsini yaz //pek kullanılmaz.

//        2. Relative  xpath
//        //tagName[@attributeName='value']  // double slash ile  başlar.
//        //div[@class='row']

//        FREQUENTLY  used  syntax  ****** Önemli

//        //tagName[contains(@attribute, 'value')]
//        //tagName[.='text']             (same as //tagName[text()='text’], . represents text)
//        //*[@attribute='value’]         ( use * when we don't want use tag name)

//         in xpath, we also can go from parent to child, use /
//         in xpath, we can go from CHILD to PARENT, use /..

//        //i[text()='Retrieve password']

//        in xpath, we also can use siblings method, to select by siblings
//         //option[.='Colorado']/preceding-sibling::option
//         //option[.='Colorado']/following-sibling::option

//         we can provide index number in [], starting from 1
//         //option[.='Colorado']/following-sibling::option[1]
//         (//option[.='Colorado']/following-sibling::option)[1]


    }
}
