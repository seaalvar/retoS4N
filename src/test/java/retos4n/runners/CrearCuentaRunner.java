package retos4n.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/retos4n/features/CrearCuenta.feature",
				 
				 glue = "retos4n.definitions",
				 snippets = SnippetType.CAMELCASE)

public class CrearCuentaRunner {

}
