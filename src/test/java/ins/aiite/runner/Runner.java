package ins.aiite.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Anand\\MyBatches\\AprilBatchCucumberProject\\src\\test\\java\\ins\\aiite\\adacitin\\feature",
                  glue="ins.aiite.stepdefinition", dryRun = false, monochrome = true, publish=true, 
                  plugin= {"pretty","html:target/reports/htmlreport.html","json:target/reports/jsonreport.json",
                  "rerun:target/rerun.txt"})
public class Runner {

	
	//monochrome - avoid printing special characters in console
	//pretty/summary
	//tags = "@asMaps",
}
