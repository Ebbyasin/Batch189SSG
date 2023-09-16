package stringBuilder01;

public class C02_StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Ali");
        System.out.println(sb);
        sb.append(" topu at.");
        System.out.println(sb);

        sb.insert(9,"camdan ");
        sb.replace(0,3,"Veli");
        System.out.println(sb);
        String str="Bana atar misin";
        sb.insert(sb.length()-1,str,7,str.length());
        System.out.println(sb);
    }
}
