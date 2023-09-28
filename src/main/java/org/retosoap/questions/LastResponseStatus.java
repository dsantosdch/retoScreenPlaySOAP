package org.retosoap.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.questions.LastResponse;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseStatus implements Question {

    private int code;

    public LastResponseStatus(int code) {
        this.code = code;
    }

    public static LastResponseStatus isEqualsTo(int code) {
        return new LastResponseStatus(code);
    }

    @Override
    public Object answeredBy(Actor actor) {
        return lastResponse().statusCode() == code;
    }
}
