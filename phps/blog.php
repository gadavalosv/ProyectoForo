<?php
	include 'conexion.php';
	if(isset($_GET["idPregunta"])){
    	$pregunta=$_GET["idPregunta"];
        if(isset($_GET["tipo"])){
            $tipo = $_GET["tipo"];
            if($tipo==0){//cliente
                $consulta="select cliente.correo as nombre, pregunta.titulo, pregunta.pregunta, avg(calificacion_pregunta.calificacion) as calificacion from pregunta inner join cliente on cliente.id = pregunta.id_cliente inner join calificacion_pregunta On calificacion_pregunta.id_pregunta = pregunta.id where pregunta.id = ".$pregunta.";";
            }else{//administrador
                $consulta="select administrador.correo as nombre, pregunta.titulo, pregunta.pregunta, avg(calificacion_pregunta.calificacion) as calificacion from pregunta inner join administrador on administrador.id = pregunta.id_administrador inner join calificacion_pregunta On calificacion_pregunta.id_pregunta = pregunta.id where pregunta.id = ".$pregunta.";";
            }
        
        	$result = mysqli_query($conexion, $consulta) or die (mysqli_error());
        	$results = array();
        	while($renglon = mysqli_fetch_row($result)){
                $results[] = $renglon;
            }
        	echo json_encode($results);
        }
	}
	mysqli_close($conexion);
?>