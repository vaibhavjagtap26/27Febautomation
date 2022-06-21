package POM;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
public class ZerodhaPinPage {
	@FindBy(xpath="//input[@id='pin']")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement Continue;
	@FindBy(xpath="//a[text()=\"Forgot 2FA?\"]")private WebElement forgot;
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;

	
	public ZerodhaPinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void Enterpin(String pinnumber,WebDriver driver) {
	FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofMillis(3000));
	wait.pollingEvery(Duration.ofMillis(100));
	wait.ignoring(Exception.class);
	wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(pinnumber);
}
public void cliconContinue() {
	Continue.click();
}
public void clickonforgot() {
	forgot.click();
}
public void clickonsignup() {
	signup.click();
}
}