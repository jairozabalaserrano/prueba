package Myavianca.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLogin {
	public static Target MYAVIANCA = Target.the("Click en el boton Myavianca").located(By.xpath("//a[@class='open-login-modal movimientoFlecha']/i[2]"));
    public static Target EMAIL = Target.the("Entrada del usuario").located(By.xpath("//input[@id='lifeMilesNumber']"));
    public static Target PASSWORD = Target.the("Entrada contraseña").located(By.xpath("//input[@id='lifeMilesPassword']"));
    public static Target BOTON_SIGN_IN = Target.the("Boton de Iniciar Sesion").located(By.xpath("//input[@class='btnLogin btn boton-principal boton-submit btn primary right']"));
    public static Target BOTON_PERFIL = Target.the("Boton para el perfil").located(By.xpath("//div[@class='sign-out row']"));
    public static Target BOTON_REGISTRO = Target.the("Boton para el perfil").located(By.xpath("//section[@id='loginModal']/article/div/div[1]/div/div[2]/a"));
    
    
}
