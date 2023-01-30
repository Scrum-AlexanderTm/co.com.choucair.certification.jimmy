package co.com.choucair.certification.prueba.pom.step;

import co.com.choucair.certification.prueba.pom.pageobject.PaginaUrl;
import net.thucydides.core.annotations.Step;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class TasksAction {
    private PaginaUrl paginaUrl;

    @Step
    public void singIn(){
        paginaUrl.user.sendKeys("jimmytincopa");
        paginaUrl.pass.sendKeys("jimmy");
        paginaUrl.btn_sing_in.click();
    }

    @Step
    public void verificar(){
        assertThat(paginaUrl.lbl_menu.isCurrentlyVisible(), is(true));
    }
}
