package com.nextbase.runners;

// THIS IS WHERE WE WILL RERUN TEST THAT HAVE FAILED
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/rerun.txt", //gets the root path of rerun file
        glue = "com/nextbase/step_definitions" // get the source path which is where we implement our code


)
public class FailedTestRunner {

}
