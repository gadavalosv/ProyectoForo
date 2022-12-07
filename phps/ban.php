<?php
	include 'conexion.php';
	if(isset($_GET["consulta"])){
	    $tipoConsulta = $_GET["consulta"];
	    if($tipoConsulta=="baneo"){
            $consulta="select baneo.fecha_inicio as fecha_inicio, baneo.fecha_fin as fecha_fin, usuario.correo as correo from baneo inner join usuario on usuario.id = baneo.id_usuario;";
        	$result = mysqli_query($conexion, $consulta) or die (mysqli_error($conexion));
        	$results = array();
        	while($row = mysqli_fetch_assoc($result))
            {
               $results[] = $row;
            }
            echo json_encode($results);
	    }
	    if($tipoConsulta=="todos"){
        	$consulta="select usuario.correo as correo from usuario;";
        	$result = mysqli_query($conexion, $consulta) or die (mysqli_error($conexion));
        	$results = array();
        	while($row = mysqli_fetch_assoc($result))
            {
               $results[] = $row;
            }
            echo json_encode($results);
	    }
	}
	mysqli_close($conexion);
?>