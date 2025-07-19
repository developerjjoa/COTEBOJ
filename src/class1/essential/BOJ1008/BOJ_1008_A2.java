package class1.essential.BOJ1008;

import java.util.Scanner;

public class BOJ_1008_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        System.out.println(A / B);
        //System.out.printf("%.9f\n", A / B); // 소수점 자릿수 조절할 때
    }
}
