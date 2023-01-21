package com.adactin.listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.objects.BasePage;
import io.qameta.allure.Attachment;

public class TestAllureListeners implements ITestListener {

	@Attachment(value = "Page screenshot", type = "image/png")
	public byte[] saveScreenShot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

	@Attachment(value = "{0}", type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}

	@Attachment(value = "{0}", type = "text/html")
	public static String attachHtml(String html) {
		return html;
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("I m in onTestStart method " + result.getTestName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I m in onTestSuccess method " + result.getTestName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I m in onTestFailure method " + result.getTestName());
		Object instance = result.getInstance();
		if(BasePage.driver instanceof WebDriver) {
			System.out.println("Screenshot is captured " + result.getTestName());
			saveScreenShot(BasePage.driver);
		}

			saveTextLog(result.getTestName() + " failed and screenshot taken ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("I m in onTestSkipped method " + result.getTestName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("I m in onTestFailedButWithinSuccessPercentage method " + result.getTestName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("I m in onStart method " + context.getName());
		context.setAttribute("webdriver", BasePage.driver);
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("I m in onFinish method " + context.getName());
	}

}
