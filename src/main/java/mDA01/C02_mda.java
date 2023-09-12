package mDA01;

public class C02_mda {

    public static void main(String[] args) {
        /* verilen bir mad in tüm elementlerini yazdiran bir method olusturun*/

        String [][]arr={{"Selma","Aslı","Berfin","Rümeysa"},{"Ahmet","Fatih","Furkan","Halil"},{"Antalya","Angara","Mersin"}};
        elementYazdir(arr);
    }

    public static void elementYazdir(String[][] arr) {

        for (String [] w:arr) {
            for (String a:w) {
                System.out.println(a+" ");
            }
            System.out.println("\n-----------------------------");
        }
    }
}
