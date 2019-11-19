package Github_Despegar.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/",  
		glue = "Github_Despegar", 
		tags = "@tag1_CP0010M")

public class Runner {

	
}
