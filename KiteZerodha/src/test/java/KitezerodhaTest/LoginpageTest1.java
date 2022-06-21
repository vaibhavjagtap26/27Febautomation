package KitezerodhaTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
//import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import POJO.Browser;
import POM.ZerodhaLoginPage;
import Utility.Parametrization;
import Utility.Report;

@Listeners(TestListeners.class)
public class LoginpageTest1 extends BaseTest{
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void extentReports() {
		reports = Report.createReport();
	}
	
	@BeforeMethod
	public void browser() {
		driver = Browser.openbrowser();
	}
	@Test
	public void loginWithvalidCredentials() throws EncryptedDocumentException, IOException {
         test = reports.createTest("loginWithvalidCredentials");
	ZerodhaLoginPage obj = new ZerodhaLoginPage(driver);
     String userName =Parametrization.getdata( 0, 1);
		obj.enteruserid(userName);
		String pass=Parametrization.getdata( 1, 1);
		obj.enterpassword(pass);
		obj.clickonlogin();
	}
	@Test
	public void ForrgottonpasswordLinkTest() {
		test = reports.createTest("ForrgottonpasswordLinkTest");
		ZerodhaLoginPage obj = new ZerodhaLoginPage(driver);
		obj.clickonforrgottenpassword();
	}
	@Test(dependsOnMethods = {"ClickonLoginwithoutDataTest"})
		public void ClickonSignupTest() {
		test = reports.createTest("ClickonSignupTest");
			ZerodhaLoginPage obj = new ZerodhaLoginPage(driver);
			obj.clickonsignup();
		}
	@Test
	public void ClickonLoginwithoutDataTest() throws EncryptedDocumentException, IOException {
		test = reports.createTest("ClickonLoginwithoutDataTest");
		ZerodhaLoginPage obj = new ZerodhaLoginPage(driver);
		obj.clickonlogin();
		String text = obj.geterrortext();
		String Exceptedtext ="User ID should be minimum  characters.";
		//Assert.assertEquals(text, Exceptedtext);
		SoftAssert softAssert =new SoftAssert();
		softAssert.assertEquals(text, Exceptedtext);
		 String userName =Parametrization.getdata( 0, 1);
			obj.enteruserid(userName);
			String pass=Parametrization.getdata( 1, 1);
			obj.enterpassword(pass);
			obj.clickonlogin();
			softAssert.assertAll();
	}
	@AfterMethod 
	public void closeBrowser(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
	}

	@AfterTest
	public void flushResult() {
		reports.flush();
	}
}	



