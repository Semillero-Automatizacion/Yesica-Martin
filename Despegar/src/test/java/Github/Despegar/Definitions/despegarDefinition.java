package Github.Despegar.Definitions;

import Github.Despegar.Steps.despegarStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class despegarDefinition {
	
	@Steps
	despegarStep step;
	
	@Given("^Ingresar pagina$")
	public void ingresar_pagina() throws Exception{
		step.ingresar_pagina();
	}

	@When("^Seleccionar origen y destino \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_origen_y_destino(String origen, String destino) throws InterruptedException {
		step.seleccionar_origen_y_destino(origen, destino);
	}

	@When("^Seleccionar fechas \"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_fechas(String fida, String fvuelta) {
		step.seleccionar_fechas(fida, fvuelta);
	}

	@When("^Seleccionar habitaciones \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_habitaciones(String adultos, String ninos, String nino1, String nino2, String nino3) {
		step.seleccionar_habitaciones(adultos, ninos, nino1, nino2, nino3);
	}

	@Then("^Validar precio mas barato$")
	public void validar_precio_mas_barato() throws Exception {
		step.validar_precio_mas_barato();
	}

}
