package org.example.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "C:\\Users\\dulee\\MavenIntelliJDemo\\src\\test\\resources\\features", glue = "org.example.definitions",
        plugin = {})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
}
