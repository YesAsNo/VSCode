package koe;

    public class kartio {

        private int sade;
        private int korkeus;
    
        public int getSade() {
            return sade;
        }
        public void setSade(int sade) {
            this.sade = sade;
        }
        
            public int getKorkeus() {
            return korkeus;
        }
        public void setKorkeus(int korkeus) {
            this.korkeus = korkeus;
        }
        
        public int getTilavuus(){
           int tilavuus = (int)(Math.PI*sade*sade*korkeus/3);
           if (tilavuus < 0) {
            tilavuus = -1;
            return tilavuus;
            }
        
            else {
            return tilavuus;
        }
    }
}
