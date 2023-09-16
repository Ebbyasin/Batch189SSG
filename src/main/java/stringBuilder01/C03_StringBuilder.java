package stringBuilder01;

public class C03_StringBuilder {

    public static void main(String[] args) {

            String str = "Java";
            String str1 = "Java";
            StringBuilder sb = new StringBuilder("Java");
            StringBuilder sb1 = new StringBuilder("J!va");
            //  System.out.println(sb.equals(sb1));//== gibi calisir
            //  System.out.println(str.equals(sb.toString()));
            System.out.println(sb1.compareTo(sb));//eger degerler birbirine esit ise 0 verir


        /*
		compareTo() iki stringBuilder'i bastan baslayarak harf harf karsilastirir
        ilk harf ayni ise, ikincisine gecer
        ikinciler ayni ise 3.lere gecer ve ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir
		cikti 0 ise iki stringBuilder ayni degerlere sahiptir
        */

        }
    }

