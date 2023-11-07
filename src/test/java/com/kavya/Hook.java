package com.kavya;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook {

	@Before
	public static void setUp() {
		Helper.setUpDriver();
	}
	
	@After
	public static void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[]screeenshot = ((TakesScreenshot)Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screeenshot, "image/png",scenario.getName());
		}
		Helper.tearDown();
	}
}

