package DaireAlani;
import java.util.Scanner;
public class Daire{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("yarıçap yazınız : ");
        int r = in.nextInt();

        double pi = 3.14;
        double alan= pi*r*r;
        double cevre= 2*pi*r;

        System.out.println("dairenin alanı :"+ alan);
        System.out.println("dairenin çevresi : "+cevre);
    }
}


