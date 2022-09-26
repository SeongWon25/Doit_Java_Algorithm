package chap01;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdId.nextInt();

        int sum = 0;        // 합
        int i = 1;

        while (i <= n) {    // i가 n이 될때까지 반복합니다.
            sum += i;       // sum에 i를 계속 더합니다.
            i++;            // i값을 1만큼 증가시킵니다.
            System.out.println("증가한 i의 값 : " + i);
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

        // 반복 구조(repetation) : 루프(loop)라고 불리며 조건이 성립되는 동안 반복하여 실행
        // while문 : 실행 전에 반복을 계속할지를 판단하기 때문에 '사전 판단 반복 구조'
    }
}
