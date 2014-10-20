import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SJamdar1 on 18/10/2014.
 */
public class MyFirstSeleniumScript

{
    @Test
    public void LaunchApp()
    {
        WebDriver driver;
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.google.co.uk");
        driver.findElement(By.id("gbqfq")).sendKeys("Jenkis");


    }
}
