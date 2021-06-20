package com.travelocity.automation.stepdefinitions;

import com.travelocity.automation.models.UserDto;
import com.travelocity.automation.models.UserNameDto;
import com.travelocity.automation.question.AlertMessage;
import com.travelocity.automation.question.ErrorMessage;
import com.travelocity.automation.question.UserLoging;
import com.travelocity.automation.task.LoginTask;
import com.travelocity.automation.utils.ConfigurationProperties;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class LoginStepDefinitions {


    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) ingresa a Travelocity$")
    public void camiloIngresaATravelocity(String name) throws IOException {
        ConfigurationProperties configurationProperties = new ConfigurationProperties();
        String endPoint = configurationProperties.getProp("aplication.endPoint");
        theActorCalled(name).wasAbleTo(Open.url(endPoint));
        Serenity.takeScreenshot();
    }

    @When("^el se autentica en la aplicacion con correo electronico y password$")
    public void elSeAutenticaEnLaAplicacionConCorreoElectronicoYPassword(List<UserDto> userData) {
        theActorInTheSpotlight().attemptsTo(LoginTask.singIn(userData.get(0)));
    }

    @Then("^se visualiza el mensaje (.*).$")
    public void seVisualizaElMensaje(String message) {
        theActorInTheSpotlight().should(seeThat(ErrorMessage.visibleOnTheScreen(message), containsString(message)));
    }

    @Then("^se visualiza la alerta con el mensaje (.*).$")
    public void seVisualizaLaAlertaConElMensajeYouMayHaveEnteredAnUnknownEmailAddressOrAnIncorrectPassword(String message) {
        theActorInTheSpotlight().should(seeThat(AlertMessage.visibleOnTheScreen(), containsString(message)));
    }

    @Then("^se visualiza el nombre del usuario logueado$")
    public void seVisualizaElNombreDelUsuarioLogueado(List<UserNameDto> name) {
        theActorInTheSpotlight().should(seeThat(UserLoging.whitName(), containsString(name.get(0).getName())));
    }

}
