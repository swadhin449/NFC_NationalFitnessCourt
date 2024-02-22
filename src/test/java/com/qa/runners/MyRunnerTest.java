package com.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports-2.html","summary"}
        //,features = {"src/test/resources/Registration.feature"}
        ,features = {"src/test/resources/Login.feature"}
        //,features = {"src/test/resources/Workout.feature"}
        //,features = {"src/test/resources/Movement.feature"}
        //,features = {"src/test/resources/ForgotPass.feature"}
        ,glue = {"com.qa.stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=false
        ,monochrome=true
        //,tags = "@Registration"
        ,tags = "@Login"
        //,tags = "@WorkOut"
        //,tags = "@Movement"
        //,tags = "@ForgotPass"
)
public class MyRunnerTest {
}
