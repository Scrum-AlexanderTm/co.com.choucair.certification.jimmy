package co.com.choucair.certification.prueba.pom.pageobject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://opencart.abstracta.us/index.php?route=common/home")
public class PaginaOpenCart extends PageObject{
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img")
    public WebElementFacade productMac;

    @FindBy(xpath = "//*[@id=\"button-cart\"]")
    public WebElementFacade btn_addToCar;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    public WebElementFacade btn_sing_in;

    @FindBy(xpath = "//*[@id=\"cart\"]/button")
    public WebElementFacade btn_viewItems;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")
    public WebElementFacade btn_viewCart;

    @FindBy(xpath = "//*[@id=\"content\"]")
    public WebElementFacade lbl_table;


}
