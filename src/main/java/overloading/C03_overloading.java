package overloading;

public class C03_overloading {
    C03_overloading(){
        System.out.println("ici bos olan cons");
    }

    public C03_overloading(double v, double v1) {
        System.out.println("ikiside double");
    }
    //  public C03_overLoading(int v, double v1) {
    //      System.out.println("biri double biri int");
    //  }
    // public C03_overLoading(int v, int v1) {
    //     System.out.println("ikiside int");
    // }
    String isim;
    String soyIsim;
    public C03_overloading(String isim, String soyIsim) {
        this.isim=isim;
        this.soyIsim=soyIsim;
    }

    public static void main(String[] args) {
        C03_overloading obj1=new C03_overloading();
        C03_overloading obj2=new C03_overloading(4.5,6.7);
        C03_overloading obj3=new C03_overloading(4,6);
        C03_overloading obj4=new C03_overloading(4,6.7);
        C03_overloading obj5=new C03_overloading("Ali","Can");
        System.out.println(obj5.isim);
    }
}
