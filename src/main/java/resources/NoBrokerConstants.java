package resources;
/**
 * @class NoBrokerConstants
 * @class_description NoBrokerConstants class consists of all the constants related to verifyAbuseReport functionality
 * @created date 15-08-2020
 * @author VIKASH
 *
 */
public class NoBrokerConstants {
	//Constants related to Desired Capabilities
	public static final String APP_PACKAGE = "appPackage";
	public static final String APP_ACTIVITY = "appActivity";
	public static final String DEVICE_NAME = "deviceName";
	public static final String PLATFORM_NAME = "platformName";
	public static final String PLATFORM_VERSION = "platformVersion";
	public static final String AUTOMATION_NAME = "automationName";
	public static final String NO_RESET = "noReset";
	public static final String PACKAGE_NAME = "com.nobroker.app";
	public static final String ACTIVITY_NAME = "com.nobroker.app.activities.NBSplashScreen";
	public static final String DEVICE_LENOVO = "Lenovo";
	public static final String PLATFORM_ANDROID = "Android";
	public static final String ANDROID_VERSION = "8";
	public static final String AUTOMATOR_VERSION = "UiAutomator1";
	public static final boolean NO_RESET_VALUE = true;
	public static final String TARGET_URL = "http://0.0.0.0:4723/wd/hub";
	//constants related to test data values
	public static final String BANGALORE_CITY = "Bangalore";
	public static final String MARATHAHALLI = "Marathahalli";
	public static final String HSR_LAYOUT = "HSR Layout";
    //constants related to various conditional operations
	public static final int INDEX_ZERO = 0;
	public static final int INDEX_THREE = 3;
	public static final int INDEX_EIGHT = 8;
	public static final int INDEX_SEVEN = 7;
	public static final float SIZE_RATIO_ONE = 0.1F;
	public static final float SIZE_RATIO_FIVE = 0.5F;
	public static final float SIZE_RATIO_EIGHT = 0.8F;
	public static final float SIZE_RATIO_ONE_FIVE = 0.15F;
	public static final float SIZE_RATIO_THREE = 0.3F;
	public static final int WAIT_MILLISECONDS = 3000;
	public static final int WAIT_MILLISECONDS_1 = 1000;
	public static final String INPUT_TESTDATA = "testdata";
	public static final String MESSAGE_DIALOG = "android.widget.TextView";
	public static final String MESSAGE_DATA = "Thank you for the feedback";
	//constants related to various locators
	//locator constants related to main page
	public static final String BUY_PROPERTY = "com.nobroker.app:id/buyLayout";
	public static final String SEARCH_TEXT = "com.nobroker.app:id/searchEditHome";
	//locator constants related to Edit Suggestion Page
	public static final String CURRENT_LOCATION = "com.nobroker.app:id/actv_location";
	public static final String SUGGEST_EDIT_ELEMENTS = "android.widget.TextView";
	public static final String MORE_THAN_4_BHK = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]";
	public static final String COMMENT_DATE = "com.nobroker.app:id/edt_others";
	public static final String SAVE_BUTTON = "com.nobroker.app:id/btn_save";
	//locator constants related to search Page
	public static final String CITY_DROP_DOWN = "android.widget.Spinner";
	public static final String BANGALORE_DATA = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]";
	public static final String SEARCH_TEXT_BOX = "com.nobroker.app:id/localityAutoCompleteTxt";
	public static final String NEARBY_CHECK_BOX = "com.nobroker.app:id/nearByRadio";
	public static final String TWO_BHK_BUTTON = "com.nobroker.app:id/bhktwo";
	public static final String THREE_BHK_BUTTON = "com.nobroker.app:id/bhkthree";
	public static final String SEARCH_BUTTON = "com.nobroker.app:id/searchProperty";
	//locator constants related to search Results Page
	public static final String TARGET_PROPERTY = "com.nobroker.app:id/property_thumbnail";
	public static final String WRONG_INFO_BUTTON = "com.nobroker.app:id/tv_report_wrong_info";
	//locator constants related to wrong info select page
	public static final String LOCATION = "com.nobroker.app:id/cb_location";
	public static final String FAKE_PHOTOS = "com.nobroker.app:id/cb_fake_photos";
	public static final String BHK_TYPE = "com.nobroker.app:id/cb_bhk_type";
	public static final String AVAILABILITY_DATE = "com.nobroker.app:id/cb_availability_date";
	public static final String PRICE = "com.nobroker.app:id/cb_price";
	public static final String OTHER_OPTION = "com.nobroker.app:id/cb_other";
	public static final String REPORT_BUTTON = "com.nobroker.app:id/btn_report";
}
