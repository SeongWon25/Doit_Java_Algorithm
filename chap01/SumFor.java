package chap01;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("1부터 n까지의 합을 위한 n의 값 :");
        int n = stdIn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 n까지의 합 : " + sum);
    }
}
