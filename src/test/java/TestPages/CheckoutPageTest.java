package TestPages;

import com.heatclinic.pages.CheckoutPage;
import org.testng.annotations.Test;

public class CheckoutPageTest extends AddToCartPageTest{
    @Test
    public void checkoutPageTest () throws InterruptedException {
        System.out.println("This is a test");
        //addToCartTest();
        CheckoutPage.checkoutPage();
    }
}
