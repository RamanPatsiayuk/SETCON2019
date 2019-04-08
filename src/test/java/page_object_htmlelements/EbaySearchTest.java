package page_object_htmlelements;

import org.junit.Test;
import page_object_test.BaseTest;
import page_objects.EbayHomePage;

public class EbaySearchTest extends BaseTest {
    EbayHomePage ebayHomePage;

    @Test
    public void searchEbayTest() {
        ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.search("iPhone 8")
                .checkSearchResults();
    }
}
