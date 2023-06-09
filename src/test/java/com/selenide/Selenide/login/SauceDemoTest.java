package com.selenide.Selenide.login;

import com.selenide.Selenide.page.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
public class SauceDemoTest {

    @Test
    void deveEfetuarLoginComSucesso(){
        LoginPage loginPage = new LoginPage();
        loginPage.efetuarLoginValido();

        $(".app_logo").shouldHave(text("Swag Labs"));
    }
    @Test
    void naoDeveEfetuarLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.efetuarLoginInvalido();
        $(".error-message-container.error").shouldHave(text("Epic sadface: Username and password do not match any user in this service"));
    }
    @Test
    void deveFinalizarUmaCompra(){
        LoginPage loginPage = new LoginPage();
        InventoryPage inventoryPage = loginPage.efetuarLoginValido();

        inventoryPage.selecionarItem();
        inventoryPage.existeItemNoCarrinho("1");
        CartPage cartPage = inventoryPage.clicarNoCarrinho();

        cartPage.existeTexto("Your Cart");
        CheckoutPage checkoutPage = cartPage.fazerCheckout();

        checkoutPage.verificarSeBotaoExiste();
        checkoutPage.preencherDados("João","Santos", "95042123");
        checkoutPage.clicarNoBotao();
        checkoutPage.verificarSeCaiuNoCheckoutTwo();
        FinishOrderPage finishOrderPage = checkoutPage.clicarNoBotaoFinish();

        finishOrderPage.verificarSeConfirmouCompra();
    }
}
