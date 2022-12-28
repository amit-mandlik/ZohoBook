package TestRunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Feature/Zoho.feature",
		glue="stepDefinitionZoho",
		dryRun=false,
		monochrome=true,
		format={"pretty","html:html_report","json:json_report/cucumber.json","junit:junit_report","junit:junit_report/cucumber.xml"}
		
	)
public class TestRunnerZoho
{
	
}
