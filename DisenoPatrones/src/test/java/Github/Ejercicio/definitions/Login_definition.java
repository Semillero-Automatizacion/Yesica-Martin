package Github.Ejercicio.definitions;

import Github.Ejercicio.steps.Login_steps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Login_definition {
	
	@Steps
	Login_steps Login_steps;
	
	@Given("^Ingreso a navegador$")
	public void ingreso_a_navegador() throws Exception {

	    Login_steps.ingreso_a_navegador();
	}


	@When("^Ingresar usuario \"([^\"]*)\"$")
	public void ingresar_usuario(String usuario) throws Exception {
		
		Login_steps.ingresar_usuario(usuario);
	}

	@When("^Ingresar contraseña \"([^\"]*)\"$")
	public void ingresar_contraseña(String contrasena) throws Exception {

		Login_steps.ingresar_contraseña(contrasena);
	}

	@When("^Click en el boton ingresar$")
	public void click_en_el_boton_ingresar() throws Exception {

		Login_steps.click_en_el_boton_ingresar();
	}

	@Then("^Se valida ingreso correcto$")
	public void se_valida_ingreso_correcto() throws Exception {

		Login_steps.se_valida_ingreso_correcto();
	}







}
