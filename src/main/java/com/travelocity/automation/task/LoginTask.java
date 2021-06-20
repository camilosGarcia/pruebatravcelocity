package com.travelocity.automation.task;

import com.travelocity.automation.models.UserDto;
import com.travelocity.automation.userInterfaces.HomePage;
import com.travelocity.automation.userInterfaces.SingInPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {

    private String email;
    private String password;

    public  LoginTask (UserDto userDto){
        email=userDto.getEmail();
        password=userDto.getPassword();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.SIGN_IN_BUTTON),
                         Click.on(HomePage.SIGN_IN_BUTTON_LABEL),
                         Enter.theValue(email).into(SingInPage.EMAIL_INPUT),
                         Enter.theValue(password).into(SingInPage.PASSWORD_INPUT));
        Serenity.takeScreenshot();
        actor.attemptsTo(Click.on(SingInPage.SIGN_IN_BUTTON));
    }

    public static LoginTask singIn(UserDto userDto) {
        return Tasks.instrumented(LoginTask.class, userDto);
    }

}
