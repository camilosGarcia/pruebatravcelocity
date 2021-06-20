package com.travelocity.automation.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FlightsSearchPage {
    public static final Target FLIGHTS_TRAVEL_BUTTON = Target.the("Flights travel button")
            .located(By.xpath("//button[@class='uitk-card-link']"));
    public static final Target CONTINUE_BUTTON = Target.the("Continue button")
            .located(By.xpath("//button[@data-test-id='select-button']"));
    public static final Target NO_THANKS_BUTTON = Target.the("No thanks button")
            .located(By.xpath("//a[@data-test-id='forcedChoiceNoThanks']"));

}
