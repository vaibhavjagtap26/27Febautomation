package POM;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuptest {
	 @FindBy(xpath="//input[@id='user_mobile']") private WebElement mobileno;
	 @FindBy(xpath="//button[@id=\"open_account_proceed_form\"]") private WebElement Continue;
	 @FindBy(xpath="//input[@label=\"Mobile OTP\"]") private WebElement mobileOtp;
	 @FindBy(xpath="//button[@class='button button-blue']") private WebElement signup;
	 @FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement Signup;
	 @FindBy (xpath="//main[@class='content parent-content']")private WebElement Main;
	 public Signuptest (WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	 public void clickonSignup() {
		  Signup.click();
	 }
	  
	  public void enterMobileno(WebDriver driver ,String mobileNO) {
		  Set<String> addresses= driver.getWindowHandles();
			Iterator<String> i =addresses.iterator();
			System.out.println(i.next());
			
			while(i.hasNext())
			{
				String address = i.next();
				  driver.switchTo().window(address);
				 String CurrentTitle = driver.getTitle();
				if(CurrentTitle.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha")) 
				{
					mobileno.sendKeys(mobileNO);
					
				}
	  }
	  }
	  public void clickoncontinue() {
		  Continue.click();
	  }
	  public void entermobileotp(String mobileotp) {
		 mobileOtp.sendKeys(mobileotp);
	  }
	  public void clickonsignup() {
		  signup.click();
	  }
}
