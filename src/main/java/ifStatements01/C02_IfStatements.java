package ifStatements01;

import java.util.Scanner;

public class C02_IfStatements {

    public static void main(String[] args) {
        //Soru 1) Kullanicidan bir tamsayi isteyin
        //ve sayinin tek veya cift oldugunu yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= input.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cifttir");
        }
        if (sayi%2!=0){
            System.out.println("Sayi tektir");
        }
        if (sayi==0){
            System.out.println("sayi cifttir");
        }
    }
}
