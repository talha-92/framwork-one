package TestPages;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void LoginTest() throws InterruptedException {
        System.out.println("This is a login Page");
        loginPage.login();
    }
}
