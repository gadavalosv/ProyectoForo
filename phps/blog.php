<?php
	include 'conexion.php';
	if(isset($_GET["idPregunta"])){
    	$pregunta=$_GET["idPregunta"];
            $consulta="select usuario.correo as nombre, pregunta.titulo, pregunta.pregunta, avg(calificacion_pregunta.calificacion) as calificacion from pregunta inner join usuario on usuario.id = pregunta.id_usuario inner join calificacion_pregunta On calificacion_pregunta.id_pregunta = pregunta.id where pregunta.id = ".$pregunta.";";
    	$result = mysqli_query($conexion, $consulta) or die (mysqli_error($conexion));
    	$results = array();
    	while($renglon = mysqli_fetch_row($result)){
            $results[] = $renglon;
        }
    	echo json_encode($results);
	}
	mysqli_close($conexion);
?>