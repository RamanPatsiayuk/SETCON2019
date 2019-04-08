package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends AbstractPage {

    @FindBy(id = "gh-ac")
    private WebElement searchField;

    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage search(String searchText) {
        searchField.sendKeys(searchText);
        searchButton.click();
        return new SearchResultPage(driver);
    }
}
