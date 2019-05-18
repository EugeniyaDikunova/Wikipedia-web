import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;


public class AddToFavoritsTest  extends TestBase {
    @Test
    public void testToAddArticleToFavorits1 (){
        click(By.cssSelector("#js-link-box-en"));
        String article = "Haifa";
        type(By.name("search"),article );
        click(By.name("go"));
        String title = wd.findElement(By.cssSelector("h1")).getText();
        Assert.assertEquals(title,article);  // sravnivaem chto ojidaemiy string = actualnomy
    }

    @Test
    public void testToAddArticleToFavorits2 (){
        type(By.id("searchInput"), "Tel-Aviv");
    }
}
