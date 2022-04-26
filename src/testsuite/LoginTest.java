package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String BaseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);
    }

    @Test
    // Verifying user should be able to login with valid credentials
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        sendTextToElement(By.id("txtUsername"),"Admin");
        sendTextToElement(By.id("txtPassword"),"admin123");
        clickOnElement(By.xpath("//input[@id='btnLogin']"));
        verifyElements("Welcome text is not displayed","Welcome Fathi",By.id("welcome"));
    }
    @After
    public void tearDown()
    {
      closeBrowser();
    }

}
