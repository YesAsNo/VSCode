package tehtava5;

import java.util.ArrayList;

public class Program {
    public static void main(String [] args){

       ArrayList<Moped> list=new ArrayList<>();

       for (int i=0; i<3; i++){
            Moped m=new Moped();                    // list.add(new Moped()); Voisi olla näinkin
            if (i==0){
                m.setEngineType("Phoenix");
                m.setEngineBrand("Solifer");
                m.setColor("Blue");
                m.setMaxSpeed(120);
                m.setPrice(1200);
            }
            if (i==1){
                m.setEngineType("PeppaSpeed");
                m.setEngineBrand("Teema");
                m.setColor("Pink");
                m.setMaxSpeed(300);
                m.setPrice(33498);
            }
            if (i==2){
                m.setEngineType("Motive");
                m.setEngineBrand("KTM");
                m.setColor("Orange");
                m.setMaxSpeed(50);
                m.setPrice(900);
            }
            list.add(m);
            System.out.println("Engine Brand = " + m.getEngineBrand() + ", Engine Type = " + m.getEngineType() + ", Color = "
            + m.getColor() + ", Max Speed = " + m.getMaxSpeed() + ", Price = " + m.getPrice() + " EUR");
       }

}
}