package koe;
import java.util.Scanner;
public class nopeusT{
    private int nopeus;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nopeus;
        nopeus = 2;

        for (;;){
           System.out.println("Anna muutos");
            int muutos = sc.nextInt();
        if (muutos > 0) {
            nopeus = nopeus + muutos;
            if (nopeus >= 45) {
                nopeus = 45;
            }
            System.out.println(nopeus);
        }
        
        if (muutos == 0) {
            System.out.println(nopeus);
        }
        
        if (muutos < 0) {
            nopeus = nopeus + muutos;
            if (nopeus <= 0) {
                nopeus = 0;
            }
            System.out.println(nopeus);
        }

    }
}
}