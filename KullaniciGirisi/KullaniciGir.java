package KullaniciGirisi;
import java.util.Scanner;
public class KullaniciGir {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String userName, surname;
        System.out.print("kullanıcı adını giriniz : ");
        userName = in.nextLine();
        System.out.print("kullanıcı soyadını giriniz : ");
        surname = in.nextLine();
        if(userName.equals("Patika")&&surname.equals("kodluyoruz")){
            System.out.print("tebrikler giriş yaptınız... ");
        }else {
            System.out.print("Yanlış ad veya soyad girdiniz lütfen tekrar deneyiniz.");
        }

    }
}
