package Github_Despegar.definitions;

import Github_Despegar.steps.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Definitions {

	Steps step;
	
	@Given("^Ingreso a navegador$")
	public void ingreso_a_navegador() {
		step.ingreso_a_navegador();
	}

	@When("^Seleccionar origen y destino \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_origen_y_destino(String origen, String destino) {
		step.seleccionar_origen_y_destino(origen, destino);
		
	}

	@When("^Seleccionar fechas \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_fechas(String fida, String fvuelta) {

	}


	@When("^Seleccionar habitaciones (.*)(.*)(.*)$")
	public void seleccionar_habitaciones(String adultos, String ninos, String edadnino1,String edadnino2, String edadnino3, String edadnino4, String edadnino5) {

	}
	
	@Then("^Validar precio mas barato \"([^\"]*)\"$")
	public void validar_precio_mas_barato(String precioBajo) {

	}


	@Then("^Validar precio mas barato $")
	public void validar_precio_mas_barato() {

	}

	@Then("^Validar precio mas alto \"([^\"]*)\"$")
	public void validar_precio_mas_alto(String precioAlto) {

	}


}
