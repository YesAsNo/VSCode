package Harjoitukset;
import java.lang.Math;

public class Ellipsi extends Tasokuvio {

    @Override
    public double getPintaAla() {
        return super.getKorkeus()*Math.PI*super.getLeveys();
    }
}
