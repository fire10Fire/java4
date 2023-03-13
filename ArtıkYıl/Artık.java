package ArtıkYıl;
import java.util.Scanner;
public class Artık {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("yıl belirtiniz : ");
        int yıl = in.nextInt();
        if(yıl>400){
            if((yıl%400)==0){
                System.out.println("Artık yıl ! ");
            }
            else 
            System.out.println("artık yıl değil !");
        }
        else {
            if((yıl%4)==0){
                System.out.println("Artık yıl ! ");
            }
            else
            System.out.println("artık yıl değil !");
        }
       
}
}
