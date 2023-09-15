package dateTime01;

import java.time.LocalTime;

public class C02_LocalTime {

    //soru 2)
    //-suanin saatini dakikasini ve saniyesini bize dondurun
    //-suanin saniyesini bize dondurun
    // -10000 saniye sonrasini bize dondurun
    //-200 dakika onceki saati bize dondurun
    //-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println(saat);//10:29:51.956378900
        System.out.println(saat.getNano());//381979100 salise
        System.out.println(saat.plusSeconds(10000));
        System.out.println(saat.withHour(3)); //bu kod bulundugumuz dakika ve saniyeyi,saat 3 olacak şekilde kullanir
        System.out.println(saat.minusMinutes(200));
        System.out.println();
        LocalTime saat2=LocalTime.of(3,0);
        System.out.println(saat.withHour(3).withMinute(50));
        if (saat.withHour(3)==saat2){
            System.out.println("alarmi calistir, UYANNNNNNNNNNNNN!!!!!!!!!!!!!!");
        }
    }
}
