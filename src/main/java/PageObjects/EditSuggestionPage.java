package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import resources.NoBrokerConstants;
/**
 * @class EditSuggestionPage
 * @class_description EditSuggestionPage class is a page object class that contains web elements and their respective events
 * @created date 15-08-2020
 * @author VIKASH
 *
 */
public class EditSuggestionPage {
	AndroidDriver driver;
	//Web Elements initialization
	public EditSuggestionPage(AndroidDriver parentDriver) {
		this.driver = parentDriver;
		PageFactory.initElements(parentDriver, this);
	}

	@FindBy(id =NoBrokerConstants.CURRENT_LOCATION)
	public WebElement currentLocation;

	@FindBy(className = NoBrokerConstants.SUGGEST_EDIT_ELEMENTS)
	public List<WebElement> suggestEditElements;

	@FindBy(xpath = NoBrokerConstants.MORE_THAN_4_BHK)
	public WebElement moreThan4Bhk;

	@FindBy(id = NoBrokerConstants.COMMENT_DATE)
	public WebElement commentData;

	@FindBy(id = NoBrokerConstants.SAVE_BUTTON)
	public WebElement saveButton;
	
	@FindBy(className = NoBrokerConstants.MESSAGE_DIALOG)
	public List<WebElement> messageDialogElements;

	public void enterValue(WebElement element, String targetValue) {
		element.sendKeys(targetValue);
	}
}
