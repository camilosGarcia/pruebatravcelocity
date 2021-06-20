package com.travelocity.automation.task;

import com.travelocity.automation.models.UserDto;
import com.travelocity.automation.userInterfaces.FlightsSearchPage;
import com.travelocity.automation.userInterfaces.HomePage;
import com.travelocity.automation.userInterfaces.SingInPage;
import com.travelocity.automation.utils.RamdonString;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class FlightsTask implements Task {

    private String destination;
    private String origen;

    int TIMEOUT = 30;

    public FlightsTask() {
        this.destination = RamdonString.getRandomString();
        this.origen = RamdonString.getRandomString();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.FLIGHT_BUTTON),
                         Click.on(HomePage.LEAVING_BUTTON),
                         Enter.theValue(origen).into(HomePage.ORIGIN_INPUT),
                         Click.on(HomePage.FIRST_ITEM_LIST_ORIGEN),
                         Click.on(HomePage.GOING_TO_BUTTON),
                         Enter.theValue(destination).into(HomePage.DESTINATION_INPUT),
                         Click.on(HomePage.FIRST_ITEM_LIST_DSETINATION),
                         Click.on(HomePage.SEARCH_BUTTON),
                         WaitUntil.the(FlightsSearchPage.FLIGHTS_TRAVEL_BUTTON, isPresent()).forNoMoreThan(TIMEOUT).seconds(),
                         Click.on(FlightsSearchPage.FLIGHTS_TRAVEL_BUTTON),
                         Click.on(FlightsSearchPage.CONTINUE_BUTTON),
                         WaitUntil.the(FlightsSearchPage.FLIGHTS_TRAVEL_BUTTON, isPresent()).forNoMoreThan(TIMEOUT).seconds(),
                         Click.on(FlightsSearchPage.FLIGHTS_TRAVEL_BUTTON),
                         Click.on(FlightsSearchPage.CONTINUE_BUTTON));
        if (FlightsSearchPage.NO_THANKS_BUTTON.resolveFor(theActorInTheSpotlight()).isVisible()) {
            FlightsSearchPage.NO_THANKS_BUTTON.resolveFor(theActorInTheSpotlight()).click();
        }
        String currentHandle = BrowseTheWeb.as(actor).getDriver().getWindowHandle();
        actor.attemptsTo(Switch.toWindow(getNewWindowHandle(actor, currentHandle)));
        Serenity.takeScreenshot();
    }
    public static FlightsTask setJourney() {
        return Tasks.instrumented(FlightsTask.class);
    }

    private static String getNewWindowHandle(Actor actor, String currentWindowHandle){
        for (String windowHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            if (!windowHandle.equals(currentWindowHandle)) {
                return windowHandle;
            }
        }
        return null;
    }
}
