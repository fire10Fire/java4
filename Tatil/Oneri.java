package Tatil;
import java.util.Scanner;

public class Oneri {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    System.out.println("Hava sıcaklığını giriniz.");
    int H = in.nextInt();

    if(H<=5){
        System.out.println("kayak yapabilirsin.");
    }
        else if(H<=25){
            if(H<=15){
                System.out.println("sinemaya gidebilirsiniz");
            }
            if(H>=10){
                System.out.println("pikniğe gidebilirsin");
            }
        }
    
        else{
        System.out.println("yüzmeye gidebilirsin");
}
}
}