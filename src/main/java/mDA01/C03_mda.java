package mDA01;

public class C03_mda {

    public static void main(String[] args) {

         /*
        soru 3) Verilen 2 katli bir multi-dimensional array'de
        outer index'i ve inner index'i ayni olan sayilarin toplamini bulunuz
        */

        int sayilar [][]={{1,3,5,7,9,11},{2,4,6,8,10},{12,13,14,15,16}};

        int toplam=0;
        for (int i = 0;  i< sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (i==j){
                    toplam+=sayilar[i][j];
                }

            }

        }
        System.out.println(toplam);
    }


}
