import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;

public class HB_DEPOSIT_MONEY extends HB_RESOURCES{

    public HB_DEPOSIT_MONEY(WebDriver HB_driver) {
        super(HB_driver);
    }

    final static String USER_NAME = HB_RESOURCES.USER_NAME;
    final static String USER_PASSWORD = HB_RESOURCES.USER_PASSWORD;
    public static String USER_ACCOUNT_NAME = HB_RESOURCES.USER_ACCOUNT_NAME;
    static String ACCOUNT_BALANCE;
    static String ACCOUNT_DEPOSIT_FEE;
    static String ACCOUNT_BALANCE_NEW_10;
    static String ACCOUNT_BALANCE_NEW_20;


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

    @FindBy(xpath = "//tr[.//td[text()='Balance']]//td[text()='10000.00']")
    public WebElement elementAccountBalance;

    @FindBy(xpath = "//a[text()='デポジット']")
    public WebElement elementAccountDepositLink;

    @FindBy(css = "input")
    public WebElement elementAccountInputMoney;

    @FindBy(xpath = "/html/body/div/div/div/div/span[4]")
    public WebElement elementAccountDepositFee;

    @FindBy(css = "button")
    public WebElement elementAccountDepositButton;

    @FindBy(xpath = "/html/body/div/div/div/div/div/table/tbody/tr[1]/td[2]")
    public WebElement elementAccountBalanceNew;

    @FindBy(xpath =  "/html/body/div/div/div/div/div/button")
    public WebElement elementLogoutButton;



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

    public void AccountBalance(){
        ACCOUNT_BALANCE = this.elementAccountBalance.getText();
    }

    public void AccountDepositLink(){
        this.elementAccountDepositLink.click();
    }

    public void AccountInputMoney(){
        this.elementAccountInputMoney.sendKeys("100");
        this.elementAccountInputMoney.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE);
        this.elementAccountInputMoney.sendKeys("10000.00");
    }

    public void AccountDepositFee(){
        ACCOUNT_DEPOSIT_FEE = this.elementAccountDepositFee.getText();
    }

    public void AccountDepositButton(){
        this.elementAccountDepositButton.click();
    }

   public void AccountBalanceNew(){
        ACCOUNT_BALANCE_NEW_10 = this.elementAccountBalanceNew.getText();
        ACCOUNT_BALANCE_NEW_20 = this.elementAccountBalanceNew.getText();
    }

    public void LogOutButton(){
        this.elementLogoutButton.click();
    }


}












