import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wso2Clean<driver> {
        public static void main(String[] args)throws InterruptedException {
            System.setProperty("webdriver.gecko.driver","D:/geckodriver-v0.26.0-win64/geckodriver.exe");
            //System. setProperty("webdriver.chrome.driver","D:/chromedriver_win32/chromedriver.exe");
            //WebDriver driver= new ChromeDriver();
            WebDriver driver= new FirefoxDriver();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            //driver.get("https://try-apptinuum.choiceworx.io:9443/carbon/admin/login.jsp#");
            driver.get("https://cwxtest-apptinuum.choiceworx.io:9443/carbon/admin/login.jsp#");
            driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("admin");
            driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
            driver.findElement(By.xpath("//input[@value='Sign-in']")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//a[@style='background-image: url(../userstore/images/list.gif);'] ")).click();

            driver.findElement(By.xpath("//a[@style='background-image:url(images/users.gif);']")).click();
            //driver.findElement(By.xpath("//*[@id=\"userTable\"]/tbody/tr[3]/td[2]/a[4]")).click();
            //driver.findElement(By.xpath("//a[@style='background-image:url(images/delete.gif);']")).click();

            WebElement table = driver.findElement(By.id("userTable"));
            List<WebElement> tableRows = table.findElements(By.tagName("tr"));
            int rowNum = driver.findElements(By.xpath("//table[@id='userTable']/tbody/tr")).size();
            for (int i=1; i<=rowNum; i++)

            {
                if(driver.findElement(By.xpath("//*[@id=\"userTable\"]/tbody/tr[2]/td[1]")).getText().equalsIgnoreCase("billing-report@choiceworx.com")){
                    System.out.println("Not Performing the delete operation");

            }
                else
            {
                driver.findElement(By.xpath("//table[@id='userTable']/tbody/tr[" + i + "]/td[2]/a[contains(text(),'Delete')]")).click();
                System.out.println("Deleted");
                Thread.sleep(2000);
            }
        }
                             driver.findElement(By.xpath("(//a[@class='icon-link'])[14]")).click();
                     //  driver.findElement(By.xpath("//button[text()='Yes']")).click();
                      //       driver.findElement(By.xpath("//button[text()='OK']")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                List<WebElement> rows=driver.findElements(By.cssSelector("#userTable > tbody > tr"));
                     int count = rows.size();
                     System.out.println("ROW COUNT : "+count);
                    for (int i = 2 ; i <=14 ; i++)
            {
                System.out.println(i);
                driver.findElement(By.cssSelector("#userTable > tbody > tr:nth-child(3) > td:nth-child(2) > a:nth-child(4)")).click();
                driver.findElement(By.xpath("//button[text()='Yes']")).click();
                driver.findElement(By.xpath("//button[text()='OK']")).click();
                Thread.sleep(5000);
                count = rows.size();
            }



            driver.quit();

        }
}