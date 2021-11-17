package TestPages;

import com.heatclinic.pages.BillingShippingInforPage;
import org.testng.annotations.Test;

public class BillingShippingInfoTest extends CheckoutPageTest{
    @Test
    public void billingShippingInfoTest() throws InterruptedException {
        System.out.println("Created end to end tests for the whole checkout process");
        checkoutPageTest();
        BillingShippingInforPage.billingShippingInforPage();

    }
}

