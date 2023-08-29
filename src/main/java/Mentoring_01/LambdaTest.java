package Mentoring_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class LambdaTest {
    @Test
    public void lambdaWebTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.lambdatest.com/selenium-playground/");
        WebElement inputFormSubmit = driver.findElement(By.xpath("//a[contains(text(),'Input Form')]"));
        inputFormSubmit.click();
        WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
        name.sendKeys("TestName");
        WebElement email = driver.findElement(By.xpath("//input[@id='inputEmail4']"));
        email.sendKeys("Email.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword4']"));
        password.sendKeys("123456");




    }
}
