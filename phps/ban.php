<?php
	include 'conexion.php';
	if(isset($_GET["consulta"])){
	    $tipoConsulta = $_GET["consulta"];
	    if($tipoConsulta=="baneo"){
            $consulta="select baneo.fecha_inicio, baneo.fecha_fin, cliente.correo as nombre from baneo inner join cliente on cliente.id = baneo.id_cliente;";
        	$result = mysqli_query($conexion, $consulta) or die (mysqli_error());
        	$results = array();
        	while($renglon = mysqli_fetch_row($result)){
                $results[] = $renglon;
            }
        	echo json_encode($results);
	    }
	    if($tipoConsulta=="todos"){
        	$consulta="select cliente.correo as nombre from cliente;";
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