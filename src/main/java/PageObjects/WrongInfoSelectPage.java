package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import resources.NoBrokerConstants;
/**
 * @class WrongInfoSelectPage
 * @class_description WrongInfoSelectPage class is a page object class that contains web elements and their respective events
 * @created date 15-08-2020
 * @author VIKASH
 *
 */
public class WrongInfoSelectPage {
	AndroidDriver driver;
	//Web Elements initialization
	public WrongInfoSelectPage(AndroidDriver parentDriver) {
		this.driver = parentDriver;
		PageFactory.initElements(parentDriver, this);
	}

	@FindBy(id = NoBrokerConstants.LOCATION)
	public WebElement location;

	@FindBy(id = NoBrokerConstants.FAKE_PHOTOS)
	public WebElement fakePhotos;

	@FindBy(id = NoBrokerConstants.BHK_TYPE)
	public WebElement bhkType;

	@FindBy(id = NoBrokerConstants.AVAILABILITY_DATE)
	public WebElement availabilityDate;

	@FindBy(id = NoBrokerConstants.PRICE)
	public WebElement price;

	@FindBy(id = NoBrokerConstants.OTHER_OPTION)
	public WebElement otherOption;

	@FindBy(id = NoBrokerConstants.REPORT_BUTTON)
	public WebElement reportButton;
}
