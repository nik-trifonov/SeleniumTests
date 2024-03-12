import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFiveDropDown {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com");
        driver.findElement(By.id("cookieChoiceDismiss")).click();

        Thread.sleep(2000);
        WebElement blogsMenu =  driver.findElement(By.id("blogsmenu"));
        Actions action = new Actions(driver);
        action.moveToElement(blogsMenu).perform();

        WebElement option = driver.findElement(By.xpath("//span[text()= 'SeleniumByArun']"));
        action.moveToElement(option).perform();

        action.click().perform();







    }
}
