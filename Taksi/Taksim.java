package Taksi;
import java.util.Scanner;
public class Taksim {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("lütfen gidilen mesafeyi bilirtiniz(km) ");
        double km = in.nextDouble();
        double ucret = km*(2.20);
        double ucretİki=ucret+10;
        double ucretUc= ucretİki>20?ucretİki:20;
        System.out.println("ödemeniz gereken ücret : "+ ucretUc);
        System.out.println("merhaba ben master");
    }
    
}
