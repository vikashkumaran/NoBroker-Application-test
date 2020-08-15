package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import resources.NoBrokerConstants;
/**
 * @class SearchResultsPage
 * @class_description SearchResultsPage class is a page object class that contains web elements and their respective events
 * @created date 15-08-2020
 * @author VIKASH
 *
 */
public class SearchResultsPage {
	AndroidDriver driver;
	//Web Elements initialization
	public SearchResultsPage(AndroidDriver parentDriver) {
		this.driver = parentDriver;
		PageFactory.initElements(parentDriver, this);
	}

	@FindBy(id = NoBrokerConstants.TARGET_PROPERTY)
	public WebElement targetProperty;

	@FindBy(id = NoBrokerConstants.WRONG_INFO_BUTTON)
	public WebElement wrongInfoButton;
}
