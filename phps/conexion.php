<?PHP

$hostname = 'localhost';
$database = 'id19074458_ceti_foro';
$username = 'id19074458_foro_root';
$password = 'Qfjqa[G36/X)c=W5';

$conexion = new mysqli($hostname,$username,$password,$database);

if($conexion->connect_errno){
	die("El sitio web esta experimentando problemas");
}

?>