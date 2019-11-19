package Github.Ejercicio.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.junit.Assert;
import Github.Ejercicio.utilidades.utilidades;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class validacionFormulario_pageObject extends PageObject {
	
	String btn_FormElement = "//*[@id=\"top\"]/nav/div/div[2]/ul/li[4]/a";
	String list_Element = "//*[@id=\"top\"]/nav/div/div[2]/ul/li[4]/ul/li[2]/a";
	String txt_nombre = "//*[@id=\"req\"]";
	String list_deporte = "//*[@id=\"sport\"]";
	String list_multiple = "//*[@id=\"sport2\"]";
	String txt_direccion = "//*[@id=\"url1\"]";
	String txt_correo = "//*[@id=\"email1\"]";
	String txt_pass = "//*[@id=\"pass1\"]";
	String txt_conPass = "//*[@id=\"pass2\"]";
	String txt_numeroMin = "//*[@id=\"minsize1\"]";
	String txt_caracterMax = "//*[@id=\"maxsize1\"]";
	String txt_numeroFlotante = "//*[@id=\"number2\"]";
	String txt_ip = "//*[@id=\"ip\"]";
	String txt_date = "//*[@id=\"date3\"]";
	String txt_dateAntes = "//*[@id=\"past\"]";
	String btn_validar = "//*[@id=\"popup-validation\"]/div[14]/input";
	String txt_comparar = "//div[@class='formErrorContent']";
	
	utilidades utilidades;
	
	public void diligencio_formulario(String nombre, String direccion, String correo, String pass, String numeroMin, String caracterMax, String numeroFlotante, String ip, String date, String dateAntes) throws Exception {

		find(By.xpath(btn_FormElement)).click();
		find(By.xpath(list_Element)).click();
		Thread.sleep(1000);
		utilidades.escribirElement(txt_nombre, nombre);
		utilidades.selecElement(list_deporte, "Tennis");
		utilidades.selecElement(list_multiple, "Tennis");
		utilidades.escribirElement(txt_direccion, direccion);
		String correoA = correoAleatorio();
		utilidades.escribirElement(txt_correo, correoA);
		utilidades.escribirElement(txt_pass, pass);
		utilidades.escribirElement(txt_conPass, pass);
		utilidades.escribirElement(txt_numeroMin, numeroMin);
		utilidades.limpiarElement(txt_caracterMax);
		utilidades.limpiarElement(txt_numeroFlotante);
		utilidades.escribirElement(txt_numeroFlotante, numeroFlotante);
		utilidades.escribirElement(txt_ip, ip);
		utilidades.limpiarElement(txt_date);
		utilidades.escribirElement(txt_date, date);
		utilidades.limpiarElement(txt_dateAntes);
		utilidades.escribirElement(txt_dateAntes, dateAntes);
		utilidades.clicElement(btn_validar);
		//utilidades.clicElement(btn_validar);
		Thread.sleep(1000);
		Assert.assertEquals(true, find(By.xpath(txt_comparar)).isVisible());	
		
	}
	
	public String correoAleatorio () {
		
		String nombre = RandomStringUtils.randomAlphabetic(8);
		String correo = nombre + "@tcs.com";
		return correo;
	}

}
