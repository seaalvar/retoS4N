package retos4n.steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import retos4n.pages.CrearCuentaPage;

public class CrearCuentaStep extends PageObject{
	
	CrearCuentaPage crearCuentaPage;
	
	@Step
	public void abrirSitio() {
		crearCuentaPage.open();
	}
	
	@Step
	public void ingresarNombre(String strNombre) {
		crearCuentaPage.getInputNombre().sendKeys(strNombre);
	}
	
	@Step
	public void ingresarApellido(String strApellido) {
		crearCuentaPage.getInputApellido().sendKeys(strApellido);
	}
	
	@Step
	public void ingresarEmail(String strEmail) {
		crearCuentaPage.getInputEmail().sendKeys(strEmail);
	}
	
	@Step
	public void ingresarPassword(String strPassword) {
		crearCuentaPage.getInputPassword().sendKeys(strPassword);
	}
	
	@Step
	public void ingresarFecha(String strFecha) {
		crearCuentaPage.getInputFecha().sendKeys(strFecha);
	}
	
	@Step
	public void seleccionarGenero(String strGenero) {
		if(strGenero.equals("Hombre")) {
			crearCuentaPage.getChkHombre().click();
		}
		else if(strGenero.equals("Mujer")) {
			crearCuentaPage.getChkMujer().click();
		}
	}
	
	@Step
	public void clicCrearCuenta() {
		crearCuentaPage.getBtnCrearCuenta().click();
		Alert alert = getDriver().switchTo().alert();
		String strMensaje = alert.getText();
		Serenity.setSessionVariable("MensajeObtenido").to(strMensaje);
	}
	
	@Step
	public void verificarIngresoExitoso(String strMensaje) {
		String strMensajeObtenido = Serenity.sessionVariableCalled("MensajeObtenido");
		assertEquals(strMensaje, strMensajeObtenido);
	}
	
	@Step
	public void verificarErrorNombre(String strError) {
		if(crearCuentaPage.getLblErrorNombre().isPresent()) {
			String strMensajeObtenido = crearCuentaPage.getLblErrorNombre().getText();
			assertEquals(strError, strMensajeObtenido);
		}
	}
	
	@Step
	public void verificarErrorApellido(String strError) {
		if(crearCuentaPage.getLblErrorApellido().isPresent()) {
			String strMensajeObtenido = crearCuentaPage.getLblErrorApellido().getText();
			assertEquals(strError, strMensajeObtenido);
		}
	}
	
	@Step
	public void verificarErrorEmail(String strError) {
		if(crearCuentaPage.getLblErrorEmail().isPresent()) {
			String strMensajeObtenido = crearCuentaPage.getLblErrorEmail().getText();
			assertEquals(strError, strMensajeObtenido);
		}
	}
	
	@Step
	public void verificarErrorPassword(String strError) {
		if(crearCuentaPage.getLblErrorPassword().isPresent()) {
			String strMensajeObtenido = crearCuentaPage.getLblErrorPassword().getText();
			assertEquals(strError, strMensajeObtenido);
		}
	}

}
