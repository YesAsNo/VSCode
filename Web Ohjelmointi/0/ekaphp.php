<?php
# -- HEADER --
include 'header.html';

  print "Hello PHP!";

# -- LOMAKE --
include 'lomake.html';
$nimi1=$_GET["nimi1"];
$nimi2=$_GET["nimi2"];

if ($nimi1){
    print "Etunimi= $nimi1<br>";
}
if ($nimi2){
    print "Sukunimi= $nimi2<br>";
}

# -- FOOTER --
include 'footer.html';
?>
