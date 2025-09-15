package DAY3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_LAB2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

//        //2
//        String text = driver.findElement(By.xpath("//a[contains(@href, 'passwordrecovery')]")).getText();
//
//        //label[contains(text(), 'Email:')]
//
//        //3
//        System.out.println(text);
//
//        //4
//        driver.findElement(By.xpath("//a[@href = '/passwordrecovery']")).click();

        driver.findElement(By.xpath("//div[@class = 'inputs']/input")).sendKeys("hoy");

        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();



    }
}
