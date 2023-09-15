package dateTime01;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {

    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("m:HH d/MMMM/yy");//kucuk h yapınca pm formatinda H yapınca 24 saat
        LocalDateTime bugun=LocalDateTime.now();
        System.out.println(dtf.format(bugun));
        // LocalTime saat=LocalTime.of(15,5);
        // System.out.println(dtf.format(saat));
        ///*
        //        soru 3)
        //        bize bugunun tarihini ve su anki saati dondurun
        //        bize 3 ay 100 saat sonraki tarih ve saati dondurun
        //        bize 100 gun once 100 saat sonraki tarihi dondurun
        //        bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
        //        bize sadece bugunun tarihi dondurun
        //        LocalDateTime kullanarak yapın tum hepsini
        //         */
    }
}
