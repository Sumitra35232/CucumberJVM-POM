package MyRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import testBase.TestBase;


@CucumberOptions(
        features = "src/test/resources/Features",
        glue= {"stepDefinitions"},
        plugin= {"pretty","html:test-output/Cucumber-HTML-Report"},
        monochrome = true
        
        )

public class TestRunner extends TestBase {
	


	private TestNGCucumberRunner testNGCucumberRunner;
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        System.out.println("Inside Set up method");
    }
	
//	@Test(description = "Example of using TestNGCucumberRunner to invoke Cucumber")
//    public void runCukes() {
//        testNGCucumberRunner.runCukes();
//    }
	
	 @Test(dataProvider = "features")
	 public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	 
	 @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }
	
	
//	@AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//		System.out.println("Inside teardown method");
//        driver.quit();
//    }
}
