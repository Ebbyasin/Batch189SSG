package switch02;

import java.util.Scanner;

public class C04_Switch {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 35-50 arasinda bir ayakkabi numarasi giriniz");
        int ayakkabiNo=scan.nextInt();

        switch (ayakkabiNo){
            case 35:
            case 36:
            case 37:
            case 38:
                System.out.println("small");
                break;
            case 39:
                case 40:
                    case 41:
                        case 42:
                System.out.println("medium");
                break;
            case 43:
                case 44:
                    case 45:
                        case 46:
                System.out.println("large");
                break;
            case 47:
                case 48:
                    case 49:
                        case 50:
                System.out.println("extra large");
                break;
            default:
                System.out.println("lutfen gecerli bir ayakkabi no'su giriniz");

        }
    }
}
