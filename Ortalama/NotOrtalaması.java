package Ortalama;
import java.util.Scanner;
public class NotOrtalaması {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mat, fizik, kimya ,tarih, edebiyat;
        System.out.println(" fizik ortalamanızı yazınız : ");
        fizik=in.nextDouble();
        System.out.println(" matematik ortalamanızı yazınız : ");
        mat =in.nextDouble();
        System.out.println(" kimya ortalamanızı yazınız : ");
        kimya=in.nextDouble();
        System.out.println(" tarih ortalamanızı yazınız : ");
        tarih=in.nextDouble();
        System.out.println(" edebiyat ortalamanızı yazınız : ");
        edebiyat=in.nextDouble();
        double ort=0;
        boolean anahtar = (fizik>=0)&&(fizik<=100);
        

        if(anahtar){
            ort =fizik;
        }
        if((kimya>0)&&(kimya<=100)){
            ort+=kimya;
        }
        if((mat>0)&&(mat<=100)){
            ort+=mat;
        }
        if((tarih>0)&&(tarih<=100)){
            ort+=tarih;
        }
        if((edebiyat>0)&&(edebiyat<=100)){
            ort+=edebiyat;
        }
        
        if((ort/5)>55){
            System.out.println("oratalamanız : "+ ort/5);
            System.out.println("Geçtiniz tebrikler.");
        }else {
            System.out.println("kaldınız!");
        }
    }
}
