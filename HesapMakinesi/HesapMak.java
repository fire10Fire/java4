package HesapMakinesi;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class HesapMak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.print("birinci sayıyı yazınız : ");
        a = in.nextInt();
        System.out.print("İkinci sayıyı yazınız : ");
        b= in.nextInt();
        System.out.println("1-toplama \n2-çıkarma \n3-çarpma\n4-bölme");
        System.out.print("seçiminiz : ");
        int c = in.nextInt();
        if(c==1){
            System.out.println("toplama : "+ (a+b));

        }else if(c==2){
            System.out.println("çıkarma : "+(a-b));
        }else if(c==3){
            System.out.println("çarpma : "+(a*b));
        }else if(c==4){
            System.out.println("bölme : "+(a/b));
        }else 
        System.out.println(" yanlış seçim yaptınız! ");

    }
}
