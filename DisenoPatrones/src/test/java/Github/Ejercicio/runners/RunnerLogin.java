package Github.Ejercicio.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/",  glue= {"Github.Ejercicio"}, tags= {"@tagValidarForm"})

public class RunnerLogin {
	
	

}
