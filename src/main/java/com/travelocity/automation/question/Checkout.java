package com.travelocity.automation.question;

import com.travelocity.automation.userInterfaces.CheckOutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Checkout  implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor arg0) {
        return CheckOutPage.CHECKOUT_BUTTON.resolveFor(theActorInTheSpotlight()).isVisible();
    }
    public static Checkout isVisible() {
        return new Checkout();
    }
}
