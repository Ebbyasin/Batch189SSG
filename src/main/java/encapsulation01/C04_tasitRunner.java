package encapsulation01;

import java.util.Scanner;

public class C04_tasitRunner {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        C03_tasit tasit=new C03_tasit();
        System.out.println("lutfen tasit turunu giriniz");
        tasit.setTasitTuru(scan.nextLine());
        System.out.println("lutfen tasitin muayenesi var mi?");
        tasit.setMuayenesiVarmi(scan.nextBoolean());
        scan.nextLine();
        System.out.println("vites turu");
        tasit.setVitesTuru(scan.nextLine());
        System.out.println("kac vites");
        tasit.setKacVites(scan.nextInt());
        tasit.setCounter();
        System.out.println(tasit);
    }
}
/*nextBoolean ve nextInt bazen okumuyor veri bulamiyor bir sonrakini alıyor
* ve yanlışlık olusuyor..bunu düzeltmek icin araya scan.nextLine koymak gerekiyor*/