package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class C02_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Manisa");
        sehirler.add("Izmir");
        sehirler.add("Denizli");
        sehirler.add("Giresun");
        sehirler.add("Erzurum");
        sehirler.add("Zonguldak");
        Collections.sort(sehirler);
        System.out.println(sehirler);
    }

}
