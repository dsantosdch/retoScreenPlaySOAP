package org.retosoap.utils;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.lang.invoke.CallSite;

import static org.retosoap.utils.enums.SoapService.BASE_URL;

public class BeforeHookSoap {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
