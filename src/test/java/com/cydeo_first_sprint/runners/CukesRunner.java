package com.cydeo_first_sprint.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
        },
        features = "src/test/resources/features",
        glue="com/cydeo_first_sprint/step_definitions",
        dryRun = true,
        tags = ""
)



public class CukesRunner {

}
