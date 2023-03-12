package UçakBiletim;
import java.util.Scanner;
public class UcakBiletim {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int yas, mesafe, tip;
    boolean tip2= false;
    
    System.out.println("yaşınız : ");
    yas = in.nextInt();
    System.out.print("gideceğiniz mesafe : ");
    mesafe= in.nextInt();
    System.out.println("1-)Gidiş \n2-)Gidiş-Dönüş");
    tip = in.nextInt();
    
    double ucret= 0.10*mesafe;

    if(tip ==1 || tip ==2){
    tip2=true;
    }

if(tip2){
    if(yas<12){
        ucret= ucret-(ucret*1/2);
    }  
    else if(yas<24){
        ucret = ucret-(ucret*1/10);
    }
    else if(yas>65){
        ucret= ucret-(ucret*3/10);
    }
    if(tip==2){
        ucret=ucret-(ucret*2/10);
    }
    System.out.println("lütfen ödeme yapınız : "+ucret);
}else {
System.out.println("yanlış seçim yaptınız!");
}
}
}
