package doWhileLoop;

public class C03_doWhileLoop {

    public static void main(String[] args) {
        //Bir tamsayinin tam bolenlerini ve tam bolenlerinin toplamini bulun
        int sayi=35;
        int toplam=0;
        int bolen=1;

        do {
            if (sayi%bolen==0){
                System.out.println(sayi+" sayisi "+bolen+" sayisina tam bolunebiliyor");
                toplam+=bolen;
            }
            bolen++;

        }while (bolen<=sayi);
        System.out.println("bolenlerin toplami : "+toplam);
    }

}
