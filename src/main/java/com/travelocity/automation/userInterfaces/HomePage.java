package com.travelocity.automation.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button")
            .located(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']"));
    public static final Target SIGN_IN_BUTTON_LABEL = Target.the("Sign in button in label")
            .located(By.xpath("//a[@class='uitk-button uitk-button-medium uitk-button-fullWidth uitk-button-has-text uitk-button-primary']"));
    public static final Target USER_NAME = Target.the("User name")
            .located(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary uitk-menu-trigger']"));
    public static final Target FLIGHT_BUTTON = Target.the("Flight button")
            .located(By.xpath("//a[@aria-controls='wizard-flight-pwa']"));
    public static final Target LEAVING_BUTTON = Target.the("Leaving button")
            .located(By.xpath("//button[@aria-label='Leaving from']"));
    public static final Target GOING_TO_BUTTON = Target.the("Going button")
            .located(By.xpath("//button[@aria-label='Going to']"));
    public static final Target ORIGIN_INPUT = Target.the("Origen input")
            .located(By.xpath("//input[@id='location-field-leg1-origin']"));
    public static final Target DESTINATION_INPUT= Target.the("Destination input")
            .located(By.xpath("//input[@id='location-field-leg1-destination']"));
    public static final Target FIRST_ITEM_LIST_ORIGEN = Target.the("First item list")
            .located(By.xpath("//li//button[@data-stid='location-field-leg1-origin-result-item-button']"));
    public static final Target FIRST_ITEM_LIST_DSETINATION = Target.the("First item list")
            .located(By.xpath("//li//button[@data-stid='location-field-leg1-destination-result-item-button']"));
    public static final Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.xpath("//button[@data-testid='submit-button']"));
}
