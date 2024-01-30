<?php
# -- HEADER --
include '../0/header.html';

# -- VALITTU KOKONAISLUKU --
$luku = random_int(-10, 30);
print "Valittu luku on $luku<br>";

# Jos annettu arvo on pienempi kuin 0, tulostetaan ulkona on pakkasta.
if ($luku < 0) {
    print "Ulkona on pakkasta.";
}

# Jos annettu arvo on vähintään 0, mutta pienempi kuin 5, tulostetaan Ulkona on kolea sää. 
elseif ($luku >= 0 && $luku < 5) {
    print "Ulkona on kolea sää.";
}

# Jos annettu arvo on vähintään 5, mutta pienempi kuin 15, tulostetaan Ulkona on tyypillinen kesäsää. 
elseif ($luku >= 5 && $luku < 15) {
    print "Ulkona on kesäsää.";
}

# Jos annettu arvo on vähintään 15, mutta alle 20, tulostetaan ulkona on melko lämmin. 
elseif ($luku >= 15 && $luku < 20) {
    print "Ulkona on melko lämmin.";
}

#Jos annettu arvo on vähintään 20, mutta alle 25, tulostetaan ulkona on kaunis kesäilma.
elseif ($luku >= 20 && $luku < 25) {
    print "Ulkona on kaunis kesäilma";
}

else {
    print "Ulkona on helle";
}

# -- FOOTER --
include '../0/footer.html';
?>