import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchInRozetka {
    String request;
    static final String ROZETKA = "https://rozetka.com.ua";
    static final String SEARCHLINE = "//input[@name='search']";
    static final String SEARCHBUTTON = "//button[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']";
    public SearchInRozetka(String request) {
        this.request = request;
    }
    public void productSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(ROZETKA);
        WebElement searchLine = driver.findElement(By.xpath(SEARCHLINE));
        WebElement searchButton = driver.findElement(By.xpath(SEARCHBUTTON));

        searchLine.sendKeys(request);
        searchButton.click();
    }

    public static void productSearch(String request) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(ROZETKA);
        WebElement searchLine = driver.findElement(By.xpath(SEARCHLINE));
        WebElement searchButton = driver.findElement(By.xpath(SEARCHBUTTON));

        searchLine.sendKeys(request);
        searchButton.click();
    }
}