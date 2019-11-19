package Github.Calculadora.definitions;

import Github.Calculadora.steps.calculadoraStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class calculadoraDefinition {
	
	@Steps
	calculadoraStep calStep;

	
	@Given("^Abrir calculadora$")
	public void abrir_calculadora() throws Exception {
		calStep.abrir_calculadora();
	}


	@When("^Recibir primer numero \"([^\"]*)\"$")
	public void recibir_primer_numero(String num1) throws Exception {
		calStep.recibir_primer_numero(num1);
	}


	@When("^Elegir operador \"([^\"]*)\"$")
	public void elegir_operador(String operador) throws Exception {

	}

	@When("^Recibir segundo numero \"([^\"]*)\"$")
	public void recibir_segundo_numero(String num2) throws Exception {

	}

	@Then("^Mostrar resultado$")
	public void mostrar_resultado() throws Exception {

	}




}
