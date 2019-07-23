package Myavianca.Acciones;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import Myavianca.Constantes.Constantes;

public class Decidido implements Task {

	public Decidido() {
	}

	public static Performable ingresarConUsuarioYcontraseña() {
		return instrumented(Decidido.class);
	}

	@Override
	@Step("{0} ah decidido ingresar con su cuenta")
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Navegar.hacia(Constantes.PAGINA_SIGN_IN));

	}

}