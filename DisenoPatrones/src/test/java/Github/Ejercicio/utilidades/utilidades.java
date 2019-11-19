package Github.Ejercicio.utilidades;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class utilidades extends PageObject {

	public void clicElement(String xpath) {

		find(By.xpath(xpath)).click();
	}

	public void escribirElement(String xpath, String texto) {

		find(By.xpath(xpath)).sendKeys(texto);
	}

	public String leerElement(String xpath, String texto) {

		texto = find(By.xpath(xpath)).getText();
		return texto;
	}

	public void limpiarElement(String xpath) {

		find(By.xpath(xpath)).clear();
	}

	public void enterElement(String xpath) {

		find(By.xpath(xpath)).sendKeys(Keys.ENTER);
	}
	
	public void selecElement(String xpath, String numLinea) {
		
		Select lista = new Select(find(By.xpath(xpath)));
		lista.selectByVisibleText(numLinea);
	}
	


}
