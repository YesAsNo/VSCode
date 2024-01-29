<?php
set_error_handler("anyError", E_ALL);

$error="Tallennus onnistui";

$nimi=$_POST["nimi"];
$pyssy=$_POST["pyssy"];

if (!isset($nimi) || !isset($pyssy) || empty($nimi) || empty($pyssy)){
	$error="Ei sopivaa dataa";
	print $error;
	return;
}

$yhteys=mysqli_connect("127.0.0.1", "pena", "kukkuu");

if (!$yhteys){
	$error="Yhteys tietokantapalvelimeen epäonnistui";
	print $error;
	return;
}

$ok=mysqli_select_db($yhteys, "metsastaja");
if (!$ok){
	$error="Tietokannan valinta epäonnistui";
	print $error;
	return;
}
$sql="insert into metsastaja(nimi, pyssy) values(?,?)";
$stmt=mysqli_prepare($yhteys, $sql);
if (!$stmt){
	$error="SQL-lauseen valmistelu epäonnistui";
	print $error;
	return;
}
$ok=mysqli_stmt_bind_param($stmt, "ss", $nimi, $pyssy);
if (!$ok){
	$error="Tietojen liittäminen sql-lauseeseen epäonnistui";
	print $error;
	return;
}
$ok=mysqli_stmt_execute($stmt);
if (!$ok){
	$error="Tallennus epäonnistui";
	print $error;
	return;
}
print $error;
?>

<?php
function anyError($level, $message){
	print "ERROR: ".$message."<br>";
}
?> 