package Github_Despegar.pageObjects;

import Github_Despegar.utilities.Utilidades;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://www.despegar.com.co/")
public class PageObjects extends PageObject{
	
	Utilidades uti;
	PageObject driver;
	
	String txt_origen = "";
	String txt_destino = "//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[2]/div[2]/div/div/div/div/input";
	String txt_fida = "//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[3]/div[2]/div[1]/div/input";
	String txt_fvuelta = "//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[3]/div[2]/div[2]/div/input";
	String txt_sinfecha = "//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/span/label/i";
	String txt_habitaciones = "//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[4]/div/div[5]/div/div";
	String txt_adultosMas = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/a[2]";
	String txt_adultosMenos = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div/a[1]";
	String txt_ninosMas = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div/a[2]";
	String txt_ninosMenos = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div/a[1]";
	String txt_edad1 = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div/div/select";
	String txt_edad2 = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/div/div/select";
	String txt_edad3 = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div/div/select";
	String txt_edad4 = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[4]/div[2]/div/div/select";
	String txt_edad5 = "/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/div[3]/div[5]/div[2]/div/div/select";
	String btn_buscar = "//*[@id=\"searchbox-sbox-box-packages\"]/div/div/div[3]/div[2]/div[5]/div/a";
	String btn_vuelo = "/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a/div";
	String txt_soloIda = "";
	
	public void ingreso_a_navegador() {
		driver.open();
	}
	
	public void seleccionar_origen_y_destino(String origen, String destino) {
		uti.escribirElement(txt_destino, destino);
		uti.enterElement(txt_destino);
	}
	
	public void seleccionar_fechas(String fida, String fvuelta) {
		uti.clickElement(txt_fida);
		
	}
	
	public void seleccionar_habitaciones(String adultos, String ninos, String edadnino1,String edadnino2, String edadnino3, String edadnino4, String edadnino5) {

	}
	
	public void validar_precio_mas_barato(String precioBajo) {

	}

	public void validar_precio_mas_barato() {

	}

	public void validar_precio_mas_alto(String precioAlto) {

	}

}
