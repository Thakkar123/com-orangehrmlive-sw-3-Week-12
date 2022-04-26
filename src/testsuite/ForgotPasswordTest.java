package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);
    }

    @Test
    // Verifying user should be able to navigate to forgot password link
    public void userShouldNavigateToForgotPassword()
    {
        clickOnElement(By.linkText("Forgot your password?"));
        verifyElements("Forgot password text not displayed","Forgot Your Password?",By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));

    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }
}
