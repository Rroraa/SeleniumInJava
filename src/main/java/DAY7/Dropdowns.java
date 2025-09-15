package DAY7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdowns {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        WebElement countries = driver.findElement(By.xpath("//select[@id ='country']"));
        Select select = new Select(countries);

        select.selectByIndex(6);

        List<WebElement> opt = select.getOptions();
        System.out.println("Number of countries: " + opt.size());

        for(WebElement options : opt){
            System.out.println("Select countries: " + options.getText());
        }

    }
}
