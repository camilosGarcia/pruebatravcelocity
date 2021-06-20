package com.travelocity.automation.question;

import com.travelocity.automation.userInterfaces.SingInPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class AlertMessage implements Question<String> {

    Integer TIMEOUT = 30;

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(SingInPage.ALERT_LABEL, isPresent()).forNoMoreThan(TIMEOUT).seconds());
        Serenity.takeScreenshot();
        return Text.of(SingInPage.ALERT_LABEL).viewedBy(actor).asString();
    }

    public static AlertMessage visibleOnTheScreen() {
        return new AlertMessage();
    }
}
