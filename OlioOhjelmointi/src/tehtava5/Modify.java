package tehtava5;
import java.util.Scanner;

public class Modify {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in); 
    String reply;
    int amount;

    Moped m = new Moped();
    m.setSpeed(12);
    
    for (;;){
        System.out.println("Accelerate or slow down? a/s");
        reply = sc.nextLine();

        if (reply.equals("a")){
          System.out.println("How much do you want to accelerate?");
            amount = Integer.parseInt(sc.nextLine());
            m.accelerate(amount);
        }

        if (reply.equals("s")){
          System.out.println("How much do you want to slow down?");
            amount = Integer.parseInt(sc.nextLine());
            m.slowDown(amount);
        }

        System.out.println("The speed is now " + m.getSpeed());

    }
    }
}
