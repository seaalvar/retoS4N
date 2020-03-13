package retos4n.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://3.87.50.247:3000/#/")
public class CrearCuentaPage extends PageObject {
	
	@FindBy(id="id_nombre")
	private WebElementFacade inputNombre;
	
	@FindBy(id="id_apellido")
	private WebElementFacade inputApellido;
	
	@FindBy(id="id_email")
	private WebElementFacade inputEmail;
	
	@FindBy(id="id_password")
	private WebElementFacade inputPassword;
	
	@FindBy(name="birthdate")
	private WebElementFacade inputFecha;
	
	@FindBy(xpath="//*[@id=\"id_genero_mujer\"]")
	private WebElementFacade chkMujer;
	
	@FindBy(xpath="//*[@id=\"id_genero_hombre\"]")
	private WebElementFacade chkHombre;
	
	@FindBy(xpath="/html/body/div/div/form/div[8]/button")
	private WebElementFacade btnCrearCuenta;
	
	@FindBy(xpath="/html/body/div/div/form/div[1]/span")
	private WebElementFacade lblErrorNombre;
	
	@FindBy(xpath="/html/body/div/div/form/div[2]/span")
	private WebElementFacade lblErrorApellido;
	
	@FindBy(xpath="/html/body/div/div/form/div[3]/span[2]")
	private WebElementFacade lblErrorEmail;
	
	@FindBy(xpath="/html/body/div/div/form/div[4]/span")
	private WebElementFacade lblErrorPassword;
	
	
		
	public WebElementFacade getInputNombre() {
		return inputNombre;
	}

	public WebElementFacade getInputApellido() {
		return inputApellido;
	}

	public WebElementFacade getInputEmail() {
		return inputEmail;
	}

	public WebElementFacade getInputPassword() {
		return inputPassword;
	}

	public WebElementFacade getInputFecha() {
		return inputFecha;
	}

	public WebElementFacade getChkMujer() {
		return chkMujer;
	}

	public WebElementFacade getChkHombre() {
		return chkHombre;
	}

	public WebElementFacade getBtnCrearCuenta() {
		return btnCrearCuenta;
	}

	public WebElementFacade getLblErrorNombre() {
		return lblErrorNombre;
	}

	public WebElementFacade getLblErrorApellido() {
		return lblErrorApellido;
	}

	public WebElementFacade getLblErrorEmail() {
		return lblErrorEmail;
	}

	public WebElementFacade getLblErrorPassword() {
		return lblErrorPassword;
	}

}
