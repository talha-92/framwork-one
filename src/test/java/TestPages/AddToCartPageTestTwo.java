package TestPages;

import com.heatclinic.pages.AddToCartPage;
import com.heatclinic.pages.LoginPage;
import org.testng.annotations.Test;

public class AddToCartPageTestTwo extends BaseTest{
    @Test(priority=1)
    public void registrationTest() throws InterruptedException {
        registrationPage.registerAccount();

    }

    @Test(priority=2)
    public void logInTest(LoginPage logInPage) throws InterruptedException {
        logInPage.login();
    }

    @Test(priority=3)
    public void AddToCartPageTest(AddToCartPage addToCartPage) throws InterruptedException {
        addToCartPage.addtoCart();
    }
}
