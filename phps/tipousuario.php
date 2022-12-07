<?php
	$hostname = 'localhost';
	$database = 'id19074458_ceti_foro';
	$username = 'id19074458_foro_root';
	$password = 'Qfjqa[G36/X)c=W5';

    $c = new mysqli($hostname,$username,$password,$database);

    if($c->connect_errno){
		die("El sitio web esta experimentando problemas");
	}

    $sql = "SELECT tipo_usuario FROM usuario WHERE correo LIKE 'g%';";
    $result = $c->query($sql);

    if ($result->num_rows > 0) {
        while($row = $result->fetch_assoc()) {
          echo "user_type: " . $row["tipo_usuario"]. "<br>";
        }
    } else {
        echo "0 results";
    }
    $conn->close();
?>