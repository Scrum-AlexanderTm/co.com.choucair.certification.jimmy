package co.com.choucair.certification.prueba.pom.pageobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/text-box")
public class PaginaUrlDemoQA extends PageObject {
    @FindBy(xpath = "//*[@id=\"userName\"]")
    public WebElementFacade fullName;

    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    public WebElementFacade email;

    @FindBy(xpath = "//*[@id=\"currentAddress\"]")
    public WebElementFacade currentAdd;

    @FindBy(xpath = "//*[@id=\"permanentAddress\"]")
    public WebElementFacade permantAdd;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElementFacade btnSubmit;

    @FindBy(xpath = "//*[@id=\"output\"]/div")
    public WebElementFacade lbl_menu;
}
