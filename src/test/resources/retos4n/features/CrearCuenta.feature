Feature: Formulario Crear Cuenta

@CasoPrueba1
Scenario Outline: Digilenciamiento exitoso del formulario crear cuenta

Given Ingreso al formulario
When Diligencio formulario crear cuenta "<nombre>", "<apellido>", "<email>", "<password>", "<fecha>", "<genero>"
Then Verifico el ingreso exitoso de datos "<mensaje>"

Examples:
|nombre|apellido|email|password|fecha|genero|mensaje|
|Sergio Alejandro|Alvarez Villa|sergioalvarez@outlook.com|Abc.123|2020-03-12|Hombre|Bienvenido Sergio Alejandro Alvarez Villa|


@CasoPrueba2
Scenario Outline: Validar obligatoriedad campo nombre

Given Ingreso al formulario
When Diligencio formulario crear cuenta "<nombre>", "<apellido>", "<email>", "<password>", "<fecha>", "<genero>"
Then Verifico obligatoriedad campo nombre "<error>"

Examples:
|nombre|apellido|email|password|fecha|genero|error|
||Alvarez Villa|sergioalvarez@outlook.com|Abc.123|2020-03-12|Hombre|El nombre es obligatorio|


@CasoPrueba3
Scenario Outline: Validar obligatoriedad campo apellido

Given Ingreso al formulario
When Diligencio formulario crear cuenta "<nombre>", "<apellido>", "<email>", "<password>", "<fecha>", "<genero>"
Then Verifico obligatoriedad campo apellido "<error>"

Examples:
|nombre|apellido|email|password|fecha|genero|error|
|Sergio Alejandro||sergioalvarez@outlook.com|Abc.123|2020-03-12|Hombre|El apellido es obligatorio|


@CasoPrueba4
Scenario Outline: Validar campo correo electronico

Given Ingreso al formulario
When Diligencio formulario crear cuenta "<nombre>", "<apellido>", "<email>", "<password>", "<fecha>", "<genero>"
Then Verifico campo correo electronico "<error>"

Examples:
|nombre|apellido|email|password|fecha|genero|error|
|Sergio Alejandro|Alvarez Villa|sergioalvarezoutlook.com|Abc.123|2020-03-12|Hombre|El correo electrónico no es válido|


@CasoPrueba5
Scenario Outline: Validar obligatoriedad campo contraseña

Given Ingreso al formulario
When Diligencio formulario crear cuenta "<nombre>", "<apellido>", "<email>", "<password>", "<fecha>", "<genero>"
Then Verifico obligatoriedad campo password "<error>"

Examples:
|nombre|apellido|email|password|fecha|genero|error|
|Sergio Alejandro|Alvarez Villa|sergioalvarez@outlook.com||2020-03-12|Hombre|La constraseña es obligatoria|