package overloading;

import java.util.Date;

public class C01_overloading {

    public static void main(String[] args) {
        carpim(5.6,6.5);
        carpim(5.6,6);
        carpim(5,6);
        carpim(5,6.9);
        carpim(5,6.9,5);
        carpim("4","5");
        //autowiding en uygun olan methodu ya da cons'u secmesine deriz


    }

    private static void carpim(String s, String s1) {
        System.out.println(Integer.valueOf(s) * Integer.valueOf(s1));
    }

    private static void carpim(int i, double v, int i1) {
        System.out.println(i*v*i1);
    }

    public static void carpim(double v, double v1) {
        System.out.println(v*v1);
    }
    //  public static void carpim(double v, int v1) {
    //       System.out.println(v*v1);
    //  }
    // public static void carpim(int v, int v1) {
    //     System.out.println(v*v1);
    //  }
    //  public static void carpim(int v, double v1) {
    //      System.out.println(v*v1);
    // }
}
