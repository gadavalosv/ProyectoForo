<?php
	include('conexion.php');

    $c = connectToBD();

    $query = "SELECT tipo_usuario FROM usuario WHERE correo LIKE 'g%';";

    try
    {	
        if($stmt = $c->prepare($query))
        {
            $stmt->execute();
            $stmt->bind_result($uType);

            $data = array();

            while($stmt->fetch())
            {
                $temp = [
                        'userType' => $uType
                ];

                array_push($data, $temp);
            }

            return json_encode(array('data' => $data));
        }
        else
        {
            echo "Error in the query";
        }

        $c->close();
    }
    catch(Exception $e)
    {
        return "Exception: " . $e->getMessage();
    }
?>