import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoResizeable {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");

        //create web element
        WebElement resize = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(resize);

        //create web element
        Actions action = new Actions(driver);
        WebElement resezableOption = driver.findElement(By.cssSelector("div.ui-icon-gripsmall-diagonal"));
        action.dragAndDropBy(resezableOption, 100, 120).perform();
        //

    }
}
