package encapsulation01;

public class C02_okulRunner {

    public static void main(String[] args) {
        C01_okul okul=new C01_okul();
        System.out.println(okul);
        okul.setOkulIsmi("Cihan Scholl");
        System.out.println(okul);
        okul.setMudur("Zihni Can");
        System.out.println(okul);
    }
}
