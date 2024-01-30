<?php
# -- HEADER --
include '../0/header.html';

# -- TAULUKKO
# http://localhost:81/2/taulukko.php
print "- Taulukon numerot -";

$numerot["n1"]="1";
$numerot["n2"]="2";
$numerot["n3"]="3";
$numerot["n4"]="4";
$numerot["n5"]="5";

# -- TULOSTAA NUMEROT JA LASKEE SUMMAN --
$summa = 0;
foreach ($numerot as $indeksi => $alkio){
    print "<br>$indeksi: $alkio";
    $summa+= $alkio;
}
print "<br>";
echo $summa;

# -- FOOTER --
include '../0/footer.html';
?>