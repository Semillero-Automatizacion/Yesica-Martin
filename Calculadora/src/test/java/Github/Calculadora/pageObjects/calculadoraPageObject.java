package Github.Calculadora.pageObjects;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

import Github.Calculadora.utilidades.utilidades;
import net.serenitybdd.core.pages.PageObject;

public class calculadoraPageObject extends PageObject{
	
	utilidades uti;
	
	WiniumDriver localizador;

	public void abrir_calculadora(){

		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		File driverPath = new File("C:\\Users\\1813476\\Documents\\Chicos del barrio\\Calculadora\\target\\test-classes\\drivers\\Winium.Desktop.Driver.exe");
		WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		
		try {
			service.start();
		}catch (IOException e) {
			System.out.println("Exception while starting WINIUM service");
			e.printStackTrace();
		}
		
		WiniumDriver driver = new WiniumDriver(service, options);
		
		driver.findElement(By.name("Uno")).click();
		driver.findElement(By.name("Dos")).click();
		driver.findElement(By.name("Más")).click();
		driver.findElement(By.name("Dos")).click();
		driver.findElement(By.name("Multiplicar por")).click();
		driver.findElement(By.name("Cinco")).click();
		driver.findElement(By.name("Más")).click();
		driver.findElement(By.name("Tres")).click();
		driver.findElement(By.name("Seis")).click();
		driver.findElement(By.name("Menos")).click();
		driver.findElement(By.name("Ocho")).click();
		driver.findElement(By.name("Siete")).click();
		driver.findElement(By.name("Es igual a")).click();
		
		
		driver.close();
		service.stop();
	}

	public void recibir_primer_numero(String num1) throws Exception {

	
		
	}

	public void elegir_operador(String operador) throws Exception {

	}


	public void recibir_segundo_numero(String num2) throws Exception {

	}

	public void mostrar_resultado() throws Exception {

	}
}
