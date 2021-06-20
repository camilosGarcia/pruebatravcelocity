package com.travelocity.automation.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SingInPage {
    public static final Target EMAIL_INPUT = Target.the("Email input")
            .located(By.xpath("//input[@id='signin-loginid']"));
    public static final Target PASSWORD_INPUT = Target.the("Password input")
            .located(By.xpath("//input[@id='signin-password']"));
    public static final Target SIGN_IN_BUTTON = Target.the("Sign in button")
            .located(By.xpath("//button[@id='submitButton']"));
    public static final Target ERROR_LABEL = Target.the("Error message")
            .locatedBy("//p[contains(text(),'{0}')]");
    public static final Target ALERT_LABEL = Target.the("Alert message")
            .located(By.xpath("//div[@id='wrong-credentials-error-div']//h5"));
}
