import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFiveDragAndDrop {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/p/page3.html");
        driver.findElement(By.id("cookieChoiceDismiss")).click();
        Thread.sleep(2000);
        WebElement a = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(a,100,0).perform();






    }
}
