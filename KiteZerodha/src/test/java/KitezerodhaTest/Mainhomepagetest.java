package KitezerodhaTest;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POJO.Browser;
import POM.Mainhomepage;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class Mainhomepagetest {
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
		String pinnumber = Parametrization.getdata(2, 1);
		System.out.println(pinnumber);
		obj1.Enterpin(pinnumber,driver);
		obj1.cliconContinue();
	    Mainhomepage obj2= new Mainhomepage(driver);
	    //obj2.Enteronserch(driver, "TATAMOTORS JUN FUT");
	    //obj2.clickonbyshare(driver,"2850");
	   //obj2.clickonsellshare(driver,"1425");
	    obj2.searchelement(driver);
}
}

