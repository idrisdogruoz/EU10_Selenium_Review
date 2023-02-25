package week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        syntax of Css
//       1. tagName[attributeName='Value']  ***************

         driver.get("practice.cydeo.com/inputs");
        WebElement flas = driver.findElement(By.cssSelector("div[class='large-12 columns']"));

//        2. second  way of  providing syntax  CLASS için sadece
//        tagName.classValue  or tagName#id  *************

//         if you use class  value , you have to replace the space with .
//        div.form-group.has-feedback

//         sometimes we need to locate one element then go to child element, this time, we have to use > sign
//         div.example>form
//         in the css, we can go from parent to child, but we CAN NOT go from child to parent.


//          using  index  number  in Css locator
//          if we have  more  than one same  type of elements , we  can use  indexing
//          css locator::nth-of-type(index number)--> index number starts  1
//          select#state>option:nth-of-type(4)

    }

}
