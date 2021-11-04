import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HB_RESOURCES {

    final static String BASE_URL = "https://anylogi-recruitment.web.app";
    final static String CHROME_DRIVER_FILE = "chromedriver.exe";

    final static String USER_NAME = "AnyMind_222222";
    final static String USER_PASSWORD = "!AnyMind_222222!";

    final static String USER_NAME1 = "AnyMind_111111";
    final static String USER_PASSWORD1 = "!AnyMind_111111!";

    final static String USER_NAME2 = "AnyMind12345";
    final static String USER_PASSWORD2 = "!AnyMind12345!";

    final static String USER_NAME3 = "LessThan8";
    final static String USER_PASSWORD3 = "less<8";

    final static String USER_NAME4 = "LargerThan32";
    final static String USER_PASSWORD4 = "!LargerThanThirtyTwo>32Characters!";

    final static String USER_NAME5 = "White Spaces Here";
    final static String USER_PASSWORD5 = "!2_White_Spaces!";

    final static String USER_NAME6 = "";
    final static String USER_PASSWORD6 = "!1_Blank_User_Name!";

    final static String USER_NAME7 = "No_Numbers";
    final static String USER_PASSWORD7 = "!No_Numbers!";

    final static String USER_NAME8 = "No_Caps";
    final static String USER_PASSWORD8 = "!1no_caps1!";

    public static String USER_ACCOUNT_NAME;

    protected WebDriver HB_driver;

    public HB_RESOURCES(WebDriver HB_driver) {
        this.HB_driver = HB_driver;
        PageFactory.initElements(HB_driver, this);
    }

}
