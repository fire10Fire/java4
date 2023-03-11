package Sıralama;

import java.util.Scanner;

import java.util.Scanner;
public class Sıra {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a,b,c;
    System.out.println("birinci sayıyı giriniz : ");
    a = in.nextInt();
    System.out.println("ikinci sayıyı giriniz : ");
    b = in.nextInt();
    System.out.println("üçüncü sayıyı giriniz : ");
    c= in.nextInt();
    if((a>b)&&(a>b)){
        if(b>c){
            System.out.println("a>b>c");
        }
        else {
            System.out.println("a>c>b");
        }
    }
    else if(b>a&&b>c){
        if(a>c){
            System.out.println("b>a>c");
        }
        else
        System.out.println("b>c>a");
    }
    else 
    if(a>b){
        System.out.println("c>a>b");
    }
    else 
    System.out.println("c>b>a");
    
    }
    
}
