package Recaps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();


        WebElement dropdownElement = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
        Select dropdown = new Select(dropdownElement);


        List<WebElement> options = dropdown.getOptions();

        // Loop through options
        for (WebElement option : options) {
            dropdown.selectByVisibleText(option.getText()); //
            System.out.println("Recaps.Dropdown option: " + option.getText());
        }

    }
}
