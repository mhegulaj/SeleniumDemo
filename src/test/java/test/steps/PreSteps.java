package test.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import test.baseclass.BaseClass;

public class PreSteps extends BaseClass{
	
	@After
	public static void takeFailedScreenShot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot src = (TakesScreenshot)driver;
			byte[] srcFile = src.getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcFile, "image/png", scenario.getName());
		}
	}
}
