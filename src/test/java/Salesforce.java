import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.salesforce.com/");

//        driver.findElement(By.cssSelector("input.username")).sendKeys("123456789");
//        driver.findElement(By.cssSelector("input.password")).sendKeys("12456abc");
//        driver.findElement(By.cssSelector("input[type='email']")).clear();
//        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("88888888");
//        driver.findElement(By.cssSelector("input[name='Login']")).click();

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='pw']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

    }
}