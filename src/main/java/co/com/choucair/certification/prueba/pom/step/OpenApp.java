package co.com.choucair.certification.prueba.pom.step;

import co.com.choucair.certification.prueba.pom.pageobject.PaginaOpenCart;
import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrl;
import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrlDemoQA;
import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrlDemoQAWebTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class OpenApp {
    private PaginaUrl paginaUrl;
    private PaginaUrlDemoQA paginaUrlDemoQA;
    private PaginaUrlDemoQAWebTable paginaUrlDemoQAWebTable;
    private PaginaOpenCart paginaOpenCart;
    @Step
    public void appUrl(){
        paginaUrl.open();
    }

    @Step
    public void appUrlDemoQA(){
        paginaUrlDemoQA.open();
    }

    @Step
    public void appUrlDemoQAWebTable(){paginaUrlDemoQAWebTable.open();}

    @Step
    public void appUrlOpenCart(){paginaOpenCart.open();}
}
