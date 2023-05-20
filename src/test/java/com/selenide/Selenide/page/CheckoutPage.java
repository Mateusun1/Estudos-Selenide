package com.selenide.Selenide.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    private final SelenideElement button = $(By.name("continue"));
    public void verificarSeBotaoExiste() {
        $(button).shouldHave(value("Continue"));
    }
}
