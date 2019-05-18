import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;
    @BeforeMethod
    public  void setUp () {
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ojidanie zagruzki stranici
        wd.navigate().to("https://www.wikipedia.org/"); // open page URL
        }

    public void click(By locator) {
        wd.findElement(locator).click();    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);    }

    @AfterMethod
    public void tearDown (){
        wd.quit(); //close browser
    }
}
