package Github.Despegar.Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features= {"src/test/resources/features/casos.feature"},  
		glue = {"Github.Despegar.Definitions"}, 
		tags = {"@tag2"})
public class despegarRunner {

}
