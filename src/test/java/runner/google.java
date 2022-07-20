package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@CucumberOptions
        (features = "src/test/resources/feature/HRMLOgin.feature",
                glue = {"stepDef"},

                plugin = {"pretty",
                        "html:target/cucumber-html-report",
                        "json:target/cucumber-reports/cucumber.json",
                        "junit:target/cucumber-reports/cucumber.xml",
                        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                        "timeline:test-output-thread/"},
                monochrome = true,
                tags = "not @smoke")


public class google extends AbstractTestNGCucumberTests {
    }


