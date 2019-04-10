package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage extends AbstractPage {
    @FindBy(css = "span#gh-ug>a")
    private WebElement signInLink;

    @FindBy(css = "span#gh-ug-flex>a")
    private WebElement registrationLink;

    @FindBy(css = "div.gh-menu>a#gh-eb-Geo-a-default")
    private WebElement languageLink;

    @FindBy(css = "li#gh-eb-My>div.gh-menu>a.gh-eb-li-a")
    private WebElement myEbaySelect;

    @FindBy(css = "i#gh-Alerts-i ")
    private WebElement notification;

    @FindBy(css = "li#gh-cart")
    private WebElement shoppingCart;

    @FindBy(id = "gh-ac")
    private WebElement searchField;

    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    @FindBy(id = "#gh-as-a")
    private WebElement extendetSearchLink;

    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage search(String searchText) {
        searchField.sendKeys(searchText);
        searchButton.click();
        return new SearchResultPage(driver);
    }
}
