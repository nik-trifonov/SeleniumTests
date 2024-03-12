import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoPopUp {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com");

        //String e = driver.findElement(By.id     ("Open a popup window")).click();
       driver.getWindowHandles();
       driver.findElement(By.id("alert1")).click();
       Thread.sleep(2000);
       Alert alert = driver.switchTo().alert();
       alert.dismiss();
        Thread.sleep(2000);
       driver.quit();
    }

}