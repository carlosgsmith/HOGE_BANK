import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;


public class HB_SIGN_UP extends HB_RESOURCES{

    //driver used for getting and setting objects
    public HB_SIGN_UP(WebDriver HB_driver) {
        super(HB_driver);
    }

        final static String USER_NAME = HB_RESOURCES.USER_NAME;
        final static String USER_PASSWORD = HB_RESOURCES.USER_PASSWORD;
        public static String USER_ACCOUNT_NAME = HB_RESOURCES.USER_ACCOUNT_NAME;

        //username
        @FindBy(xpath = "/html/body/div[1]/div/div/div/div/input[1]")
        private WebElement elementInputUserName;

        @FindBy(xpath = "/html/body/div/div/div/div/input[1]")
        private WebElement elementInputUserName_1;
        //username

        //password
        @FindBy(css = "input[type='password']")
        private WebElement elementInputPassword;
       //password

        //button
        @FindBy(xpath = "/html/body/div/div/div/div/div/button[1]")
        private WebElement elementSignUpButton;

        @FindBy(xpath = "//*[contains(text(),'SIGNUP')]")
        private WebElement elementSignUpButton_1;
        //button

        //user account name
        @FindBy(xpath = "//th")
        public WebElement elementUserAccountName;
        //user account name


        public void InputUserName(){
            this.elementInputUserName.sendKeys(USER_NAME);
        }

        public void InputPassword(){
            this.elementInputPassword.sendKeys(USER_PASSWORD);
        }

        public void SignUpButton(){
            this.elementSignUpButton.click();
        }

        public void SignUpAttempt_1(){
            this.elementInputUserName_1.sendKeys(USER_NAME);
            this.elementInputPassword.sendKeys(USER_PASSWORD);
            this.elementSignUpButton_1.click();
        }

        public void UserAccountName(){
            HB_driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            USER_ACCOUNT_NAME = this.elementUserAccountName.getText();
        }


}


