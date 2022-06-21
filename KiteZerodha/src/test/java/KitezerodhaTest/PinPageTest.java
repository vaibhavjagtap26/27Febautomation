package KitezerodhaTest;



import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class PinPageTest {
	WebDriver driver;
	@BeforeMethod
	public void browser() {
		driver = Browser.openbrowser();
	}
	@Test
	public void loginWithvalidCredentials() throws EncryptedDocumentException, IOException, InterruptedException {
	ZerodhaLoginPage obj = new ZerodhaLoginPage(driver);
     String userName =Parametrization.getdata(0, 1);
		obj.enteruserid(userName);
		String pass=Parametrization.getdata(1, 1);
		obj.enterpassword(pass);
		obj.clickonlogin();
		ZerodhaPinPage obj1 = new ZerodhaPinPage(driver);
		String pinnumber = Parametrization.getdata(2,1);
		System.out.println(pinnumber);
		obj1.Enterpin(pinnumber,driver);
		obj1.cliconContinue();
}
}


