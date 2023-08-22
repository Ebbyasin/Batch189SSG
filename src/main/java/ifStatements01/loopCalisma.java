package ifStatements01;

import java.util.Scanner;

public class loopCalisma {
    public static void main(String[] args) {

        double num=28.587;
        String snum=String.valueOf(num);

        System.out.println(snum);
        String yeni=snum.split("[.]")[1];
        System.out.println(yeni);
        int dpart=Integer.valueOf(yeni);


    }
}
