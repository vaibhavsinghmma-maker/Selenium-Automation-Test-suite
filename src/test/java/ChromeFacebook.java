import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeFacebook {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.fast.com");
        Thread.sleep(10000);
        driver.findElement(By.id("speed-value")).getText();

        System.out.println(driver.findElement(By.id("speed-value")).getText());

    }
}
