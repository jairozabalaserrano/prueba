@Cucumber
Feature: Proyecto Myavianca
  
  Esta feature se trata de crear una nueva cuenta,crear una cuenta existente y un inicio de sesion en el sitio web de My Avianca
@InUsSesion
  Scenario Outline: Inicio de sesion.
    Given Yo como usuario de Myavianca deseo iniciar sesion en la pagina utilizando mis datos personales.
    When Registro de un usuario,<Usuario>,<Contrasena>
    Then Usuario Inicio Sesion.

    Examples: 
      | Usuario       | Contrasena      |
      | "31765309402" | "Andres.123456" |
@RegUsuario
  Scenario Outline: Registro de un usuario nuevo.
    Given Yo como usuario de Myavianca deseo iniciar sesion en la pagina utilizando mis datos personales.
    When Registro de un usuario,<ArchivoDatos>
    Then Usuario registrado.

    Examples: 
      | ArchivoDatos                                                 |
      | "C:/Users/1727166/Documents/Reportes/DataProvider/Data2.csv" |
@RegUsuarioExistente
  Scenario Outline: Registro de un usuario Extistente.
    Given Yo como usuario de Myavianca deseo iniciar sesion en la pagina utilizando mis datos personales.
    When Registro de un usuario existente,<ArchivoDatos>
    Then Usuario ya registrado.

     Examples: 
      | ArchivoDatos                                                 |
      | "C:/Users/1727166/Documents/Reportes/DataProvider/Data2.csv" |