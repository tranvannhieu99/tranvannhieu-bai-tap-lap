package BaiTap_Lab2;

import java.util.Scanner;

public class Bai1Lab2 {
     public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình giải phương trình bậc 1");
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        } else if (b == 0) System.out.println("x = 0");
        else {
            double x = -b / a;
            System.out.printf("Có 1 nghiệm x = %.2f", x);
        }
        scanner.close();
    }

}
