package class1.essential.BOJ1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1008_BA {
    public static void main(String[] args) throws IOException {
        //빠른 입력을 위한 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //한 줄을 읽고 공백 기준으로 토큰 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        System.out.println(A / B);
        //System.out.printf("%.9f\n", A / B); // 소수점 자릿수 조절할 때
    }
}
