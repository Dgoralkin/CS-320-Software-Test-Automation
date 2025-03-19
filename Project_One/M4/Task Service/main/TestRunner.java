package test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@Suite
@IncludeEngines("junit-jupiter")
@SelectClasses({ TaskTest.class, TaskServiceTest.class })
public class TestRunner {
    @Test
    public void runAllTests() {
        // This will execute all tests in TaskTest and TaskServiceTest
    }
}