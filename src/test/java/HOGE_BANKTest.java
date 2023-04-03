import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;


public class HOGE_BANKTest {

    public WebDriver HB_driver;

    HB_SIGN_UP hb_sign_up;
    HB_DEPOSIT_MONEY hb_deposit_money;
    HB_WITHDRAW_MONEY hb_withdraw_money;
    HB_USERNAME_PASSWORD_CHECKS hb_username_password_checks;

    @Test(alwaysRun = true)
    public void Sign_Up_TC1(){
        hb_sign_up.InputUserName();
        hb_sign_up.InputPassword();
        hb_sign_up.SignUpButton();
        hb_sign_up.SignUpAttempt_1();
        hb_sign_up.UserAccountName();
        hb_sign_up.HB_driver.close();
        assertTrue(StringUtils.isNotEmpty(HB_SIGN_UP.USER_NAME));
        assertFalse(StringUtils.isWhitespace(HB_SIGN_UP.USER_NAME));
        assertEquals(HB_SIGN_UP.USER_PASSWORD, "!AnyMind_222222!");
        assertTrue(StringUtils.containsAny("0123456789", HB_SIGN_UP.USER_PASSWORD));
        assertTrue(StringUtils.isMixedCase(HB_SIGN_UP.USER_PASSWORD));
        assertEquals(HB_SIGN_UP.USER_ACCOUNT_NAME, "AnyMind_222222");
    }


    @Test(alwaysRun = true)
    public void Deposit_Money_TC2() throws InterruptedException{
        hb_deposit_money.InputUserName();
        hb_deposit_money.InputPassword();
        hb_deposit_money.SignUpButton();
        hb_deposit_money.SignUpAttempt_1();
        hb_deposit_money.UserAccountName();
        hb_deposit_money.AccountBalance();
        hb_deposit_money.AccountDepositLink();
        hb_deposit_money.AccountInputMoney();
        hb_deposit_money.AccountDepositFee();
        hb_deposit_money.AccountDepositButton();
        TimeUnit.SECONDS.sleep(10);
        hb_deposit_money.AccountBalanceNew();
        hb_deposit_money.LogOutButton();


        assertEquals( HB_DEPOSIT_MONEY.ACCOUNT_DEPOSIT_FEE, "3000.00");
        assertEquals(HB_DEPOSIT_MONEY.ACCOUNT_BALANCE, "10000.00");
        assertEquals(HB_DEPOSIT_MONEY.ACCOUNT_BALANCE_NEW_10, "17000.00");
        assertEquals(HB_DEPOSIT_MONEY.ACCOUNT_BALANCE_NEW_20, "17000.00");
    }


    @Test(alwaysRun = true)
    public void Withdraw_Money_TC3() throws InterruptedException{
        hb_withdraw_money.InputUserName();
        hb_withdraw_money.InputPassword();
        hb_withdraw_money.SignUpButton();
        hb_withdraw_money.SignUpAttempt_1();
        hb_withdraw_money.UserAccountName();
        hb_withdraw_money.AccountBalance();
        hb_withdraw_money.AccountDepositLink();
        hb_withdraw_money.AccountWithdrawalInput();
        hb_withdraw_money.AccountWithdrawalButton();
        TimeUnit.SECONDS.sleep((10));
        hb_withdraw_money.AccountBalanceNew();
        hb_withdraw_money.AccountWithdrawalFee();
        hb_withdraw_money.LogOutButton();

        assertEquals(HB_WITHDRAW_MONEY.ACCOUNT_BALANCE, "10000.00");
        assertEquals(HB_WITHDRAW_MONEY.ACCOUNT_WITHDRAWAL_FEE, "-1300.00");
        assertEquals(HB_WITHDRAW_MONEY.ACCOUNT_BALANCE_NEW_10, "8700.00");
        assertEquals(HB_WITHDRAW_MONEY.ACCOUNT_BALANCE_NEW_20, "8700.00");
    }


    @Test(alwaysRun = true)
    public void User_Password_Less_Than_Eight_TC4(){
        hb_username_password_checks.InputUserName3();
        hb_username_password_checks.InputPassword3();
        hb_username_password_checks.SignUpButton3();
        hb_username_password_checks.SignUpAttempt_1_3();
        hb_username_password_checks.UserAccountNameMessage3();
        hb_username_password_checks.HB_driver.close();

        assertEquals(HB_USERNAME_PASSWORD_CHECKS.USER_ACCOUNT_NAME_MESSAGE, "Password cannot be less than 8 characters");
    }


    @Test(alwaysRun = true)
    public void User_Password_Greater_Than_Thirty_Two_TC5(){
        hb_username_password_checks.InputUserName4();
        hb_username_password_checks.InputPassword4();
        hb_username_password_checks.SignUpButton4();
        hb_username_password_checks.SignUpAttempt_1_4();
        hb_username_password_checks.UserAccountNameMessage4();
        hb_username_password_checks.HB_driver.close();

        assertEquals(HB_USERNAME_PASSWORD_CHECKS.USER_ACCOUNT_NAME_MESSAGE, "Password cannot be longer than 32 characters");
    }


    @Test(alwaysRun = true)
    public void User_Name_Contain_White_Spaces_TC6(){
        hb_username_password_checks.InputUserName5();
        hb_username_password_checks.InputPassword5();
        hb_username_password_checks.SignUpButton5();
        hb_username_password_checks.SignUpAttempt_1_5();
        hb_username_password_checks.UserAccountNameMessage5();
        hb_username_password_checks.HB_driver.close();

        assertEquals(HB_USERNAME_PASSWORD_CHECKS.USER_ACCOUNT_NAME_MESSAGE, "User name cannot contain whitespaces");
    }


    @Test(alwaysRun = true)
    public void User_Name_Blank_TC7(){
        hb_username_password_checks.InputUserName6();
        hb_username_password_checks.InputPassword6();
        hb_username_password_checks.SignUpButton6();
        hb_username_password_checks.SignUpAttempt_1_6();
        hb_username_password_checks.UserAccountNameMessage6();
        hb_username_password_checks.HB_driver.close();

        assertEquals(HB_USERNAME_PASSWORD_CHECKS.USER_ACCOUNT_NAME_MESSAGE, "User name cannot be blank");
    }


    @Test(alwaysRun = true)
    public void User_Password_Without_Numbers_TC8(){
        hb_username_password_checks.InputUserName7();
        hb_username_password_checks.InputPassword7();
        hb_username_password_checks.SignUpButton7();
        hb_username_password_checks.SignUpAttempt_1_7();
        hb_username_password_checks.UserAccountNameMessage7();
        hb_username_password_checks.HB_driver.close();

        assertEquals(HB_USERNAME_PASSWORD_CHECKS.USER_ACCOUNT_NAME_MESSAGE, "Password must contain numbers");
    }


    @Test(alwaysRun = true)
    public void User_Password_Without_Capital_Letter_TC9(){
        hb_username_password_checks.InputUserName8();
        hb_username_password_checks.InputPassword8();
        hb_username_password_checks.SignUpButton8();
        hb_username_password_checks.SignUpAttempt_1_8();
        hb_username_password_checks.UserAccountNameMessage8();
        hb_username_password_checks.HB_driver.close();

        assertEquals(HB_USERNAME_PASSWORD_CHECKS.USER_ACCOUNT_NAME_MESSAGE, "Password must contain uppercase letters");
    }


    //@BeforeSuite
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", HB_RESOURCES.CHROME_DRIVER_FILE);
        HB_driver = new ChromeDriver();
        HB_driver.manage().window().maximize();
        HB_driver.manage().deleteAllCookies();
        HB_driver.get(HB_RESOURCES.BASE_URL);

        hb_sign_up = new HB_SIGN_UP(HB_driver);
        hb_deposit_money = new HB_DEPOSIT_MONEY(HB_driver);
        hb_withdraw_money = new HB_WITHDRAW_MONEY(HB_driver);
        hb_username_password_checks = new HB_USERNAME_PASSWORD_CHECKS(HB_driver);
    }


    //@AfterSuite
    @AfterMethod
    public void tearDown() {
         HB_driver.quit();
    }


}