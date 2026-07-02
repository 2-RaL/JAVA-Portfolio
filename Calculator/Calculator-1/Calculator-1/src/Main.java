//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a-nı daxil edin: ");
        double a = input.nextDouble();
        System.out.print("b-ni daxil edin: ");
        double b = input.nextDouble();
        System.out.print("c-ni daxil edin: ");
        double c = input.nextDouble();
        System.out.println("Əməliyyat funksiyaları: No:1 +, No:2 -, No:3 *, No:4 / ");
        System.out.print("Hansı əməliyyatı seçirsiniz? (1/2/3/4): ");
        int operation = input.nextInt();
        double result = 0.0;
        switch (operation) {
            case 1:
                result = a + b + c;
                System.out.println("Cavab: " + result);
                break;
            case 2:
                result = a - b - c;
                System.out.println("Cavab: " + result);
                break;
            case 3:
                result = a * b * c;
                System.out.println("Cavab: " + result);
                break;
            case 4:
                if (b != 0.0 && c != 0.0) {
                    result = a / b / c;
                    System.out.println("Cavab: " + result);
                } else {
                    System.out.println("Sıfıra bölmə mümkün deyil.");
                }
                break;
            default:
                System.out.println("Yanlış seçim etdiniz.");
        }

        input.close();
    }
}
