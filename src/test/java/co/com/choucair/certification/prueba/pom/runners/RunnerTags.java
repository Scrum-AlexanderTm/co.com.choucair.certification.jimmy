package co.com.choucair.certification.prueba.pom.runners;

//Solo se agrega a la clase desde aquí
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features ={ "src/test/resources/features"},
        tags = {"@HistoriaDeUsuario1","@HistoriaDeUsuario2"},
        glue ="co.com.choucair.certification.prueba.pom.definition",
        snippets = SnippetType.CAMELCASE )

//Hasta aquí, ya que lo otro es nativo de la clase
public class RunnerTags {
}
