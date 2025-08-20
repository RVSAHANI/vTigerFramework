package com.vtiger.pages;

import com.vtiger.utils.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends CommonActions
{
    public ContactPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;

        PageFactory.initElements(driver,this);
        //  ClickCOntact();
    }

    @FindBy(name="button")
    WebElement cnt_btn_save;

    @FindBy(linkText="Home")
    WebElement hm_ln_home;

    @FindBy(linkText="New Contact")
    WebElement hm_tb_newCOnt;

    @FindBy(name="firstname")
    WebElement cnt_firstname;

    @FindBy(name="lastname")
    WebElement cnt_lastname;


    @FindBy(name="account_name")
    WebElement cnt_actname;

    public  void enterFirstLAstNAme(String fname,String lname){

        setInput(cnt_firstname,fname);
        setInput(cnt_lastname,lname);


    }

    public  void ClickSave(){

        clickElement(cnt_btn_save);

    }

    public  void ClickHome(){
        clickElement(hm_ln_home);

    }

    public  void ClickCOntact(){

        clickElement(hm_tb_newCOnt);

    }



}