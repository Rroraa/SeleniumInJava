package Recaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Checkbox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://qa-practice.netlify.app/checkboxes");
        driver.manage().window().maximize();

        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type ='checkbox']"));
       for(WebElement select : checkbox){
           if (!select.isSelected()) {
               select.click();
               System.out.println("Selected");
           }
           else {
               System.out.println("not seleceted");
           }
       }
    }
}
