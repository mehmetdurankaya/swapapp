package swapapp;

import java.util.Scanner;

public class VariableSwapBot {
    public static void main(String[] args) {
        //Konunun tek sayfada kodlar alt alta çalıştığında nasıl yapılacağı ile ilgili
        // bir fikir vermesi amacıyla hazırlanmıştır.
        Scanner scan =new Scanner(System.in);
        int sayi1,sayi2;//variables declarations
        System.out.print("Lütfen birinci sayıyı giriniz : ");
        sayi1=scan.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz  : ");
        sayi2=scan.nextInt();
       //1.yol
        System.out.println("============1.Yol=============");
        int sayi3=sayi1;//üçüncü bir variable oluşturup daha önce tanımladığım variable atama yapılıyor
        sayi1=sayi2;//Aralarında birbirlerine değerlerinin atanması sağlanıyor
        sayi2=sayi3;//Değerlerini değiştirmiş oluyoruz.Bu işleme SWAP işlemi deniyor.
        System.out.print("üçüncü bir variable oluşturuluyor\n" +
                "ve birinci sayı oluşturulan variableye atama yapılıyor ");
        System.out.println("Sayi 3: " + sayi3);
        System.out.println("Swap işlemi gerçekleşiyor!");
        System.out.println("Sayi 1: " + sayi1);
        System.out.println("Sayi 2: " + sayi2);
        //2.Yol
        System.out.println("===============2.Yol============");
        sayi1=sayi1+sayi2;//Değişkenlerin değerleri toplama işlemi yapılıp aralarındaki bir değişkene atama işlemi yapılıyor
        System.out.println("Swap işlemi gerçekleşiyor!");
        System.out.print("sayi2 : ");
        System.out.println(sayi2=sayi1-sayi2);//Aralarında çıkarma işlemi yapıldığında otomatik olarak karşı tarafa kendi değerini gönderir
                System.out.print("sayi1 : ");
        System.out.println(sayi1=sayi1-sayi2);//SWAP

    }
}
