package wrapperClass_TypeCastingPersembe;

import java.util.Scanner;

public class C03_TypeCasting {

    public static void main(String[] args) {
        //kullanicidan bir karakter aliniz ve aldiginiz karakterin sayisal degerini yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        int sayi=scan.next().charAt(0);
        System.out.println(sayi);

        // char karakter=scan.next().charAt(0);
        //System.out.println((int)karakter);

    }
}
