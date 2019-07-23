package Myavianca;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Myavianca.Acciones.Decidido;
import Myavianca.Acciones.IngresarCon;
import Myavianca.Preguntas.LaPaginaMiCuenta;
import Myavianca.UI.PaginaMiCuenta;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class CuandoUsuarioSeLoguea {

	Actor actor;

	@Managed
	WebDriver navegador;

	@Before
	public void prepararEscenario() {
		actor = Actor.named("Andres");
		actor.can(BrowseTheWeb.with(navegador));
	}

	@Test
	public void ingresarAMyAccountCorrectamente(String Usuario,String Contrasena) throws InterruptedException {
		// Igresa a la pagina de MyAvianca
		actor.has(Decidido.ingresarConUsuarioYcontraseña());

		// El Actor quiere ingresar a su cuenta
		// Cuando
		actor.attemptsTo(IngresarCon.usuario(Usuario).contraseña(Contrasena));

		// El actor puede ver el subtitulo de my account
		// Entonces
		

	}
	
	@After
	public void Inicio(){
		PaginaMiCuenta.perfil();
		actor.should(seeThat("Mis Datos", LaPaginaMiCuenta.subtitulo(), equalTo("Hola, Jairo")));
	}

}