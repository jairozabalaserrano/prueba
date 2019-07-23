package Myavianca.Acciones;

import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Myavianca.UI.PaginaLogin;
import Myavianca.UI.PaginaRegistro;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class RegistrarAc implements Task {

	private final String Correo;
	private final String Contrasena;
	private final String ConfirmarContrasena;
	private final String PrimerNombre;
	private final String SegundoNombre;
	private final String PrimerApellido;
	private final String SegundoApellido;
	private final String Pais;
	private final String Mes;
	private final String Dia;
	private final String Year;
	private final String Id;
	private final String PaisEmisor;
	private final WebDriver navegador;

	public RegistrarAc(String Correo, String Contrasena, String ConfirmarContrasena, String PrimerNombre,
			String SegundoNombre, String PrimerApellido, String SegundoApellido, String Pais, String Mes, String Dia,
			String Year, String Id, String PaisEmisor,WebDriver navegador) {

		this.Correo = Correo;
		this.Contrasena = Contrasena;
		this.ConfirmarContrasena = ConfirmarContrasena;
		this.PrimerNombre = PrimerNombre;
		this.SegundoNombre = SegundoNombre;
		this.PrimerApellido = PrimerApellido;
		this.SegundoApellido = SegundoApellido;
		this.Pais = Pais;
		this.Mes = Mes;
		this.Dia = Dia;
		this.Year = Year;
		this.Id = Id;
		this.PaisEmisor = PaisEmisor;
		this.navegador=navegador;

	}

	public static RegistrarConBuilder RegistrarStatic(String usuario) {
		return new RegistrarConBuilder(usuario);
	}

	@Override
	@Step("{0} Registra a su  cuenta con usuario: #Correo,#Contrasena,#ConfirmarContrasena,#PrimerNombre,#SegundoNombre,#PrimerApellido,#SegundoApellido,#Pais,#Mes,#Dia,#Ano,#Id,#PaisEmisor")
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(PaginaLogin.MYAVIANCA), 
				Click.on(PaginaLogin.BOTON_REGISTRO));
		
		String oldTab = navegador.getWindowHandle();
		ArrayList<String> newTab = new ArrayList<String>(navegador.getWindowHandles());
		newTab.remove(oldTab);
		navegador.switchTo().window(newTab.get(0));
		actor.attemptsTo(Click.on(PaginaRegistro.COOKIES),
				Enter.theValue(Correo).into(PaginaRegistro.EMAIL).thenHit(Keys.TAB),
				Enter.theValue(Contrasena).into(PaginaRegistro.PASSWORD).thenHit(Keys.TAB),
				Enter.theValue(ConfirmarContrasena).into(PaginaRegistro.CONFIRMPASSWORD).thenHit(Keys.TAB),
				Click.on(PaginaRegistro.EMAIL), Click.on(PaginaRegistro.SIGN_UP));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		actor.attemptsTo(Enter.theValue(PrimerNombre).into(PaginaRegistro.FIRSTNAME),
				Enter.theValue(SegundoNombre).into(PaginaRegistro.SECONDNAME),
				Enter.theValue(PrimerApellido).into(PaginaRegistro.FIRSTLASTNAME),
				Enter.theValue(SegundoApellido).into(PaginaRegistro.SECONDLASTNAME),
				SelectFromOptions.byVisibleText(Pais).from(PaginaRegistro.COUNTRY),
				SelectFromOptions.byVisibleText(Mes).from(PaginaRegistro.MONTH),
				SelectFromOptions.byVisibleText(Dia).from(PaginaRegistro.DAY),
				SelectFromOptions.byVisibleText(Year).from(PaginaRegistro.YEAR),
				SelectFromOptions.byVisibleText(PaisEmisor).from(PaginaRegistro.COUNTRYE),
				Enter.theValue(Id).into(PaginaRegistro.ID), Click.on(PaginaRegistro.CHECKTYC),
				Click.on(PaginaRegistro.CHECKP),
				Click.on(PaginaRegistro.CONFIRM));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static class RegistrarConBuilder {
		private String usuario;

		public RegistrarConBuilder(String usuario) {
			this.usuario = usuario;

		}

		public Performable Datos(String Correo, String Contrasena, String ConfirmarContrasena, String PrimerNombre,
				String SegundoNombre, String PrimerApellido, String SegundoApellido, String Pais, String Mes,
				String Dia, String Year, String Id, String PaisEmisor,WebDriver navegador) {
			return Instrumented.instanceOf(RegistrarAc.class).withProperties(Correo, Contrasena, ConfirmarContrasena,
					PrimerNombre, SegundoNombre, PrimerApellido, SegundoApellido, Pais, Mes, Dia, Year, Id, PaisEmisor,navegador);
		}

	}

}
