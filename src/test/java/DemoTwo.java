import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.name("search")).sendKeys("HP");
        driver.quit();
    }
}
