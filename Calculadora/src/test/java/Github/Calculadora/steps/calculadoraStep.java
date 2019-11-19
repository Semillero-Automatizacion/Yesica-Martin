package Github.Calculadora.steps;

import Github.Calculadora.pageObjects.calculadoraPageObject;
import net.thucydides.core.annotations.Step;

public class calculadoraStep {
	
	calculadoraPageObject calPageObject;

	@Step
	public void abrir_calculadora() throws Exception {
		calPageObject.abrir_calculadora();
	}

	@Step
	public void recibir_primer_numero(String num1) throws Exception {
		calPageObject.recibir_primer_numero(num1);
	}

	@Step
	public void elegir_operador(String operador) throws Exception {

	}

	@Step
	public void recibir_segundo_numero(String num2) throws Exception {

	}

	@Step
	public void mostrar_resultado() throws Exception {

	}
	
}
