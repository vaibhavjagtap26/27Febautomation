package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaforgotpage {
	  @FindBy(xpath="//label[@for='radio-32']") private WebElement IremembermyuserID;
	  @FindBy(xpath="//label[@for='radio-33']") private WebElement IforgotmyUserId;
	  @FindBy(xpath="(//input[@type='text'])[1]") private WebElement PAN;
	  @FindBy(xpath="//label[@for='radio-37']") private WebElement ReciveOnemail;
	  @FindBy(xpath="//a[text()=//label[@for='radio-38']") private WebElement ReciveOnSMS;
	  @FindBy(xpath="(//input[@type='text'])[2]")private WebElement mobileNumber;
	  @FindBy(xpath="(//input[@type='text'])[3]")private WebElement Captcha;
	  @FindBy(xpath="//button[@type='submit']")private WebElement reset;
	  public  Zerodhaforgotpage(WebDriver driver) {
		  PageFactory.initElements(driver,this);
	  }
	  public void clickonIrememberuserid() {
		  IremembermyuserID.click();
	  }
	  public void clickonIforgotuserid() {
		  IforgotmyUserId.click();
	  }
	  public void enterpanno(String panNO) {
		  PAN.sendKeys(panNO);
	  }
	  public void clickonreciveonemail() {
		  ReciveOnemail.click();
	  }
	  public void clickonreciveonsms() {
		  ReciveOnSMS.click();
	  }
	  public void entermobileNumber(String number) {
		  mobileNumber.sendKeys(number);
	  }
	  public void entercaptha(String captcha) {
		  Captcha.sendKeys(captcha);
	  }
	  public void clickonReset() {
		  reset.click();
	  }
	  
	  
	  
}

