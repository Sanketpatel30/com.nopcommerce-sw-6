package com.nopcommerce.demo.www.steps;

import com.cucumber.listener.Reporter;
import com.nopcommerce.demo.www.propertyreader.PropertyReader;
import com.nopcommerce.demo.www.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.junit.Before;
import java.io.IOException;

import static com.nopcommerce.demo.www.browserfactory.ManageBrowser.driver;

public class Hooks {

    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));

    }

    public void selectBrowser(String browser) {
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();

    }

    public void closeBrowser() {
    }
}
