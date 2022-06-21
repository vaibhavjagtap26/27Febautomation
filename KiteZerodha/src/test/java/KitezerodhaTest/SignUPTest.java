package KitezerodhaTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POJO.Browser;
import POM.Signuptest;


public class SignUPTest extends BaseTest{
	@BeforeMethod
	public void browser() {
		driver = Browser.openbrowser();
	}
	@Test
	public void ClickOnSignUpTest() throws InterruptedException {
		Signuptest obj1 = new Signuptest(driver);
		obj1.clickonSignup();
		obj1.enterMobileno(driver,"7558259412");
		obj1.clickoncontinue();
	}
}
