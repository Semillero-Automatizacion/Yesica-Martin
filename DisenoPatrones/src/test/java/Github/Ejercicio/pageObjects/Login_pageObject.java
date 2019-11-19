package Github.Ejercicio.pageObjects;

import org.openqa.selenium.By;

import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("https://colorlib.com/polygon/metis/login.html")
public class Login_pageObject extends PageObject{
	
	String txt_usuario = "//*[@id=\"login\"]/form/input[1]";
	String txt_contrasena = "//*[@id=\"login\"]/form/input[2]";
	String btn_ingresar = "//*[@id=\"login\"]/form/button";
	String txt_valida = "//*[@id=\"menu\"]/li[3]/a/span";
	String txt_compara = "Dashboard";
	
	public void ingresar_usuario(String usuario) throws Exception {
		
		find(By.xpath(txt_usuario)).sendKeys(usuario);
	}
	
	public void ingresar_contraseña(String contrasena) throws Exception {
		
		find(By.xpath(txt_contrasena)).sendKeys(contrasena);
	}
	
	public void click_en_el_boton_ingresar() throws Exception {

		find(By.xpath(btn_ingresar)).click();
	}
	
	public void se_valida_ingreso_correcto() throws Exception {
		
		
		Assert.assertEquals(find(By.xpath(txt_valida)).getText(), txt_compara);
	}

}
