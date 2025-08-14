package com.vtiger.pages;

import com.vtiger.utils.CommonActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends CommonActions {
    public AccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(name="accountname")
    WebElement tb_accountname;

    @FindBy(name="button")
    WebElement btn_save;

    public void createAccount(String Aname)
    {
        SetAccountName(Aname);
        clickSave();//

    }

    public void SetAccountName(String Aname)
    {
        setInput(tb_accountname,Aname);
    }

    public void clickSave()
    {
        clickElement(btn_save);
    }


}
