import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFour {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[29]/a")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
         Alert alert =  driver.switchTo().alert();
        String a =  alert.getText();
        System.out.println(a);
         Thread.sleep(2000);
         driver.quit();
    }
}
