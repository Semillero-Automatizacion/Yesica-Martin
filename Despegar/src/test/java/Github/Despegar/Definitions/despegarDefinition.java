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
	public void ingresar_pagina(){
		step.ingresar_pagina();
	}
	
	@When("^Ingresar solo ida$")
	public void ingresar_solo_ida() throws InterruptedException {
		step.ingresar_solo_ida();
	}


	@When("^Seleccionar origen \"([^\"]*)\"$")
	public void seleccionar_origen(String origen) throws InterruptedException {
	    step.seleccionar_origen(origen);
	}

	@When("^Seleccionar destino \"([^\"]*)\"$")
	public void seleccionar_destino(String destino) throws InterruptedException {
	    step.seleccionar_destino(destino);
	}
	
	@When("^Seleccionar fecha ida \"([^\"]*)\"$")
	public void seleccionar_fecha_ida(String fida) throws InterruptedException {
	    step.seleccionar_fecha_ida(fida);
	}

	@When("^Seleccionar fecha vuelta \"([^\"]*)\"$")
	public void seleccionar_fecha_vuelta(String fvuelta) throws InterruptedException {
	    step.seleccionar_fecha_vuelta(fvuelta);
	}
	
	@When("^Seleccionar habitaciones uno \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_habitaciones_uno(String adultos, String ninos, String nino1, String nino2, String nino3) throws InterruptedException {
		step.seleccionar_habitaciones_uno(adultos, ninos, nino1, nino2, nino3);
	}
	
	@When("^Seleccionar habitaciones dos \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_habitaciones_dos(String adultos, String ninos, String nino1, String nino2, String nino3, String nino4) throws Exception {
		step.seleccionar_habitaciones_dos(adultos, ninos, nino1, nino2, nino3, nino4);
	}

	@Then("^Validar precio mas barato$")
	public void validar_precio_mas_barato() throws Exception {
		step.validar_precio_mas_barato();
	}

}
