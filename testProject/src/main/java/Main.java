import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Gdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://rozetka.com.ua");
        WebElement searchLine = driver.findElement(By.xpath("//input[@name='search']"));
        WebElement button = driver.findElement(
                By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']"));
        searchLine.sendKeys("Ipad");
        button.click();
    }
}
