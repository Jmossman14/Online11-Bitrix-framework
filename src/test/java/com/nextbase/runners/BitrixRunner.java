package com.nextbase.runners;

// writing outside of the class will allow us to run how we want

// THIS IS WHERE WE RUN ALL OF THE TEST (test that fail will be run in rerun)
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html", // HTML report can be seen in browser
            "json:target/cucumber.json",// Java script report, used by 3rd party tools
            "rerun:target/rerun.txt"// this will report all test that failed and need to be rerun
                    },

        features = "src/test/resources/features", //gets the root path of features folder
        glue = "com/nextbase/step_definitions", // get the source path which is where we implement our code
        dryRun = false,
        tags = "@WIP"

)


public class BitrixRunner {
}
