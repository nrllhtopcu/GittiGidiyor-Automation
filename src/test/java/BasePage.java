import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    public static WebDriver webDriver(){

        System.setProperty("webdriver.chrome.driver","webdriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com");
        driver.manage().window().maximize();
        return driver;

    }

    public static WebDriver driver = webDriver();
    WebDriverWait wait = new WebDriverWait(driver,20,2000);

    public Logger log = LogManager.getLogger(getClass().getName());

    WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    void clickToElement (By by){
        findElement(by).click();
    }

    String getUrl(){
        return driver.getCurrentUrl();
    }

    void goToUrl(String x){
        driver.get(x);
    }
}
