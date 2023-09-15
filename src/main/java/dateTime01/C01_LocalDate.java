package dateTime01;

import java.time.LocalDate;

public class C01_LocalDate {

    /*-bugunun tarihini obje olusturarak yazdirin
    * bugun yilin kacinci gunu oldugunu yazdirin
    * hangi gunde oldugumuzu yazdirin
    * yilin bitmesine kac gun kaldigini yazdirin
    * bugunden itibaren 3 yil 5 ay 7 gun sonraki tarihi yazdirin
    * bugunden itibaren 2 yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu old. yazdirin
    * bugunden itibaren 7 yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu old. yazdirin*/

    public static void main(String[] args) {
        /*
        soru 1)
        -bugunun tarihini obje olusturarak yazdirin
        -bugun yilin kacinci gunu oldugunu yazdirin
        -hangi gunde oldugumuzu yazdirin
        -yılın bitmesine kac gun kaldıgını yazdırın
        -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
        -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
        -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
        -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
 */
        LocalDate bugun=LocalDate.now();
        // System.out.println(bugun);//y/a/g //2023-09-15
        // System.out.println(bugun.getDayOfYear());//258
        // System.out.println(bugun.getDayOfWeek());//FRIDAY
        // System.out.println(365- bugun.getDayOfYear());//107
        // System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7));
        // System.out.println(bugun.plusYears(2).plusMonths(2).plusDays(2));
        // System.out.println(bugun.plusYears(7).plusMonths(7).plusDays(7));
        // System.out.println(bugun.minusYears(10));
        LocalDate tarih= LocalDate.of(2022,10,14);
        // System.out.println(tarih);
        // System.out.println(tarih.isBefore(bugun));
        // System.out.println(tarih.isAfter(bugun));

        if (tarih.isBefore(bugun)){
            System.out.println(tarih);
        } else if (tarih.isAfter(bugun)) {
            System.out.println(bugun);
        }else System.out.println("iki tarih birbirine esit : "+tarih);
    }

}
