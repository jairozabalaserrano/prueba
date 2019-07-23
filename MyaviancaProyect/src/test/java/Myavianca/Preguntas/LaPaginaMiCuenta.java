package Myavianca.Preguntas;

import Myavianca.UI.PaginaMiCuenta;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaPaginaMiCuenta {
    public static Question<String> subtitulo() {
    return actor -> Text.of(PaginaMiCuenta.PERFIL_NAME)
            .viewedBy(actor).asString();
    
    }

}
