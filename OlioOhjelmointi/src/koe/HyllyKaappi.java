package koe;

    public class HyllyKaappi extends Kaappi {
        private int hyllyMaara;
        public int getHyllyMaara() {
            return hyllyMaara;
        }
        public void setHyllyMaara(int hyllyMaara) {
            this.hyllyMaara = hyllyMaara;
        }

        public int getHyllyPintaAla(){
            int hyllyPintaAla = hyllyMaara*getLeveys()*getSyvyys();
            return hyllyPintaAla;
        }
    
}
