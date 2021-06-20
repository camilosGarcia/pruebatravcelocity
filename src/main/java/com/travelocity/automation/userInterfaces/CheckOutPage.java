package com.travelocity.automation.userInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage {
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button")
            .located(By.xpath("//button[@data-test-id='goto-checkout-button']"));

}
