package Github.Despegar.PageObjects;

import org.openqa.selenium.Keys;

import Github.Despegar.Utilidades.utilidades;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl ("https://www.despegar.com.co/")
public class despegarPageObject extends PageObject{
	
	utilidades uti;

	//Primer caso
	//solo ida para 2 adultos y 3 niños y validar el precio más barato del vuelo.
	String btn_vuelo = "/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a/div";
	String txt_soloIda = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[1]/div[3]/div[2]/div/span[2]/label/i";
	String txt_destino = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/input";
	String txt_fida = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input";
	String txt_dia = "/html/body/div[4]/div/div[5]/div[1]/div[4]/span[22]/span[1]";
	String txt_pasajeros = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[3]/div[7]/div/div/div/div[2]/input";
	String txt_adultosMas = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]";
	String txt_ninosMas = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/a[2]";
	String txt_edad1 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/select";
	String txt_edad2 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[2]/div[2]/div/div/select";
	String txt_edad3 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/div/div/select";
	String btn_buscar = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[4]/div/a";
	
	
	
	String txt_origen = "";
	String txt_fvuelta = "";
	String txt_sinfecha = "";
	String txt_habitaciones = "";
	String txt_adultosMenos = "";	
	String txt_ninosMenos = "";
	String txt_edad4 = "";
	String txt_edad5 = "";
	
	
	

	public void seleccionar_origen_y_destino(String origen, String destino) throws InterruptedException {
		uti.clickElement(btn_vuelo);
		uti.clickElement(txt_soloIda);
		uti.escribirElement(txt_destino, destino);
		Thread.sleep(1000);
		uti.enterElement(txt_destino);
		
		
	}

	public void seleccionar_fechas(String fida, String fvuelta) {
	
		uti.clickElement(txt_fida);
		uti.clickElement(txt_dia);
	}

	public void seleccionar_habitaciones(String adultos, String ninos, String nino1, String nino2, String nino3) {

	}

	public void validar_precio_mas_barato() {

	}
}
