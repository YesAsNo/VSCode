<?php
# -- HEADER --
include '../0/header.html';

# -- TAULUKKO --
# http://localhost:81/2/loop.php

$nimet["0"]="Kalle";
$nimet["1"]="Kaljami";
$nimet["2"]="Pelle";
$nimet["3"]="Peljami";
$nimet["4"]="Viljami";
$nimet["5"]= "Ville";

# -- TULOSTAA FOR LOOPILLA --
print "- FOR Taulukko -<br>";
for ($i=0;$i<count($nimet);$i++){
    print $nimet[$i]."<br>";
}
print "<br>";

# -- TULOSTAA WHILE LOOPILLA --
print "- WHILE Taulukko -<br>";
$i=0;
while ($i<count($nimet)){
    print $nimet[$i]."<br>";
    $i++;
}
print "<br>";

# -- TULOSTAA DO-WHILE LOOPILLA --
print "- DO-WHILE Taulukko -<br>";
$i=0;
do{
    print $nimet[$i]."<br>";
    $i++;
}while ($i<count($nimet));
print "<br>";

# -- TAULUKKO 2 --
$nimet2["1"]="Kalle";
$nimet2["2"]="Kaljami";
$nimet2["3"]="Pelle";
$nimet2["4"]="Peljami";
$nimet2["5"]="Viljami";
$nimet2["6"]= "Ville";

# -- TULOSTAA FOREACH LOOPILLA --
print "- FOREACH Taulukko -<br>";
foreach ($nimet2 as $nimi){
    print $nimi."<br>";
}  
print "<br>";

# -- TULOSTAA INDEKSIN FOREACH LOOPILLA --
print "- FOREACH INDEKSI Taulukko -<br>";
foreach ($nimet2 as $key => $nimi){
    print $key.": ".$nimi."<br>";
} 
print "<br>";

# -- FOOTER --
include '../0/footer.html';
?>