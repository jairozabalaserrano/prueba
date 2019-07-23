package Myavianca.Acciones;

import Myavianca.Constantes.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DecididoReg implements Task {

	public DecididoReg() {
	}

	public static Performable RegistrarUsuario() {
		return instrumented(DecididoReg.class);
	}

	@Step("{0} ah decidido ingresar con su cuenta")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_SIGN_IN));

	}

}
