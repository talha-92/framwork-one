package TestPages;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTestTwo extends BaseTest{
    @Parameters({"emailID", "password"})
    @Test
    public void loginTest(String paramID, String paramPass) throws InterruptedException {
        loginPage.login(paramID, paramPass);
    }
}
