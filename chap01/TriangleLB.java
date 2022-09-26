package chap01;

import java.util.Scanner;

public class TriangleLB {
    // 왼쪽 아래가 직각인 이등면 삼각형을 출력합니다.
    // 변수 n의 값은 양수로 제한

    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);
        int n;

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdId.nextInt();
        } while (n <= 0);

        System.out.println("왼쪽 아래");
        triangleLB(n);
        System.out.println("왼쪽 위");
        triangleLU(n);
        System.out.println("오른쪽 아래");
        triangleRB(n);
        System.out.println("오른쪽 위");
        triangleRU(n);

        System.out.println("피라미드");
        spira(n);
    }

    public static void triangleLB (int n) { // 왼쪽 아래가 직각
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleLU (int n) { // 왼쪽 위가 직각
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleRB (int n) { // 오른쪽 아래가 직각
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void triangleRU (int n) { // 오른쪽 위가 직각
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void spira (int n) { // n단 피라미드
        for (int i = 0; i <= (n/2+1); i++) {
            for (int k = i; k <= n/2; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1 ; j++) {
                System.out.print(i+14);
            }
            for (int z = 1; z < i+1 ; z++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
