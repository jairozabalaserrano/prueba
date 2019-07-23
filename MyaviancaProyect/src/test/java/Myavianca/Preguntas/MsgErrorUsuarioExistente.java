package Myavianca.Preguntas;

import Myavianca.UI.PaginaRegistro;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class MsgErrorUsuarioExistente {
  
	public static Question<? extends String> MsgErrorUsExistente() {
		return actor -> Text.of(PaginaRegistro.MSGERROR)
	            .viewedBy(actor).asString();
	}

}
