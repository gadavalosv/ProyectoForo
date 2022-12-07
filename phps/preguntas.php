<?php

	include 'conexion.php';
	if(isset($_GET["idPregunta"])){
    	$pregunta=$_GET["idPregunta"];
        $consulta="select usuario.correo as nombre, respuesta.respuesta, avg(calificacion_respuesta.calificacion) as calificacion from respuesta inner join usuario on usuario.id = respuesta.id_usuario inner join calificacion_respuesta on calificacion_respuesta.id_respuesta = respuesta.id where respuesta.id in (select respuesta.id from respuesta where respuesta.id = ".$pregunta.");";

    	$result = mysqli_query($conexion, $consulta) or die (mysqli_error($conexion));
    	$results = array();
    	/*while($renglon = mysqli_fetch_row($result)){
            $results[] = $renglon;
        }
    	echo json_encode($results);*/
    	while($row = mysqli_fetch_assoc($result))
        {
           $results[] = $row;
        }
        echo json_encode($results);
    	mysqli_close($conexion);
    }
?>