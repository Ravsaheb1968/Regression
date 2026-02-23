package testClasses;

import org.testng.annotations.Test;

import pageObject.LoginPage;
import testBase.TestBase;

public class TC01_Login extends TestBase {

    @Test
    public void verify_Login() {

        LoginPage lp = new LoginPage(driver);
        lp.enterUsername("Admin");
        lp.enterPassword("admin123");
        lp.clickLoginButton();
    }
}
