package com.selenide.Selenide.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement title = $(By.cssSelector(".title"));
    private final SelenideElement buttonCheckout = $(By.name("checkout"));


    public void existeTexto(String yourCart) {
        $(title).shouldHave(text(yourCart));
    }

    public CheckoutPage fazerCheckout() {
        buttonCheckout.click();
        return new CheckoutPage();
    }
}
