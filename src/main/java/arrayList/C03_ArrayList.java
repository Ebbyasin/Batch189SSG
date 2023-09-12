package arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayList {
    public static void main(String[] args) {

        /*
        bir dogal sayi listesi olusturun
        ve olusturdugunuz listedeki tum ogeleri toplayın
         */

        List<Integer>myList=new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(9);
        myList.add(25);
        int sum=0;
        for (Integer a:myList) {
            sum+=a;

        }
        System.out.println(sum);
    }
}
