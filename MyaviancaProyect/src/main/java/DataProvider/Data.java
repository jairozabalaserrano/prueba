package DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Data {

	public String[][] DatosP = new String[5][14];
	int i = 0;

	public String[][] LeerDatos(String Path) {
		String csvFile = Path;
		String line = "";
		String cvsSplitBy = ";";
		int j = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				String[] Datos = line.split(cvsSplitBy);
				if (j == 0) {
					Datos[0] = Datos[0].substring(1);
					DatosP[j][0] = Datos[0];
					DatosP[j][1] = Datos[1];
					DatosP[j][2] = Datos[2];
					DatosP[j][3] = Datos[3];
					DatosP[j][4] = Datos[4];
					DatosP[j][5] = Datos[5];
					DatosP[j][6] = Datos[6];
					DatosP[j][7] = Datos[7];
					DatosP[j][8] = Datos[8];
					DatosP[j][9] = Datos[9];
					DatosP[j][10] = Datos[10];
					DatosP[j][11] = Datos[11];
					DatosP[j][12] = Datos[12];
					Datos[13] = Datos[13].substring(1);
					DatosP[j][13] = Datos[13];
				}
				if (j == 1) {
					Datos[0] = Datos[0].substring(1);
					DatosP[j][0] = Datos[0];
					DatosP[j][1] = Datos[1];
					DatosP[j][2] = Datos[2];
					DatosP[j][3] = Datos[3];
					DatosP[j][4] = Datos[4];
					DatosP[j][5] = Datos[5];
					DatosP[j][6] = Datos[6];
					DatosP[j][7] = Datos[7];
					DatosP[j][8] = Datos[8];
					DatosP[j][9] = Datos[9];
					DatosP[j][10] = Datos[10];
					DatosP[j][11] = Datos[11];
					DatosP[j][12] = Datos[12];
					Datos[13] = Datos[13].substring(1);
					DatosP[j][13] = Datos[13];
				}
				if (j == 2) {
					Datos[0] = Datos[0].substring(1);
					DatosP[j][0] = Datos[0];
					DatosP[j][1] = Datos[1];
					DatosP[j][2] = Datos[2];
					DatosP[j][3] = Datos[3];
					DatosP[j][4] = Datos[4];
					DatosP[j][5] = Datos[5];
					DatosP[j][6] = Datos[6];
					DatosP[j][7] = Datos[7];
					DatosP[j][8] = Datos[8];
					DatosP[j][9] = Datos[9];
					DatosP[j][10] = Datos[10];
					DatosP[j][11] = Datos[11];
					DatosP[j][12] = Datos[12];
					Datos[13] = Datos[13].substring(1);
					DatosP[j][13] = Datos[13];
				}
				if (j == 3) {
					Datos[0] = Datos[0].substring(1);
					DatosP[j][0] = Datos[0];
					DatosP[j][1] = Datos[1];
					DatosP[j][2] = Datos[2];
					DatosP[j][3] = Datos[3];
					DatosP[j][4] = Datos[4];
					DatosP[j][5] = Datos[5];
					DatosP[j][6] = Datos[6];
					DatosP[j][7] = Datos[7];
					DatosP[j][8] = Datos[8];
					DatosP[j][9] = Datos[9];
					DatosP[j][10] = Datos[10];
					DatosP[j][11] = Datos[11];
					DatosP[j][12] = Datos[12];
				}
				if (j == 4) {
					Datos[0] = Datos[0].substring(1);
					DatosP[j][0] = Datos[0];
					DatosP[j][1] = Datos[1];
					DatosP[j][2] = Datos[2];
					DatosP[j][3] = Datos[3];
					DatosP[j][4] = Datos[4];
					DatosP[j][5] = Datos[5];
					DatosP[j][6] = Datos[6];
					DatosP[j][7] = Datos[7];
					DatosP[j][8] = Datos[8];
					DatosP[j][9] = Datos[9];
					DatosP[j][10] = Datos[10];
					DatosP[j][11] = Datos[11];
					DatosP[j][12] = Datos[12];
					Datos[13] = Datos[13].substring(1);
					DatosP[j][13] = Datos[13];
				}
				
				
				j++;
			

			}

	}catch(

	IOException e)
	{
			e.printStackTrace();
		}
		return DatosP;
	}

	public void RegistrarUsuario() {

	}

	public String[][] ObtenerDatos(String[][] Datos) {
		int b = 0;
		int a = 0;
		for (int i = 0; i < Datos.length; i++) {

			b++;
			for (int j = 0; j < Datos.length; j++) {
				Datos[i][j] = DatosP[i][j];

				a++;
			}
		}
		return Datos;

	}

}
