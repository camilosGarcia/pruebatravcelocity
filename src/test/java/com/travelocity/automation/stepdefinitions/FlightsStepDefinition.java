package com.travelocity.automation.stepdefinitions;

import com.travelocity.automation.question.Checkout;
import com.travelocity.automation.task.FlightsTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlightsStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^se reserva un viaje en avion de menor precio en la fecha actual$")
    public void seReservaUnViajeEnAvionDeMenorPrecioEnLaFechaActual() {
        theActorInTheSpotlight().attemptsTo(FlightsTask.setJourney());
    }

    @Then("^se visualiza la pagina de checkout$")
    public void seVisualizaLaPaginaDeCheckout() {
        OnStage.theActorInTheSpotlight().should(seeThat(Checkout.isVisible()));
    }
}
