package Recaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        WebElement name = driver.findElement(By.xpath("//input[@placeholder = 'Enter Name']"));
        name.sendKeys("Juan Dela Cruz");

        WebElement email = driver.findElement(By.xpath("//input[@placeholder = 'Enter EMail']"));
        email.sendKeys("juandela@gmail.com");

        WebElement phone = driver.findElement(By.xpath("//input[@placeholder = 'Enter Phone']"));
        phone.sendKeys("09123456789");

        WebElement address = driver.findElement(By.xpath("//textarea[@id = 'textarea']"));
        address.sendKeys("45 Emerald Street, Greenfields Subdivision, Barangay Bagong Pag-asa, General Santos City, South Cotabato 9500");

        WebElement gender = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id ='male']")));
        gender.click();

        List<WebElement> days = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type='checkbox']")));
        for(WebElement checkbox : days){
            if(!checkbox.isSelected()){
                checkbox.click();
            }
        }
        driver.quit();

    }
}
