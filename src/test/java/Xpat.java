import io.cucumber.java.bs.I;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;

public class Xpat {



    @Test


    public void testXpath() throws InterruptedIOException {

        WebDriver driver=new ChromeDriver() ;
        driver.manage().window().maximize();

        driver.manage() .timeouts().implicitlyWait(Duration.ofSeconds((10)));

        driver .get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("test");
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
        driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        driver.findElement(By.xpath("//a[text()='English (UK)']")).click();
        driver.findElement(By.xpath("//a[text()='Deutsch']")).click();


        Assert.assertEquals(driver.findElement(By.xpath("//input[@name='email']")).getAttribute("value"),"test");
        Assert.assertEquals(driver.findElement(By.xpath("//input[@name='pass']")).getAttribute("value"),"test");
        

        driver.quit();





    }



}


