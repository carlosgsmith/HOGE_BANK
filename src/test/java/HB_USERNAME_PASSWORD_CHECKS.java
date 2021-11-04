import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HB_USERNAME_PASSWORD_CHECKS extends HB_RESOURCES{

    public HB_USERNAME_PASSWORD_CHECKS(WebDriver HB_driver) {
        super(HB_driver);
    }

    final static String USER_NAME3 = HB_RESOURCES.USER_NAME3;//"LessThan8";
    final static String USER_PASSWORD3 = HB_RESOURCES.USER_PASSWORD3;//"less<8";

    final static String USER_NAME4 = HB_RESOURCES.USER_NAME4;//"LargerThan32";
    final static String USER_PASSWORD4 = HB_RESOURCES.USER_PASSWORD4;//"!LargerThanThirtyTwo>32Characters!";

    final static String USER_NAME5 = HB_RESOURCES.USER_NAME5;//"White Spaces Here";
    final static String USER_PASSWORD5 = HB_RESOURCES.USER_PASSWORD5;//"!2_White_Spaces!";

    final static String USER_NAME6 = HB_RESOURCES.USER_NAME6;//"";
    final static String USER_PASSWORD6 = HB_RESOURCES.USER_PASSWORD6;//"!1_Blank_User_Name!";

    final static String USER_NAME7 = HB_RESOURCES.USER_NAME7;//"No_Numbers";
    final static String USER_PASSWORD7 = HB_RESOURCES.USER_PASSWORD7;//"!No_Numbers!";

    final static String USER_NAME8 = HB_RESOURCES.USER_NAME8;//"No_Caps";
    final static String USER_PASSWORD8 = HB_RESOURCES.USER_PASSWORD8;//"!1no_caps1!";

    public static String USER_ACCOUNT_NAME_MESSAGE;

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

    //user account name message
    @FindBy(xpath = "/html/body/div/div/div/div/span")
    public WebElement elementUserAccountNameMessage;
    //user account name message


    //less than eight characters check
    public void InputUserName3(){
        this.elementInputUserName.sendKeys(USER_NAME3);
    }

    public void InputPassword3(){
        this.elementInputPassword.sendKeys(USER_PASSWORD3);
    }

    public void SignUpButton3(){
        this.elementSignUpButton.click();
    }

    public void SignUpAttempt_1_3(){
        this.elementInputUserName_1.sendKeys(USER_NAME3);
        this.elementInputPassword.sendKeys(USER_PASSWORD3);
        this.elementSignUpButton_1.click();
    }

    public void UserAccountNameMessage3(){
         USER_ACCOUNT_NAME_MESSAGE = this.elementUserAccountNameMessage.getText();
    }


    //larger than 32 characters check
    public void InputUserName4(){
        this.elementInputUserName.sendKeys(USER_NAME4);
    }

    public void InputPassword4(){
        this.elementInputPassword.sendKeys(USER_PASSWORD4);
    }

    public void SignUpButton4(){
        this.elementSignUpButton.click();
    }

    public void SignUpAttempt_1_4(){
        this.elementInputUserName_1.sendKeys(USER_NAME4);
        this.elementInputPassword.sendKeys(USER_PASSWORD4);
        this.elementSignUpButton_1.click();
    }

    public void UserAccountNameMessage4(){
        USER_ACCOUNT_NAME_MESSAGE = this.elementUserAccountNameMessage.getText();
    }


    //Cannot contain Whitespaces check
    public void InputUserName5(){
        this.elementInputUserName.sendKeys(USER_NAME5);
    }

    public void InputPassword5(){
        this.elementInputPassword.sendKeys(USER_PASSWORD5);
    }

    public void SignUpButton5(){
        this.elementSignUpButton.click();
    }

    public void SignUpAttempt_1_5(){
        this.elementInputUserName_1.sendKeys(USER_NAME5);
        this.elementInputPassword.sendKeys(USER_PASSWORD5);
        this.elementSignUpButton_1.click();
    }

    public void UserAccountNameMessage5(){
        USER_ACCOUNT_NAME_MESSAGE = this.elementUserAccountNameMessage.getText();
    }


    //Username is blank (empty) check
    public void InputUserName6(){
        this.elementInputUserName.sendKeys(USER_NAME6);
    }

    public void InputPassword6(){
        this.elementInputPassword.sendKeys(USER_PASSWORD6);
    }

    public void SignUpButton6(){
        this.elementSignUpButton.click();
    }

    public void SignUpAttempt_1_6(){
        this.elementInputUserName_1.sendKeys(USER_NAME6);
        this.elementInputPassword.sendKeys(USER_PASSWORD6);
        this.elementSignUpButton_1.click();
    }

    public void UserAccountNameMessage6(){
        USER_ACCOUNT_NAME_MESSAGE = this.elementUserAccountNameMessage.getText();
    }

    //Password must contain numbers check
    public void InputUserName7(){
        this.elementInputUserName.sendKeys(USER_NAME7);
    }

    public void InputPassword7(){
        this.elementInputPassword.sendKeys(USER_PASSWORD7);
    }

    public void SignUpButton7(){
        this.elementSignUpButton.click();
    }

    public void SignUpAttempt_1_7(){
        this.elementInputUserName_1.sendKeys(USER_NAME7);
        this.elementInputPassword.sendKeys(USER_PASSWORD7);
        this.elementSignUpButton_1.click();
    }

    public void UserAccountNameMessage7(){
        USER_ACCOUNT_NAME_MESSAGE = this.elementUserAccountNameMessage.getText();
    }


    //Password must contain capital letters check
    public void InputUserName8(){
        this.elementInputUserName.sendKeys(USER_NAME8);
    }

    public void InputPassword8(){
        this.elementInputPassword.sendKeys(USER_PASSWORD8);
    }

    public void SignUpButton8(){
        this.elementSignUpButton.click();
    }

    public void SignUpAttempt_1_8(){
        this.elementInputUserName_1.sendKeys(USER_NAME8);
        this.elementInputPassword.sendKeys(USER_PASSWORD8);
        this.elementSignUpButton_1.click();
    }

    public void UserAccountNameMessage8(){
        USER_ACCOUNT_NAME_MESSAGE = this.elementUserAccountNameMessage.getText();
    }


}
