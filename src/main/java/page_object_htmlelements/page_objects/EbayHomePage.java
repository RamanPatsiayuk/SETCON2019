package page_object_htmlelements.page_objects;

import org.openqa.selenium.WebDriver;
import page_object_htmlelements.elements.SearchForm;

public class EbayHomePage extends AbstractPage {

    private SearchForm searchForm;

    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage search(String searchText) {
        searchForm.search(searchText);
        return new SearchResultPage(driver);
    }
}
