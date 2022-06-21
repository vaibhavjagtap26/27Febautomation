package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class Mainhomepage {
      @FindBy(xpath="//input[@type='text']")private WebElement search;
      @FindBy(xpath="//span[text()='TATAMOTORS JUN FUT']")private WebElement tata;
      @FindBy(xpath="//span[@class='nice-name']")private List<WebElement> element;
      @FindBy(xpath="//button[@class='button-blue buy']")private WebElement byshare;
      @FindBy(xpath="//button[@data-balloon='Sell']")private WebElement sellshare;
      @FindBy(xpath="//label[text()='Regular']")private WebElement regular;
      @FindBy(xpath="//label[text()='AMO']")private WebElement AMO;
      @FindBy(xpath="//label[text()='Cover']")private WebElement cover;
      @FindBy(xpath="//label[text()='Iceberg']")private WebElement Iceberg;
      @FindBy(xpath="//input[@label='Qty.']")private WebElement QTY;
      @FindBy(xpath="//label[text()='Price']")private WebElement price;
      @FindBy(xpath="//label[text()='Trigger price']")private WebElement Triggerprice ;
      @FindBy(xpath="//input[@value='MARKET']")private WebElement Sellatmarketprice ;
      @FindBy(xpath="//input[@value='LIMIT']")private WebElement Sellatapreferredprice  ;
      @FindBy(xpath="//input[@value='SL']")private WebElement Sellatapreferredpricewithastoploss;
      @FindBy(xpath="//input[@value='SL-M']")private WebElement Sellatmarketpricewithstoploss;
      @FindBy(xpath="//input[@value='MIS']")private WebElement intradayMIS;
      @FindBy(xpath="//input[@value='NRML']")private WebElement LongtermCNC;
      @FindBy(xpath="//span[@data-balloon='More options']")private WebElement moreoptions;
      @FindBy(xpath="//input[@value='DAY']")private WebElement day;
      @FindBy(xpath="")private WebElement immediate;
      @FindBy(xpath="")private WebElement minute;
      @FindBy(xpath="//button[@class='submit']")private WebElement bye; 
      @FindBy(xpath="//button[@class='submit']")private WebElement sell;      

public Mainhomepage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void Enteronserch(WebDriver driver ,String value) {
	FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
	wait.withTimeout(Duration.ofMillis(3000));
	wait.pollingEvery(Duration.ofMillis(100));
	wait.ignoring(Exception.class);
	wait.until(ExpectedConditions.visibilityOf(search));
	search.sendKeys(value);
}
public void searchelement(WebDriver driver) throws InterruptedException {
	Thread.sleep(2000);
	int number =element.size();
	System.out.println(number);
	for(int i=0;i<number;i++) {
		 WebElement search1 =element.get(i);
		 System.out.println(search1.getText());
		 if(search1.getText().equalsIgnoreCase("TATACOFFEE")){
		 Actions action = new Actions(driver);
			action.moveToElement(search1);
			action.perform();
			 byshare.click();
			 }
	}
}

public void clickonbyshare(WebDriver driver ,String value) {
	Actions action = new Actions(driver);
	action.moveToElement(tata);
	action.perform();
	 byshare.click();
	 regular.click();
	 Actions action1 = new Actions(driver);
	 action1.click(intradayMIS);
	 action1.perform();
	 action1.click(Sellatmarketprice);
	 action1.perform();
	 QTY.sendKeys(value);
	 bye.click();
	 
	}
public void clickonsellshare(WebDriver driver,String value) {
	Actions action = new Actions(driver);
action.moveToElement(tata);
action.perform();
 sellshare.click();
 AMO.click();
 Actions action1 = new Actions(driver);
 action1.click(intradayMIS);
 action1.perform();
 action1.click(Sellatmarketprice);
 action1.perform();
 QTY.sendKeys(value);
 sell.click();
 
}
}