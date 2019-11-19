package Github.Ejercicio.steps;

import Github.Ejercicio.pageObjects.Login_pageObject;
import net.thucydides.core.annotations.Step;

public class Login_steps {
	
	Login_pageObject Login_pageObject;
	
	@Step
	public void ingreso_a_navegador() {
		
		Login_pageObject.open();
	}
	
	public void ingresar_usuario(String usuario) throws Exception {
		
		Login_pageObject.ingresar_usuario(usuario);
	}
	
	public void ingresar_contraseña(String contrasena) throws Exception {

		Login_pageObject.ingresar_contraseña(contrasena);
	}

	public void click_en_el_boton_ingresar() throws Exception {

		Login_pageObject.click_en_el_boton_ingresar();
	}
	
	public void se_valida_ingreso_correcto() throws Exception {

		Login_pageObject.se_valida_ingreso_correcto();
	}
}
