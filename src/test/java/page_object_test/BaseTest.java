package page_object_test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
        protected WebDriver driver;

        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.get("https://www.ebay.com/");
            driver.manage().window().maximize();
        }

        @After
        public void tearDown() {
            driver.quit();
        }
}
