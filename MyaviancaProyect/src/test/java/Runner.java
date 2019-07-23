import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = ("src/test/resources/features/crear_cuenta_web.feature"),
				 tags=("@InUsSesion")

)

public class Runner {

}