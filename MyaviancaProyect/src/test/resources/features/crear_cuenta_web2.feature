@Cucumber
Feature: My Avianca

Scenario Outline: Registro de un usuario nuevo.
	Given Yo como usuario de MyAvianca deseo registrarme en la pagina utilizando mis datos personales.
	When Ingreso en la pagina para registrarme, digitos mis datos: <ArchivoDatos>.
	Then El usuario fue creado exitosamente.	
	Examples:
	|ArchivoDatos|
	|"C:/Users/1727166/Documents/Reportes/DataProvider/Data2.csv"|
	
	