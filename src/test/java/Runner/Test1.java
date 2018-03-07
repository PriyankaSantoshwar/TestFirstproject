package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue={"Stepdefenation"},
                  plugin={"html:target/cucumber-html-report",
		                   "pretty:target/cucumber-pretty.txt"  }
		 
		 
                                
                         //  dryRun = true
		         )









public class Test1 {

}
