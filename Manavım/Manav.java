package Manavım;
import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ar , el,dom,muz,pat;
        System.out.print("kaç kilo armut : ");
        ar = in.nextDouble();
        System.out.print("kaç kilo domates : ");
        dom=in.nextDouble();
        System.out.print("kaç kilo patlıcan : ");
        pat=in.nextDouble();
        System.out.print("kaç kilo elma : ");
        el =in.nextDouble();
        System.out.print("kaç kilo muz : ");
        muz =in.nextDouble();
        double armut = ar*2.14;
        double domates= dom*1.11;
        double elma= el*3.67;
        double patlıcan= pat*5;
        double muzu = muz*0.95;
        double toplamTutar = armut+domates+elma+patlıcan+muzu;
        System.out.println("Toplam tutar : "+toplamTutar);

    }
}
