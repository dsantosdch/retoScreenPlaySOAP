package org.retosoap.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import org.retosoap.questions.LastResponseStatus;
import org.retosoap.tasks.AddNumbers;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class StepDefinitionsSoapAddNumbers {

    @When("you add two numbers")
    public void youAddTwoNumbers(DataTable dt) {
        List<String> list = dt.transpose().asList(String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(AddNumbers.with(list));

    }
    @Then("i should see the response of the service is {int}")
    public void iShouldSeeTheResponseOfTheServiceIs(int code) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(LastResponseStatus.isEqualsTo(code)));
    }
}
