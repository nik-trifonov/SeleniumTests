import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DemoThree {
    public static void main(String[] args)  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com");

        driver.findElement(By.linkText("Dynamic Loading")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button")).click();

        String d = driver.findElement(By.xpath("//*[@id=\"finish\"]")).getText();
        System.out.println(d);
        Thread.sleep(5000);
        driver.quit();

    }
}
