package chap01;

import java.util.Scanner;

public class SumForPos {
    public static void main(String[] args) {
        // 1, 2, ... n의 합을 구하는데, 양수만 입력받습니다.

        Scanner stdIn = new Scanner(System.in);
        int n;

        do {
            System.out.print("n의 값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);                   // 입력받은 n의 값이 0보다 클때까지 반복
        // do문 while(제어식); : 사후 판단 반복문

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터 n까지의 합 : " + sum);
        
        // 사전 판단 반복문(for문, while문)과 사후 판단 반복문(do문)의 차이 :
        // do문은 루프 본문이 반드시 한 번은 실행된다.

        // 연습문제 1
        int a;
        int b;

        System.out.print("a의 값 : ");
        a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        b = stdIn.nextInt();
        
        while (b < a) {    
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
        }
        
        System.out.println("b - a의 값은 " + (b-a) + "입니다.");

        // 연습문제 2
        int num;
        do {
            System.out.print("자릿수를 출력할 숫자 num : ");
            num = stdIn.nextInt();
        } while (num <= 0);

        int cnt = 0;
        while (num > 0) {
            num /= 10;      // num이 0보다 클때까지만 10으로 나눔
            cnt++;          // 자릿수 카운트
        }

        System.out.println("num의 자릿수는 " + cnt + "입니다.");
    }
}
