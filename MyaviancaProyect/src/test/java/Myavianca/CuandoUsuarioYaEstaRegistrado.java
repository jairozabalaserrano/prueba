package Myavianca;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Myavianca.Acciones.DecididoReg;
import Myavianca.Acciones.RegistrarAc;
import Myavianca.Preguntas.MsgErrorUsuarioExistente;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class CuandoUsuarioYaEstaRegistrado {

	Actor actor;

	@Managed
	WebDriver navegador;

	@Before
	public void prepararEscenario() {
		actor = Actor.named("Andres");

		actor.can(BrowseTheWeb.with(navegador));
	}

	@Test
	public void RegistrarAMyAccountCorrectamente() throws InterruptedException {
		// Igresa a la pagina de MyAvianca
		actor.has(DecididoReg.RegistrarUsuario());

		// El Actor quiere Registrar su cuenta
		// Cuando
		actor.attemptsTo(RegistrarAc.RegistrarStatic("Andres").Datos("an0@gmail.com", "Andres.123546", "Andres.123546",
				"Jairo", "Andres", "Zabala", "Serrano", "Colombia", "Marzo", "24", "1998", "3176540978", "Colombia", navegador));

		// El actor puede ver el subtitulo de my account
		// Entonces
		Thread.sleep(2000);
		System.out.println("*************************************");
		actor.should(seeThat("Mis Datos", MsgErrorUsuarioExistente.MsgErrorUsExistente(),
		equalTo("This document number is already associated to a LifeMiles account. For assistance contact our Call Center (option 3) or send an email to support@lifemiles.com. Error code: 1536")));

	}

}