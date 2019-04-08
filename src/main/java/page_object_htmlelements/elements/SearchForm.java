package page_object_htmlelements.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.HtmlElement;
import ru.yandex.qatools.htmlelements.element.TextInput;

@FindBy(css = "form#gh-f")
public class SearchForm extends HtmlElement {

    @FindBy(id = "gh-ac")
    private TextInput searchField;

    @FindBy(id = "gh-btn")
    private Button searchButton;

    public void search(String searchText) {
        searchField.sendKeys(searchText);
        searchButton.click();
    }
}
