import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoRightClick {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();

        //chromedriver
        WebDriver driver = new ChromeDriver();

        //maximize browser window
        driver.manage().window().maximize();

        //get url
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        //create element
        WebElement a  = driver.findElement(By.xpath("//span[text()='right click me']"));

        //Actions
        Actions action = new Actions(driver);
        action.contextClick(a).perform();

        //wait
        Thread.sleep(2000);

        //create web element
        WebElement quitOption = driver.findElement(By.xpath("//span[text()='Quit']"));
        action.click(quitOption).perform();

        Thread.sleep(1000);

        //switch to alert
        Alert alert = driver.switchTo().alert();
        String textOnAlert  = alert.getText();
        System.out.println(textOnAlert);

        alert.accept();

        //close the browser
        driver.quit();

    }
}
