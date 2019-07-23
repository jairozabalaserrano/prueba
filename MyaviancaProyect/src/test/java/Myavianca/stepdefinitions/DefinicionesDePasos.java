package Myavianca.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import DataProvider.Data;
import Myavianca.Acciones.Decidido;
import Myavianca.Acciones.DecididoReg;
import Myavianca.Acciones.IngresarCon;
import Myavianca.Acciones.RegistrarAc;
import Myavianca.Preguntas.LaPaginaMiCuenta;
import Myavianca.Preguntas.MsgErrorUsuarioExistente;
import Myavianca.UI.PaginaMiCuenta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class DefinicionesDePasos {

	@Steps(shared = true)

	Actor actor = Actor.named("Andres");

	@Managed
	WebDriver navegador;

	@Given("^Yo como usuario de Myavianca deseo iniciar sesion en la pagina utilizando mis datos personales\\.$")
	public void yo_como_usuario_de_Myavianca_deseo_iniciar_sesion_en_la_pagina_utilizando_mis_datos_personales()
			throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		actor.can(BrowseTheWeb.with(navegador));

	}

	@When("^Registro de un usuario,\"([^\"]*)\",\"([^\"]*)\"$")
	public void registro_de_un_usuario(String Usuario, String Contrasena) throws InterruptedException, Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(Usuario);
		System.out.println(Contrasena);
		// Igresa a la pagina de MyAvianca
		actor.has(Decidido.ingresarConUsuarioYcontraseña());

		// El Actor quiere ingresar a su cuenta
		// Cuando
		actor.attemptsTo(IngresarCon.usuario(Usuario).contraseña(Contrasena));

	}

	@Then("^Usuario Inicio Sesion\\.$")
	public void usuario_Inicio_Sesion() {
		// Write code here that turns the phrase above into concrete actions
		// El actor puede ver el subtitulo de my account
		// Entonces
		PaginaMiCuenta.perfil();
		actor.should(seeThat("Mis Datos", LaPaginaMiCuenta.subtitulo(), equalTo("Hola, Jairo")));

	}

	@When("^Registro de un usuario,\"([^\"]*)\"$")
	public void registro_de_un_usuario(String ArchivoDatos) throws InterruptedException, Throwable {
		// Write code here that turns the phrase above into concrete actions
		
				Data Datos = new Data();
				String[][] Inf = Datos.LeerDatos(ArchivoDatos);

				// El Actor quiere Registrar su cuenta
				// Cuando
				for (int i = 1; i <= 3; i++) {
					this.yo_como_usuario_de_Myavianca_deseo_iniciar_sesion_en_la_pagina_utilizando_mis_datos_personales();
				// Igresa a la pagina de MyAvianca
					actor.has(DecididoReg.RegistrarUsuario());
					actor.attemptsTo(RegistrarAc.RegistrarStatic("Andres").Datos(Inf[i][0], Inf[i][1], Inf[i][2], Inf[i][3],
							Inf[i][4], Inf[i][5], Inf[i][6], Inf[i][7], Inf[i][8], Inf[i][9], Inf[i][10], Inf[i][11],
							Inf[i][12], navegador));
					navegador.quit();
				}
				this.yo_como_usuario_de_Myavianca_deseo_iniciar_sesion_en_la_pagina_utilizando_mis_datos_personales();
				actor.has(DecididoReg.RegistrarUsuario());
				actor.attemptsTo(RegistrarAc.RegistrarStatic("Andres").Datos(Inf[4][0], Inf[4][1], Inf[4][2], Inf[4][3],
						Inf[4][4], Inf[4][5], Inf[4][6], Inf[4][7], Inf[4][8], Inf[4][9], Inf[4][10], Inf[4][11],
						Inf[4][12], navegador));
	}
	
	@When("^Registro de un usuario existente,\"([^\"]*)\"$")
	public void registro_de_un_usuario_existente(String ArchivoDatos) throws InterruptedException, Throwable {
		// Write code here that turns the phrase above into concrete actions
		
				Data Datos = new Data();
				String[][] Inf = Datos.LeerDatos(ArchivoDatos);

				// El Actor quiere Registrar su cuenta
				// Cuando
				for (int i = 1; i <= 3; i++) {
					this.yo_como_usuario_de_Myavianca_deseo_iniciar_sesion_en_la_pagina_utilizando_mis_datos_personales();
				// Igresa a la pagina de MyAvianca
					actor.has(DecididoReg.RegistrarUsuario());
					actor.attemptsTo(RegistrarAc.RegistrarStatic("Andres").Datos(Inf[i][0], Inf[i][1], Inf[i][2], Inf[i][3],
							Inf[i][4], Inf[i][5], Inf[i][6], Inf[i][7], Inf[i][8], Inf[i][9], Inf[i][10], Inf[i][11],
							Inf[i][12], navegador));
					navegador.quit();
				}
				this.yo_como_usuario_de_Myavianca_deseo_iniciar_sesion_en_la_pagina_utilizando_mis_datos_personales();
				actor.has(DecididoReg.RegistrarUsuario());
				actor.attemptsTo(RegistrarAc.RegistrarStatic("Andres").Datos(Inf[4][0], Inf[4][1], Inf[4][2], Inf[4][3],
						Inf[4][4], Inf[4][5], Inf[4][6], Inf[4][7], Inf[4][8], Inf[4][9], Inf[4][10], Inf[4][11],
						Inf[4][12], navegador));
	}
	

	@Then("^Usuario ya registrado\\.$")
	public void usuario_ya_registrado() {
		actor.should(seeThat("Mis Datos", MsgErrorUsuarioExistente.MsgErrorUsExistente(), equalTo(
				"This document number is already associated to a LifeMiles account. For assistance contact our Call Center (option 3) or send an email to support@lifemiles.com. Error code: 1536")));

	}

	@Then("^Usuario registrado\\.$")
	public void usuario_registrado() {
		// Usuario Registrado Correctamente

	}

}
