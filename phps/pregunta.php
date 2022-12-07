<?php

	include 'conexion.php';
	if(isset($_POST['pregunta'])){
    	$pregunta=$_POST['pregunta'];
    
    	$consulta="insert into pregunta values ('".id."', '".id_administrador."', '".id_cliente."','".titulo."','".pregunta."','".tipo_usuario."')";
    
    	mysqli_query($conexion,$consulta) or die (mysqli_error($conexion));
	}
	mysqli_close($conexion);
                  

?>