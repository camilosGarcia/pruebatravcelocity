package com.travelocity.automation.question;

import com.travelocity.automation.userInterfaces.HomePage;
import com.travelocity.automation.userInterfaces.SingInPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class UserLoging implements Question<String> {

    Integer TIMEOUT = 30;

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(HomePage.USER_NAME, isPresent()).forNoMoreThan(TIMEOUT).seconds());
        Serenity.takeScreenshot();
        return Text.of(HomePage.USER_NAME).viewedBy(actor).asString();
    }

    public static UserLoging whitName() {
        return new UserLoging();
    }
}
