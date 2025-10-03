package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Amazon.feature",glue="com.StepDefintion",snippets = SnippetType.CAMELCASE,dryRun = false,plugin = {"pretty", "html:target/cucumber-report.html"})
public class TestRunner {

}
