package retos4n.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import retos4n.steps.CrearCuentaStep;

public class CrearCuentaDefinition {
	
	@Steps
	CrearCuentaStep crearCuentaStep;
	
	@Given("^Ingreso al formulario$")
	public void ingresoAlFormulario() {
		crearCuentaStep.abrirSitio();
	}


	@When("^Diligencio formulario crear cuenta \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void diligencioFormularioCrearCuenta(String strNombre, String sterApellido, String strEmail, String strPassword, String strFecha, String strGenero) {
		crearCuentaStep.ingresarNombre(strNombre);
		crearCuentaStep.ingresarApellido(sterApellido);
		crearCuentaStep.ingresarEmail(strEmail);
		crearCuentaStep.ingresarPassword(strPassword);
		crearCuentaStep.ingresarFecha(strFecha);
		crearCuentaStep.seleccionarGenero(strGenero);
	}

	@Then("^Verifico el ingreso exitoso de datos \"([^\"]*)\"$")
	public void verificarElIngresoExitosoDeDatos(String strMensaje) {
		crearCuentaStep.clicCrearCuenta();
		crearCuentaStep.verificarIngresoExitoso(strMensaje);
	}
	
	@Then("^Verifico obligatoriedad campo nombre \"([^\"]*)\"$")
	public void verificoObligatoriedadCampoNombre(String strError) {
		crearCuentaStep.verificarErrorNombre(strError);
	}
	
	@Then("^Verifico obligatoriedad campo apellido \"([^\"]*)\"$")
	public void verificoObligatoriedadCampoApellido(String strError) {
		crearCuentaStep.verificarErrorApellido(strError);
	}
	
	@Then("^Verifico campo correo electronico \"([^\"]*)\"$")
	public void verificoCampoCorreoElectronico(String strError) {
		crearCuentaStep.verificarErrorEmail(strError);
	}
	
	@Then("^Verifico obligatoriedad campo password \"([^\"]*)\"$")
	public void verificoObligatoriedadCampoPassword(String strError) {
		crearCuentaStep.verificarErrorPassword(strError);
	}

}
