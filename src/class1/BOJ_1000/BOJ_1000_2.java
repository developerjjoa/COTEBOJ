package class1.BOJ_1000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1000_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int A = Integer.parseInt(nums[0]);
        int B = Integer.parseInt(nums[1]);
        System.out.println(A + B);
    }
}
