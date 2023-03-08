package kitleEndeksi;
import java.util.Scanner;
public class KitleEndeksi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("kilonuzu belirtiniz :");
        int kilo = in.nextInt();
        double boy, endeks ;
        System.out.println("boyunuzu belirtiniz(metre) : ");
        boy = in.nextDouble();
        endeks = kilo/(boy*boy);
        System.out.println("vücut kitle endeksiniz :" + endeks);
        String a,b,c,d, endeks2; 
        a = "obez"; b= "obez değil";

        endeks2 = endeks > 40 ?a:b;
        System.out.println(endeks2);
    
    
    
    

    }
}
