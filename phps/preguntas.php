<?php

	include 'conexion.php';
	if(isset($_GET["idRespuesta"])){
    	$respuesta=$_GET["idRespuesta"];
        if(isset($_GET["tipo"])){
            $tipo = $_GET["tipo"];
            if($tipo==0){//cliente
                $consulta="select cliente.correo as nombre, respuesta.respuesta, avg(calificacion_respuesta.calificacion) as calificacion from respuesta inner join cliente on cliente.id = respuesta.id_cliente inner join calificacion_respuesta on calificacion_respuesta.id_respuesta = respuesta.id where respuesta.id = ".$respuesta.";";
            }else{//administrador
                $consulta="select administrador.correo as nombre, respuesta.respuesta, avg(calificacion_respuesta.calificacion) as calificacion from respuesta inner join administrador on administrador.id = respuesta.id_administrador inner join calificacion_respuesta on calificacion_respuesta.id_respuesta = respuesta.id where respuesta.id = ".$respuesta.";";
            }
    
        	$result = mysqli_query($conexion, $consulta) or die (mysqli_error());
        	$results = array();
        	while($renglon = mysqli_fetch_row($result)){
                $results[] = $renglon;
            }
        	echo json_encode($results);
    	}
    	mysqli_close($conexion);
    }
?>