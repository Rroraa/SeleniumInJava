package DAY6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // FRAME 1
        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello");


        driver.switchTo().defaultContent();

        //FRAME 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src = 'frame_2.html']"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Hey");



        //USING FRAME3 inside of it another iframe

        driver.switchTo().defaultContent();
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hey");



        // IFRAME
        WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@src,'docs.google.com/forms')]"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();


    }
}
