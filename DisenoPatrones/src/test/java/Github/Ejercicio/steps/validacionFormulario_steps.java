package Github.Ejercicio.steps;

import Github.Ejercicio.pageObjects.Login_pageObject;
import Github.Ejercicio.pageObjects.validacionFormulario_pageObject;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;

public class validacionFormulario_steps {
	
	validacionFormulario_pageObject validacionFormulario_pageObject;
	Login_pageObject objeto;
	
	public void ingresar_sesion(String usuario, String contrasena) throws Exception {

		objeto.ingresar_usuario(usuario);
		objeto.ingresar_contraseña(contrasena);
		objeto.click_en_el_boton_ingresar();
	}
	
	@Step
	public void diligencio_formulario(String nombre, String direccion, String correo, String pass, String numeroMin, String caracterMax, String numeroFlotante, String ip, String date, String dateAntes) throws Exception {

		validacionFormulario_pageObject.diligencio_formulario(nombre, direccion, correo, pass, numeroMin, caracterMax, numeroFlotante, ip, date, dateAntes);

	}
	
	
	

}
