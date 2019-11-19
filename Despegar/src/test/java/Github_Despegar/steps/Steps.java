package Github_Despegar.steps;

import Github_Despegar.pageObjects.PageObjects;
import net.thucydides.core.annotations.Step;

public class Steps {

	PageObjects page;

	@Step
	public void ingreso_a_navegador() {
		page.ingreso_a_navegador();
	}

	@Step
	public void seleccionar_origen_y_destino(String origen, String destino) {
		page.seleccionar_origen_y_destino(origen, destino);
	}
	
	@Step
	public void seleccionar_fechas(String fida, String fvuelta) {

	}
	
	@Step
	public void seleccionar_habitaciones(String adultos, String ninos, String edadnino1,String edadnino2, String edadnino3) {

	}
	
	@Step
	public void seleccionar_habitaciones(String adultos, String ninos, String edadnino1,String edadnino2, String edadnino3, String edadnino4, String edadnino5) {

	}
	
	@Step
	public void validar_precio_mas_barato(String precioBajo) {

	}

	@Step
	public void validar_precio_mas_barato() {

	}

	@Step
	public void validar_precio_mas_alto(String precioAlto) {

	}


}
