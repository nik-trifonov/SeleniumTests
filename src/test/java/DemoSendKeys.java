import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoSendKeys {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        //accept cookies
        driver.findElement(By.id("input-firstname")).sendKeys("Nikolay");
        Actions action = new Actions(driver);

        action.sendKeys(Keys.TAB).
                sendKeys("Trifonov").
                sendKeys(Keys.TAB).
                sendKeys("nikollai@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("123456789").
                sendKeys(Keys.TAB).
                sendKeys("12345").
                sendKeys(Keys.TAB).
                sendKeys("12345").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();

                //sleep for 3 seconds
                Thread.sleep(3000);
                //close the browser
                driver.quit();





    }
}
