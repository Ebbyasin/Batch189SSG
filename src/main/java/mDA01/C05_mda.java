package mDA01;

import java.util.Arrays;

public class C05_mda {
    public static void main(String[] args) {

        /*
        soru 6) bir multi-dimensional array olusturun ve
        outer indexlerin inner indexlerini tek tek kontrol edip
        en buyuk degerlerini yazdırın
         */
        int sayilar[][]={{57,8,37},{99,88,11},{32,34,15,12},{2,3,5,1}};
        /*
        for (int[]a:sayilar) {

            Arrays.sort(a);

            System.out.println(a[a.length-1]);
        }

         */
        int maxi=0;
        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                maxi=Math.max(sayilar[i][j],maxi);

            }
            System.out.println(maxi);
            maxi=0;
        }



    }

    //Math classindan max methodunu kullanarak fori ile tek tek kontrol edip yapan islemi yapınız

        /*
            Soru 5) Asagidaki multi dimensional array'in
            ic array'lerindeki son elemanlarin carpimini ekrana yazdiran
            bir program yaziniz {{1,2,3}, {4,5}, {6}}
            */

     /*
        soru 7) Verilen bir multi dimensional array'in
        inner indexindeki elementlerinin ortalamasından
        büyük elementleri yazdıran bir kod yazınız.
         */

}
