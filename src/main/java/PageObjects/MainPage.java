package PageObjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import resources.NoBrokerConstants;

/**
 * @class MainPage
 * @class_description MainPage class is a page object class that contains web elements and their respective events
 * @created date 15-08-2020
 * @author VIKASH
 *
 */
public class MainPage {

	AndroidDriver driver;
    //Web Elements initialization
	public MainPage(AndroidDriver parentDriver) {
		this.driver = parentDriver;
		PageFactory.initElements(parentDriver, this);
	}

	@FindBy(id = NoBrokerConstants.BUY_PROPERTY)
	public WebElement buyProperty;

	@FindBy(id = NoBrokerConstants.SEARCH_TEXT)
	public WebElement searchText;

}
