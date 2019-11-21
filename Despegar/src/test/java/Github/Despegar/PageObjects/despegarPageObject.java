package Github.Despegar.PageObjects;

import org.openqa.selenium.Keys;

import Github.Despegar.Utilidades.utilidades;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl ("https://www.despegar.com.co/")
public class despegarPageObject extends PageObject{
	
	utilidades uti;

	//Primer caso
	String btn_vuelo = "/html/body/nav/div[2]/div[1]/div[3]/ul/li[2]/a/div";
	String txt_soloIda = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[1]/div[3]/div[2]/div/span[2]/label/i";
	String txt_origen = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[1]/div[1]/div/div/div/input";
	String txt_destino = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[1]/div[2]/div/div/div/div/input";
	String txt_fvuelta = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[2]/div[4]/input";
	String txt_fida = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/input";
	String txt_noviembre = "/html/body/div[4]/div/div[5]/div[1]/div[4]/span[diaNov]/span[1]";
	String txt_diciembre = "/html/body/div[4]/div/div[5]/div[2]/div[4]/span[diaDic]/span[1]"; 
	String txt_pasajeros = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[3]/div[7]/div/div/div/div[2]/input";
	String txt_adultosMas = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[1]/div[2]/div/a[2]";
	String txt_ninosMas = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[2]/div[2]/div/a[2]";
	String txt_edad1 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div/div/select";
	String txt_edad2 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[2]/div[2]/div/div/select";
	String txt_edad3 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/div/div/select";
	String txt_edad4 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[4]/div[2]/div/div/select";
	String txt_edad5 = "/html/body/div[3]/div/div[1]/div[2]/div/div[1]/div/div[3]/div[5]/div[2]/div/div/select";
	String btn_buscar = "//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div[3]/div[2]/div[4]/div/a/em";
	String txt_aceptar = "//*[@id=\"dreck-wrongcountry-modal\"]/div[1]/i";
	String txt_mostrarPrecio = "//*[@id=\"inline-filters-VERTICAL_FILTERS\"]/div/ul/filter-group[4]/li/span";	
	String txt_precioBajo = "//*[@id=\"inline-filters-VERTICAL_FILTERS\"]/div/ul/filter-group[4]/li/ul/div/price-filter/slider-filter/filter-container/div/div/ul/li[1]/slider/div/div[2]/span[1]/span/span";

	String txt_adultosMenos = "";	
	String txt_ninosMenos = "";
	
	
	public void seleccionarTipo (){
		uti.clickElement(btn_vuelo);
	}
	

	public void ingresar_solo_ida() throws InterruptedException {
		uti.clickElement(txt_soloIda);
		Thread.sleep(1000);
		uti.clickElement(txt_soloIda);
	}
	
	public void seleccionar_origen(String origen) throws InterruptedException {
		uti.limpiarElement(txt_origen);
		uti.escribirElement(txt_origen, origen);
		Thread.sleep(1000);
		uti.enterElement(txt_origen);
	}

	public void seleccionar_destino(String destino) throws InterruptedException {
		uti.escribirElement(txt_destino, destino);
		Thread.sleep(1000);
		uti.enterElement(txt_destino);
	}

	public void seleccionar_fida(String fida) throws InterruptedException {
	
		uti.clickElement(txt_fida);
		txt_noviembre = txt_noviembre.replace("diaNov", fida);
		uti.esperarElement(txt_noviembre);
		uti.clickElement(txt_noviembre);
	}
	
	public void seleccionar_fvuelta(String fvuelta) throws InterruptedException {
		//String  localizador="";
		//localizador = localizador.concat("primeraparte"+fvuelta+"segundaparte");
		uti.clickElement(txt_fvuelta);
		txt_diciembre = txt_diciembre.replace("diaDic", fvuelta);
		uti.esperarElement(txt_diciembre);
		uti.clickElement(txt_diciembre);
	}
	
	public void cantAdultos(String adultos) {
		int cantAdultos = Integer.parseInt(adultos);
		for (int i = 1; i < cantAdultos; i++) {
			uti.esperarElement(txt_adultosMas);
			uti.clickElement(txt_adultosMas);
		}
	}
	
	public void cantNinos (String ninos) {
		int cantNinos = Integer.parseInt(ninos);
		for (int i = 0; i < cantNinos; i++) {
			 uti.esperarElement(txt_ninosMas);
			 uti.clickElement(txt_ninosMas);
		}
	}

	public void botonBuscar () {
		uti.clickElement(btn_buscar);
	}
	
	//Buscar un vuelvo de solo ida para 2 adultos y 3 niños y validar el precio más barato del vuelo.
	public void seleccionar_habitaciones_uno(String adultos, String ninos, String nino1, String nino2, String nino3) throws InterruptedException {
		uti.clickElement(txt_pasajeros);
		cantAdultos(adultos);
		cantNinos(ninos);
		uti.esperarElement(txt_edad1);
		uti.selecElement(txt_edad1, nino1);
		uti.selecElement(txt_edad2, nino2);
		uti.selecElement(txt_edad3, nino3);
	}
	
	//Buscar un vuelo de ida y vuelta para 4 adultos y 4 niños y validar el precio más barato del vuelo
	public void seleccionar_habitaciones_dos(String adultos, String ninos, String nino1, String nino2, String nino3, String nino4) throws InterruptedException {
		uti.clickElement(txt_pasajeros);
		cantAdultos(adultos);
		Thread.sleep(1000);
		cantNinos(ninos);
		Thread.sleep(1000);
		uti.selecElement(txt_edad1, nino1);
		uti.selecElement(txt_edad2, nino2);
		uti.selecElement(txt_edad3, nino3);
		uti.selecElement(txt_edad4, nino4);
		
	}

	public void validar_precio_mas_barato() {
		uti.esperarElement(txt_aceptar);
		uti.clickElement(txt_aceptar);
		uti.esperarElement(txt_mostrarPrecio);
		uti.clickElement(txt_mostrarPrecio);
		String costo = uti.leerElement(txt_precioBajo);
		int bus = costo.indexOf('$');
		String busca = costo.substring(bus+1);
		System.out.println("===================\n\n\n\n\n\n\n"+busca+"\n\n\n\n\n\n\n=================");
		Assert.assertEquals(busca,"9.187.909");	
		
	}
}
