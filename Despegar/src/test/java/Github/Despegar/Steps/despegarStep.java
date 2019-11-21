package Github.Despegar.Steps;

import Github.Despegar.PageObjects.despegarPageObject;
import net.thucydides.core.annotations.Step;

public class despegarStep {

	despegarPageObject page;

	@Step
	public void ingresar_pagina() {
		page.open();
		page.seleccionarTipo();

	}

	@Step
	public void ingresar_solo_ida() throws InterruptedException {
		page.ingresar_solo_ida();
	}

	@Step
	public void seleccionar_origen(String origen) throws InterruptedException {
		page.seleccionar_origen(origen);
	}

	@Step
	public void seleccionar_destino(String destino) throws InterruptedException {
		page.seleccionar_destino(destino);
	}

	@Step
	public void seleccionar_fecha_ida(String fida) throws InterruptedException {
		page.seleccionar_fida(fida);
	}

	@Step
	public void seleccionar_fecha_vuelta(String fvuelta) throws InterruptedException {
		page.seleccionar_fvuelta(fvuelta);	    
	}

	@Step
	public void seleccionar_habitaciones_uno(String adultos, String ninos, String nino1, String nino2, String nino3)
			throws InterruptedException {
		page.seleccionar_habitaciones_uno(adultos, ninos, nino1, nino2, nino3);
		page.botonBuscar();
	}

	@Step
	public void seleccionar_habitaciones_dos(String adultos, String ninos, String nino1, String nino2, String nino3, String nino4) throws Exception {
		page.seleccionar_habitaciones_dos(adultos, ninos, nino1, nino2, nino3, nino4);
		page.botonBuscar();
	}

	@Step
	public void validar_precio_mas_barato() {
		page.validar_precio_mas_barato();
	}

}
