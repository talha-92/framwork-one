package TestPages;

import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {
    @Test
    public void registrationTest() throws InterruptedException {
        System.out.println("This is Heat Clinic");
        registrationPage.registerAccount();
    }
}
