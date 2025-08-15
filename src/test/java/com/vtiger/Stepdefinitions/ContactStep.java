package com.vtiger.Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class ContactStep  extends basesteps{


    //  ContactPage cp = new ContactPage(driver);
    @Given("User should be on Home page")
    public void user_should_be_on_home_page() {
        System.out.println("driver here in cotactstep---"+driver);

        getContactPage().ClickCOntact();

    }

    @When("user enter first name and last name")
    public void user_enter_first_name_and_last_name() {


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        getContactPage().enterFirstLAstNAme(dt.get(TCName).get("firstname"),dt.get(TCName).get("lastname"));;

        // Write code here that turns the phrase above into concrete actions
        //  throw new io.cucumber.java.PendingException();
    }


    @When("Clicks the save button")
    public void clicks_the_save_button() {

        getContactPage().ClickSave();
    }
    @Then("the contact should be added to the application")
    public void the_contact_should_be_added_to_the_application() {
        // Write code here that turns the phrase above into concrete actions
        //  throw new io.cucumber.java.PendingException();
    }


}

