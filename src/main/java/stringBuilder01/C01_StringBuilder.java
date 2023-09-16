package stringBuilder01;

public class C01_StringBuilder {

    public static void main(String[] args) {
        //soru 1) StringBuilder olusturma yontemlerine bakiniz.
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder(5);
        //System.out.println(sb.capacity());//16
        //System.out.println(sb1.capacity());//20
        //System.out.println(sb2.capacity());//5
        // sb.append("Java is easyyyyyyy");
        //System.out.println(sb);
        //System.out.println(sb.capacity());//16
        //sb1.append(" cok guzeldirrrrrrrrrrrr");
        //System.out.println(sb1);//
        //System.out.println(sb1.length());
        //System.out.println(sb1.capacity());//20
        sb2.append("Hava bugun cok soguk");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());



    }
}
