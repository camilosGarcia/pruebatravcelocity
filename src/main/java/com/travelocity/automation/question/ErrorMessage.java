package com.travelocity.automation.question;

import com.travelocity.automation.userInterfaces.SingInPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ErrorMessage implements Question<String> {

    Integer TIMEOUT = 30;
    private String message;

    public ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(SingInPage.ERROR_LABEL.of(message), isPresent()).forNoMoreThan(TIMEOUT).seconds());
        Serenity.takeScreenshot();
        return Text.of(SingInPage.ERROR_LABEL.of(message)).viewedBy(actor).asString();
    }

    public static ErrorMessage visibleOnTheScreen(String message) {
        return new ErrorMessage(message);
    }
}
