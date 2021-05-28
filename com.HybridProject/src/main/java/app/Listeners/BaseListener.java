package app.Listeners;

import org.testng.IClass;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class BaseListener extends TestListenerAdapter {
	
	@Override
	public void onTestStart(ITestResult itr) {
		log("Test Started......");
	}
	
	@Override
	public void onTestSuccess(ITestResult itr) {
		log("Test" +itr.getName() + "Passed");
		log(itr.getTestClass());
		log("Prority of the method is " + itr.getMethod().getPriority());
	}
	
	@Override
	public void onTestFailure(ITestResult itr) {
		log("Test" +itr.getName() +" Failed");
		log("Priority of the method is " + itr.getMethod().getPriority());
		//BrowserDriver.takeScreenShot();
	}
	
	
	
	@Override
	public void onTestSkipped(ITestResult itr) {
		log("Test" +itr.getName() + "Skipped");
	}
	
	private void log(String methodName) {
		System.out.println(methodName);
	}
	
	private void log(IClass testClass) {
		System.out.println(testClass);
	}

}
