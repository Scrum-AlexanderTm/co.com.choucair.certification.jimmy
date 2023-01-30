package co.com.choucair.certification.prueba.pom.pageobject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/webtables")
public class PaginaUrlDemoQAWebTable extends PageObject{
    @FindBy(xpath = "//*[@id=\"addNewRecordButton\"]")
    public WebElementFacade btnAdd;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElementFacade firstName;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElementFacade lastName;

    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    public WebElementFacade email;

    @FindBy(xpath = "//*[@id=\"age\"]")
    public WebElementFacade age;

    @FindBy(xpath = "//*[@id=\"salary\"]")
    public WebElementFacade salary;

    @FindBy(xpath = "//*[@id=\"department\"]")
    public WebElementFacade deparment;

    @FindBy(xpath = "//*[@id=\"submit\"]")
    public WebElementFacade btnSubmit;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[2]/div[2]")
    public WebElementFacade lbl_table;


}

