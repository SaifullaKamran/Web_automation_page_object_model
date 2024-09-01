package framework.automation.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import framework.automation.drivers.PageDriver;
import framework.automation.pages.LoginPage;
import framework.automation.utilities.CommonMethods;

    public class LoginTest extends CommonMethods{ 	
    @BeforeClass
    public void openUrl() throws InterruptedException {
	PageDriver.getCurrentDriver().get(url);
	timeout();
	}
	@Test
	public void testLoginMethod() throws InterruptedException {
    LoginPage loginpage=new LoginPage();
	loginpage.login();
	timeout();
		
		
	}

}
