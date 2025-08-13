package com.vtiger.Stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class accountsteps extends basesteps {


    @When("user click on new account link")
    public void user_click_on_new_account_link() {
    getHomePage().clickNewAccount();
    }

    @When("user enters the Account Name and click on save button")
    public void user_enters_the_account_name_and_click_on_save_button() {
    getAccountPage().createAccount(dt.get(TCName).get("Aname"));
    }

    @Then("Account should be created successfully")
    public void account_should_be_created_successfully() {
    }
}
