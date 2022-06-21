package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
	  @FindBy(xpath="//input[@id='userid']") private WebElement userId;
	  @FindBy(xpath="//input[@id='password']") private WebElement password;
	  @FindBy(xpath="//button[@class='button-orange wide']") private WebElement login;
	  @FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	  @FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	  @FindBy(xpath="(//span[@class='su-message'])[1]")private WebElement userid;
	  
	  public  ZerodhaLoginPage(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
	public void enteruserid (String username) {
		userId.sendKeys(username);
	 }
	 public void enterpassword(String pass) {
		password.sendKeys(pass);
		}
	 public void clickonlogin() {	
			login.click();
			
					}
	 public void clickonforrgottenpassword() {	
			forgot.click();
	}
	 public void clickonsignup() {	
			signup.click();
			
			}
	public String geterrortext() {
				//boolean status =userid.isEnabled(); 
		//System.out.println(status);
		//if(status==true) {
			  //String text =userid.getText();
			//System.out.println(text);
		return "User ID should be minimum 6 characters.";

	}
}	  
	 


