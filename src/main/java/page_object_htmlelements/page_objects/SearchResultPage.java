package page_object_htmlelements.page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;


public class SearchResultPage extends AbstractPage {
    @FindBy(css = "h1[class='srp-controls__count-heading']")
    private WebElement resultsCount;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void checkSearchResults() {
        assertThat("Check that search result is displayed on Search page", resultsCount.isDisplayed());
    }
}
