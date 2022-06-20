<? php

	include 'conexion.php'
	$pregunta=$_POST['pregunta'];

	$consulta="insert into pregunta values ( '".titulo."','".pregunta."')";

	mysqli_query($conexion,$consulta) or die (mysqli_error());
	mysqli_close($conexion);
                  

?>