package BurcunNe;
import java.util.Scanner;
public class Burcun {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("ay giriniz : ");
     int ay= in.nextInt();
     System.out.println("gün giriniz : ");
     int gun= in.nextInt();
     String burc ="";
     boolean isFailure= false;
     switch(ay){
        case 1:
        if(gun<=31&&gun>=1){
            if(gun<21){
            burc = "oğlak";
            }
             else{
            burc = "kova";
            }
        } else
        isFailure = true;
        break;
        case 2:
        if(gun<=28&&gun>=1){
            if(gun<19){
            burc = "kova";
            }
            else
            burc = "balık";
        }else
        isFailure = true;
        break;
        case 3:
        if(gun<=31&&gun>=1){
            if(gun<21){
            burc = "balık";
            }
            else
            burc = "koç";
        }else
        isFailure = true;
        break;
        case 4:
        if(gun<=30&&gun>=1){
            if(gun<21){
            burc = "koç";
            }
            else
            burc = "boğa";
        }else
        isFailure = true;
        break;
        case 5:
        if(gun<=31&&gun>=1){
            if(gun<21){
            burc = "boğa";
            }
            else
            burc = "ikizler";
        }else
        isFailure = true;
        break;
        case 6:
        if(gun<=30&&gun>=1){
            if(gun<22){
            burc = "yengeç";
            }
            else
            burc = "aslan";
        }else
        isFailure = true;
        break;
        case 7:
        if(gun<=31&&gun>=1){
            if(gun<23){
            burc = "yengeç";
            }
            else
            burc = "aslan";
        }else
        isFailure = true;
        break;
        case 8:
        if(gun<=31&&gun>=1){
            if(gun<23){
            burc = "aslan";
            }
            else
            burc = "başak";
        }else
        isFailure = true;
        break;
        case 9:
        if(gun<=30&&gun>=1){
            if(gun<23){
            burc = "başak";
            }
            else
            burc = "terazi";
        }else
        isFailure = true;
        break;
        case 10:
        if(gun<=31&&gun>=1){
            if(gun<24){
            burc = "terazi";
            }
            else
            burc = "akrep";
        }else
        isFailure = true;
        break;
        case 11:
        if(gun<=30&&gun>=1){
            if(gun<23){
            burc = "akrep";
            }
            else
            burc = "yay";
        }else
        isFailure = true;
        break;        
        case 12:
        if(gun<=31&&gun>=1){
            if(gun<22){
            burc = "yay";
            }
            else
            burc = "oğlak";
        }else
        isFailure = true;
        break;
     }   
     System.out.println("burcunuz : " + burc);
         if(isFailure){
    System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz");
         }
    }


}
