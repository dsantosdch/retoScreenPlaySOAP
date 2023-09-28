package org.retosoap.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/add_two_numbers.feature"},
        glue = {"org.retosoap.stepdefinitions", "org.retosoap.utils"},
        snippets = SnippetType.CAMELCASE
)


public class SoapAddNumbers {
}
