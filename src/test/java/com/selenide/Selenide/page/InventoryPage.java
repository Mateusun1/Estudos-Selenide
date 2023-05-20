package com.selenide.Selenide.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    private final SelenideElement button = $(By.name("add-to-cart-sauce-labs-backpack"));
    private final SelenideElement cart = $(By.cssSelector(".shopping_cart_link"));
    private final SelenideElement sizeItens = $(By.cssSelector(".shopping_cart_badge"));
    public void selecionarItem() {
        button.click();
    }
    public CartPage clicarNoCarrinho() {
        cart.click();
        return new CartPage();
    }
    public void existeItemNoCarrinho(String quantidade) {
        $(sizeItens).shouldHave(text(quantidade));
    }
}
