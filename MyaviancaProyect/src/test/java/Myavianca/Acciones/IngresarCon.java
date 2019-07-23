package Myavianca.Acciones;

import Myavianca.UI.PaginaLogin;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class IngresarCon implements Task {
	private final String usuario;
	private final String contraseña;

	public IngresarCon(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	public static IngresarConBuilder usuario(String usuario) {
		return new IngresarConBuilder(usuario);
	}

	@Override
	@Step("{0} ingresa a su  cuenta con usuario: #usuario y contraseña: #contraseña")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(PaginaLogin.MYAVIANCA),
				Enter.theValue(usuario).into(PaginaLogin.EMAIL).thenHit(Keys.TAB),
				Enter.theValue(contraseña).into(PaginaLogin.PASSWORD).thenHit(Keys.TAB),
				Click.on(PaginaLogin.BOTON_SIGN_IN)

		);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actor.attemptsTo(Click.on(PaginaLogin.BOTON_PERFIL));
	}

	public static class IngresarConBuilder {
		private String usuario;

		public IngresarConBuilder(String usuario) {
			this.usuario = usuario;
		}

		public Performable contraseña(String contraseña) {
			return Instrumented.instanceOf(IngresarCon.class).withProperties(usuario, contraseña);
		}
	}
}
