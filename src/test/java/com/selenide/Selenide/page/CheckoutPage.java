package com.selenide.Selenide.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {
    private final SelenideElement button = $(By.name("continue"));
    private final SelenideElement firstName = $(By.name("firstName"));
    private final SelenideElement lastName = $(By.name("lastName"));
    private final SelenideElement postalCode = $(By.name("postalCode"));
    private final SelenideElement title = $(By.cssSelector(".title"));
    private final SelenideElement buttonFinish = $(By.name("finish"));
    public void verificarSeBotaoExiste() {
        $(button).shouldHave(value("Continue"));
    }

    public void preencherDados(String name, String lastname, String postalcode) {
        firstName.setValue(name);
        lastName.setValue(lastname);
        postalCode.setValue(postalcode);
    }

    public void clicarNoBotao() {
        button.click();
    }

    public void verificarSeCaiuNoCheckoutTwo() {
        $(title).shouldHave(text("Checkout: Overview"));
    }

    public FinishOrderPage clicarNoBotaoFinish() {
        buttonFinish.click();
        return new FinishOrderPage();
    }
}
