package testClasses;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.EditSuggestionPage;
import PageObjects.MainPage;
import PageObjects.SearchPage;
import PageObjects.SearchResultsPage;
import PageObjects.WrongInfoSelectPage;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import resources.NoBrokerConstants;

/**
 * @class NoBrokerApplication
 * @class_description NoBrokerApplication class deals with testcase statements related to Nobroker android app
 * @created date 15-08-2020
 * @author VIKASH
 *
 */
public class NoBrokerApplication {
	/**
	 * @method verifyAbuseReport
	 * @method_description verifyAbuseReport method is to confirm verify abuse report functionality of Nobroker Android Application
	 * @return void
	 * @created date 15-08-2020
	 * @author VIKASH
	 *
	 */
	@Test
	public void verifyAbuseReport() throws MalformedURLException, InterruptedException {
		// Desired Capabilities for No Broker Android App
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(NoBrokerConstants.APP_PACKAGE, NoBrokerConstants.PACKAGE_NAME);
		capabilities.setCapability(NoBrokerConstants.APP_ACTIVITY, NoBrokerConstants.ACTIVITY_NAME);
		capabilities.setCapability(NoBrokerConstants.DEVICE_NAME, NoBrokerConstants.DEVICE_LENOVO);
		capabilities.setCapability(NoBrokerConstants.PLATFORM_NAME, NoBrokerConstants.PLATFORM_ANDROID);
		capabilities.setCapability(NoBrokerConstants.PLATFORM_VERSION, NoBrokerConstants.ANDROID_VERSION);
		capabilities.setCapability(NoBrokerConstants.AUTOMATION_NAME, NoBrokerConstants.AUTOMATOR_VERSION);
		capabilities.setCapability(NoBrokerConstants.NO_RESET, NoBrokerConstants.NO_RESET_VALUE);
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL(NoBrokerConstants.TARGET_URL),
				capabilities);
		driver.manage().timeouts().implicitlyWait(NoBrokerConstants.WAIT_MILLISECONDS, TimeUnit.MILLISECONDS);
		// Main Page operations
		MainPage mainPage = new MainPage(driver);
		mainPage.buyProperty.click();
		mainPage.searchText.click();
		// Search Page operations
		SearchPage searchPage = new SearchPage(driver);
		searchPage.cityDropdown.click();
		searchPage.bangaloreData.click();
		searchPage.enterValue(searchPage.searchTextBox, NoBrokerConstants.MARATHAHALLI);
		Thread.sleep(NoBrokerConstants.WAIT_MILLISECONDS);
		Dimension size = driver.manage().window().getSize();
		int x = (int) (size.width * NoBrokerConstants.SIZE_RATIO_ONE_FIVE);
		int y = (int) (size.height * NoBrokerConstants.SIZE_RATIO_ONE_FIVE);
		TouchAction action = new TouchAction(driver);
		action.tap(new PointOption().withCoordinates(x, y)).perform().release();
		searchPage.enterValue(searchPage.searchTextBox, NoBrokerConstants.HSR_LAYOUT);
		Thread.sleep(NoBrokerConstants.WAIT_MILLISECONDS);
		TouchAction action1 = new TouchAction(driver);
		action1.tap(new PointOption().withCoordinates(x, y)).perform().release();
		searchPage.nearbyCheckBox.click();
		searchPage.twoBHKButton.click();
		searchPage.threeBHKButton.click();
		searchPage.searchButton.click();
		Thread.sleep(NoBrokerConstants.WAIT_MILLISECONDS);
		TouchAction finger = new TouchAction(driver);
		int startx = (int) (size.width * NoBrokerConstants.SIZE_RATIO_FIVE);
		int endx = (int) (size.width * NoBrokerConstants.SIZE_RATIO_FIVE);
		int starty = (int) (size.height * NoBrokerConstants.SIZE_RATIO_EIGHT);
		int endy = (int) (size.height * NoBrokerConstants.SIZE_RATIO_ONE);
		for (int index = NoBrokerConstants.INDEX_ZERO; index < NoBrokerConstants.INDEX_THREE; index++) {
			finger.press(PointOption.point(startx, starty))
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(NoBrokerConstants.WAIT_MILLISECONDS)))
					.moveTo(PointOption.point(endx, endy)).release().perform();
		}
		// Search Results Page Operation
		SearchResultsPage searchResultPage = new SearchResultsPage(driver);
		Thread.sleep(NoBrokerConstants.WAIT_MILLISECONDS_1);
		searchResultPage.targetProperty.click();
		for (int index = NoBrokerConstants.INDEX_ZERO; index < NoBrokerConstants.INDEX_EIGHT; index++) {
			if (index == NoBrokerConstants.INDEX_SEVEN) {
				if (searchResultPage.wrongInfoButton.isDisplayed()) {
					break;
				}
			} else {
				finger.press(PointOption.point(startx, starty))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(NoBrokerConstants.WAIT_MILLISECONDS)))
						.moveTo(PointOption.point(endx, endy)).release().perform();
			}
		}
		searchResultPage.wrongInfoButton.click();
		// Wrong information selection Page Operation
		WrongInfoSelectPage wrongInfopage = new WrongInfoSelectPage(driver);
		wrongInfopage.location.click();
		wrongInfopage.fakePhotos.click();
		wrongInfopage.bhkType.click();
		wrongInfopage.availabilityDate.click();
		wrongInfopage.price.click();
		wrongInfopage.otherOption.click();
		wrongInfopage.reportButton.click();
		startx = (int) (size.width * NoBrokerConstants.SIZE_RATIO_FIVE);
		endx = (int) (size.width * NoBrokerConstants.SIZE_RATIO_FIVE);
		starty = (int) (size.height * NoBrokerConstants.SIZE_RATIO_THREE);
		endy = (int) (size.height * NoBrokerConstants.SIZE_RATIO_ONE);
		// Edit suggestion Page Operation
		EditSuggestionPage editSuggestionPage = new EditSuggestionPage(driver);
		editSuggestionPage.currentLocation.clear();
		for (int index = NoBrokerConstants.INDEX_ZERO; index < NoBrokerConstants.INDEX_EIGHT; index++) {
			if (index == NoBrokerConstants.INDEX_THREE) {
				List<WebElement> targetElements = editSuggestionPage.suggestEditElements;
				targetElements.get(NoBrokerConstants.INDEX_THREE).click();
				editSuggestionPage.moreThan4Bhk.click();
			} else if (index == NoBrokerConstants.INDEX_SEVEN) {
				editSuggestionPage.enterValue(editSuggestionPage.commentData, NoBrokerConstants.INPUT_TESTDATA);
			} else {
				finger.press(PointOption.point(startx, starty))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(NoBrokerConstants.WAIT_MILLISECONDS)))
						.moveTo(PointOption.point(endx, endy)).release().perform();
			}
		}
		editSuggestionPage.saveButton.click();
		Assert.assertTrue((editSuggestionPage.messageDialogElements.get(NoBrokerConstants.INDEX_ZERO).getText()).equals(NoBrokerConstants.MESSAGE_DATA));
	}
}
