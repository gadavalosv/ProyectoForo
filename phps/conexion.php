<?php
	$hostname='localhost';
	$database='id19074458_ceti_foro';
	$username='id19074458_foro_root';
	$password='wc9qc{E1q6-Ooixa';

	$conexion=new mysqli($hostname,$username,$password,$database);
	if($conexion->connect_errno){
	echo "El sitio web esta experimentando problemas";
}