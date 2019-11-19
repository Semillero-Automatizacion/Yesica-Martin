package Github.Ejercicio.definitions;

import Github.Ejercicio.steps.validacionFormulario_steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class validacionFormulario_definition {
	
	@Steps
	validacionFormulario_steps valFormularioSteps;

	@Given("^Ingresar sesion \"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_sesion(String usuario, String contrasena) throws Exception {

		valFormularioSteps.ingresar_sesion(usuario, contrasena);
	}


	@When("^Diligencio formulario \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void diligencio_formulario(String nombre, String direccion, String correo, String pass, String numeroMin, String caracterMax, String numeroFlotante, String ip, String date, String dateAntes) throws Exception {
		
		valFormularioSteps.diligencio_formulario(nombre, direccion, correo, pass, numeroMin, caracterMax, numeroFlotante, ip, date, dateAntes);
	}
}
