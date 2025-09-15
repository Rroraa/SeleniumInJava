package DAY6;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frame_Exercise {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/iframe");

        // Switch to iframe
        driver.switchTo().frame("mce_0_ifr");

        // Use JavaScript to set content inside TinyMCE
        String script = "document.getElementById('tinymce').innerHTML = 'Hello, this is a test via JS!';";
        ((JavascriptExecutor) driver).executeScript(script);

        // Switch back to main content
        driver.switchTo().defaultContent();

        System.out.println("Test executed successfully.");

    }
}
