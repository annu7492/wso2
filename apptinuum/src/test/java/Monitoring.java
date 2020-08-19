import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

 import java.util.List;
 import java.util.concurrent.TimeUnit;
 import org.openqa.selenium.chrome.ChromeDriver;
  import org.openqa.selenium.support.ui.Select;

public class Monitoring {
    public static void main(String[] args)throws InterruptedException {
        //System.setProperty("webdriver.gecko.driver","D:/geckodriver-v0.26.0-win64/geckodriver.exe");
       System. setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       // WebDriver driver= new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("https://try-apptinuum.choiceworx.io:9443/carbon/admin/login.jsp#");
        driver.get("https://cwxtest-apptinuum.choiceworx.io/login");
        driver.wait(3);
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("aug11@yopmail.com");
        driver.wait(3);
        driver.findElement(By.xpath("//input[@id='password']]")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/form/div[4]/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.quit();

    }
}