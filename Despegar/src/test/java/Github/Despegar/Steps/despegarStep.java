package Github.Despegar.Steps;

import Github.Despegar.PageObjects.despegarPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class despegarStep {

	despegarPageObject page;
	
	@Step
	public void ingresar_pagina() {
		page.open();
	}
	
	@Step
	public void seleccionar_origen_y_destino(String origen, String destino) throws InterruptedException {
		page.seleccionar_origen_y_destino(origen, destino);
	}

	@Step
	public void seleccionar_fechas(String fida, String fvuelta) {

	}

	@Step
	public void seleccionar_habitaciones(String adultos, String ninos, String nino1, String nino2, String nino3) {

	}

	@Step
	public void validar_precio_mas_barato() {

	}
	
}
