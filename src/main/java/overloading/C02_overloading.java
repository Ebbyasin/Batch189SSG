package overloading;

import java.util.ArrayList;

public class C02_overloading {

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        double arr1[]={1.5,2.5,3.5,4.5};
        toplam(arr);
        toplam(arr1);
        ArrayList<Integer>myList=new ArrayList<>();
        ArrayList<Double>myList1=new ArrayList<>();
        ArrayList<String>myList2=new ArrayList<>();
        yazdir(myList2);
        //toplam(myList1);
        //toplam(myList);
    }

    private static void yazdir(ArrayList<String> myList2) {
        System.out.println(myList2);

    }

        // private static void toplam(ArrayList<Integer> myList) {
        //     int toplam=0;
        //     for (Double a:myList
        //     ) {
        //         toplam+=a;
        //     }
        //     System.out.println(toplam);
        // }

        //private static void toplam(ArrayList<Integer> myList) {
        //    int toplam=0;
        //    for (int a:myList
        //         ) {
        //        toplam+=a;
        //    }
        //    System.out.println(toplam);
        //}

    private static void toplam(int[] array) {
        int toplam=0;
        for (int a:array
        ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }


    public static void toplam(double[] array) {
        double toplam=0;
        for (double a:array
        ) {
            toplam+=a;
        }
        System.out.println(toplam);
    }
}
