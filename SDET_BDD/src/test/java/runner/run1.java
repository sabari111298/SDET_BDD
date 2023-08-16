package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="step_defn",tags="@feature1",plugin="html:C:\\Users\\sabari.c\\OneDrive - HCL Technologies Ltd\\Desktop\\sabari1\\SDET_BDD\\reports\\r1.html")
public class run1 {

}
