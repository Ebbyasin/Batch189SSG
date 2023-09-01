package whileLoop01;

import java.util.Random;
import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner scan=new Scanner(System.in);
        int tahminSayisi=5;
        int kullaniciSayi=-1; //dongunun icine girebilmesi icin bir deger verilmek zorunda,o degerde random
                              //classinin secebilecegi sayilar arasinda olmamasi lazim,o yüzden -1 sectik
                              // do while kullandiginda sadece variable olusturmamiz yeterli,cunkü dongu her
                              // türlü baslayacak nasilsa.
        while (kullaniciSayi!=sayi){
            System.out.println("lutfen tahminde bulunmak icin 1-100 arasinda bir sayi giriniz");
            kullaniciSayi= scan.nextInt();
            if (kullaniciSayi>=1&&kullaniciSayi<=100){
                if (kullaniciSayi<sayi){
                    System.out.println("sayiyi buyult");
                } else if (kullaniciSayi>sayi) {
                    System.out.println("sayiyi kucult");
                }
            }else System.out.println("ben sana 1-100 arasinda bir sayi gir dedim!!!");
            tahminSayisi++;
        }
        System.out.println("bilgisayarin tuttugu sayiyi : "+tahminSayisi+". tahminde buldunuz sayi : "+sayi);
    }
}
