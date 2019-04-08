package typical_start;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;

public class EbaySearchTest {
    WebDriver driver;

    @Test
    public void ebaySearchTest() {

        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("gh-ac")).sendKeys("iPhone 8");
        driver.findElement(By.id("gh-btn")).click();
        WebElement searchResult = driver.findElement(By.cssSelector("h1[class='srp-controls__count-heading']"));
        assertThat("Check that search result is displayed on Search page", searchResult.isDisplayed());
        driver.quit();
    }
}
