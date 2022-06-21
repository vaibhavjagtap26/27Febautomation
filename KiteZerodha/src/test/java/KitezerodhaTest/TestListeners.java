package KitezerodhaTest;
import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import Utility.Screenshot;

public class TestListeners extends BaseTest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"Test has Started");
	}

	
	public void onTestFailure(ITestResult result) {
		try {
			Screenshot.takeScreenshot(driver,result.getName());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test Success");
	}

	public void onTestSkiped(ITestResult result) {
		System.out.println(result.getName()+"Test Skipped");
	}

}
