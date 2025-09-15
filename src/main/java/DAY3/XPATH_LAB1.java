package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_LAB1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //1
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

        //2
        driver.findElement(By.xpath("//input[@id ='Email' and @name = 'Email']")).sendKeys("Test@gmail.com");
        //3
        driver.findElement(By.xpath("//input[contains(@id, 'Password') or @name = 'Password']")).sendKeys("2130127832193");
        //4
        driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
        //5`
        WebElement locating = driver.findElement(By.xpath("//input[@id = 'RememberMe' and @name = 'RememberMe']"));
        locating.click();
        System.out.println(locating.isSelected());




    }
}
