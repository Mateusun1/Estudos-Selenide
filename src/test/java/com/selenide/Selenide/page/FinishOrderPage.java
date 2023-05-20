package com.selenide.Selenide.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FinishOrderPage {
    private final SelenideElement titleFinishOrder = $(By.cssSelector(".complete-header"));


    public void verificarSeConfirmouCompra() {
        titleFinishOrder.shouldHave(Condition.text("Thank you for your order!"));
    }
}
