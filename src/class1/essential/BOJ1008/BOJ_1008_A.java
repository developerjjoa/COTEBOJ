package class1.essential.BOJ1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1008_A {
    public static void main(String[] args) throws IOException {
        //빠른 입력을 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        double A = Double.parseDouble(split[0]);
        double B = Double.parseDouble(split[1]);

        System.out.println(A / B);
        //System.out.printf("%.9f\n", A / B); // 소수점 자릿수 조절할 때
    }
}
