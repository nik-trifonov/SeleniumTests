import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFive{
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com");

        //accept cookies
        driver.findElement(By.id("cookieChoiceDismiss")).click();

        //create web element
        WebElement a = driver.findElement(By.linkText("compendiumdev"));
        Actions action = new Actions(driver);
        action.moveToElement(a).click().build().perform();

    }
}
