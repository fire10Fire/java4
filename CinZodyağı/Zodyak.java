package CinZodyağı;

import java.util.Scanner;
public class Zodyak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz : ");
        int yıl = in.nextInt();
        switch(yıl%12){
        case 0:
        System.out.println("sizin zodyak ınız : maymun");
        break;
        case 1:
        System.out.println("sizin zodyak ınız : Horoz");
        break ;
        case 2:
        System.out.println("sizin zodyak ınız : köpek");
        break ;
        case 3:
        System.out.println("sizin zodyak ınız : domuz");
        break;
        case 4:
        System.out.println("sizin zodyak ınız : fare");
        break;
        case 5:
        System.out.println("sizin zodyak ınız : öküz");
        break;
        case 6:
        System.out.println("sizin zodyak ınız : kaplan");
        break;
        case 7:
        System.out.println("sizin zodyak ınız : tavşan");
        break;
        case 8:
        System.out.println("sizin zodyak ınız : ejderha");
        break;
        case 9:
        System.out.println("sizin zodyak ınız : yılan");
        break;
        case 10:
        System.out.println("sizin zodyak ınız : at");
        break;
        case 11:
        System.out.println("sizin zodyak ınız : koyun");
        break;
        }
    }
    
}
