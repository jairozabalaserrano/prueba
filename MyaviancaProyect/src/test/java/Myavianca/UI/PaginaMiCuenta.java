package Myavianca.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaMiCuenta {
    public static Target PERFIL_NAME = Target.the("Mi perfil").located(By.xpath("//div[@class='sign-out row']"));
    public static void perfil(){
    	 System.out.println(Target.the("Mi Perfil").located(By.xpath("//div[@class='sign-out row']")));
    }

}

