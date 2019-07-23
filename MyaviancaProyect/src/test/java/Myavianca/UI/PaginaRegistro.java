package Myavianca.UI;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaRegistro {
	
	public static Target COOKIES = Target.the("Boton de cookies").located(By.xpath("//button[@class='CookiesBrowserAlert_acceptButton__2aJv2']"));
	public static Target EMAIL = Target.the("Correo del usuario").located(By.xpath("//input[@id='email']"));
    public static Target PASSWORD = Target.the("Entrada contraseña").located(By.xpath("//input[@id='password'] "));
    public static Target CONFIRMPASSWORD = Target.the("Entrada de la confirmacion de la contraseña").located(By.xpath("//input[@id='confirmPassword']"));
    public static Target SIGN_UP = Target.the("Boton de Siguiente").located(By.xpath("//button[@class='Enrollment_nextButton__udQ_2 Enrollment_buttonBlue__3A6Qy']"));
    public static Target FIRSTNAME = Target.the("Entrada Primer Nombre").located(By.xpath("//input[@id='firstname']"));
    public static Target SECONDNAME = Target.the("Entrada Segundo Nombre").located(By.xpath("//input[@id='secondName']"));
    public static Target FIRSTLASTNAME = Target.the("Entrada Primer Apellido").located(By.xpath("//input[@id='lastname']"));
    public static Target SECONDLASTNAME = Target.the("Entrada Segundo Apellido").located(By.xpath("//input[@id='secondLastName']"));
    public static Target COUNTRY = Target.the("Entrada del pais").located(By.xpath("//select[@id='country']"));
    public static Target MONTH = Target.the("Entrada Mes").located(By.xpath("//select[@class='Select_selectInput__2nz5Z Select_placeholder__1cdQc Select_monthSelectNoBorder__1hZnu']"));
    public static Target DAY = Target.the("Entrada Dia").located(By.xpath("//select[@class='Select_selectInput__2nz5Z Select_placeholder__1cdQc'][1]"));
    public static Target YEAR = Target.the("Entrada year").located(By.xpath("//select[@class='Select_selectInput__2nz5Z Select_placeholder__1cdQc'][1]"));
    public static Target ID = Target.the("Entrada ID").located(By.xpath("//input[@id='documentNumber']"));
    public static Target COUNTRYE = Target.the("Entrada Pais Emisor").located(By.xpath("//select[@class='Select_selectInput__2nz5Z Select_placeholder__1cdQc'][1]"));
    public static Target CHECKTYC = Target.the("Check Terminos y condiciones").located(By.xpath("//label[@class='Step2_hiddenLabel__3rnGj'][1]"));
    public static Target CHECKP = Target.the("Check Politicas").located(By.xpath("//label[@for='normal_term1']"));
    public static Target CONFIRM = Target.the("Boton Confirmar").located(By.xpath("//button[@id='Enrollment-confirm']"));
    public static Target MSGERROR = Target.the("Mensaje Error").located(By.xpath("//p[@class='ErrorModal_description__jS3n4'][1]"));
    
}
