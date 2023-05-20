package com.selenide.Selenide.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private final SelenideElement username = $(By.name("user-name"));
    private final SelenideElement password = $(By.name("password"));
    private final SelenideElement button = $(By.name("login-button"));

    public LoginPage() {
        open("https://www.saucedemo.com/");
    }
    public InventoryPage efetuarLoginValido(){
        username.setValue("standard_user");
        password.setValue("secret_sauce");
        button.click();
        return new InventoryPage();
    }
    public void efetuarLoginInvalido(){
        username.setValue("invalid_username");
        password.setValue("invalid_password");
        button.click();
    }
}
