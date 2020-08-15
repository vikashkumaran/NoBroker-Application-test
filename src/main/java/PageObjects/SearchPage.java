package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import resources.NoBrokerConstants;
/**
 * @class SearchPage
 * @class_description SearchPage class is a page object class that contains web elements and their respective events
 * @created date 15-08-2020
 * @author VIKASH
 *
 */
public class SearchPage {
	AndroidDriver driver;
	//Web Elements initialization
	public SearchPage(AndroidDriver parentDriver) {
		this.driver = parentDriver;
		PageFactory.initElements(parentDriver, this);
	}

	@FindBy(className = NoBrokerConstants.CITY_DROP_DOWN)
	public WebElement cityDropdown;

	@FindBy(xpath = NoBrokerConstants.BANGALORE_DATA)
	public WebElement bangaloreData;

	@FindBy(id = NoBrokerConstants.SEARCH_TEXT_BOX)
	public WebElement searchTextBox;

	@FindBy(id = NoBrokerConstants.NEARBY_CHECK_BOX)
	public WebElement nearbyCheckBox;

	@FindBy(id = NoBrokerConstants.TWO_BHK_BUTTON)
	public WebElement twoBHKButton;

	@FindBy(id = NoBrokerConstants.THREE_BHK_BUTTON)
	public WebElement threeBHKButton;

	@FindBy(id = NoBrokerConstants.SEARCH_BUTTON)
	public WebElement searchButton;

	public void enterValue(WebElement element, String targetValue) {
		element.sendKeys(targetValue);
	}

}
