package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/eLearning/eLearning.feature"},
glue= {"stepDefination"},
monochrome=true,
strict=true,
plugin= {"html:testout/cucumber.html","junit:testout/cucumber.xml","json:testout/cucumber.json","testng:testout/cucumber1.xml" }
		)
public class Test_Runner {
	
	

}
