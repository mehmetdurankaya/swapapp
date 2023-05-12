package swapapp;

import java.util.Scanner;

public class VariableSwapApp {
    public static void main(String[] args) {
      VariableSwapClass swapClass=new VariableSwapClass();
      Scanner scan=new Scanner(System.in);
        int n1,n2;
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        n1=scan.nextInt();
        System.out.println("Birinci Sayı Değeriniz : " + n1);
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        n2=scan.nextInt();
        System.out.println("İkinci Sayı Değeriniz :" + n2);

        System.out.println("============1.Yol====Classtan çağrılan method=========");
        swapClass.swapBirinciYol(n1,n2);
        System.out.println("============2.Yol=====Classtan çağrılan method========");
        swapClass.swapIkinciYol(n1,n2);
      System.out.println("================@autor Mehmet Duran Kaya====================");
    }
}
