package chap01;

import java.util.Scanner;

public class Multi99Table {
    // 반복 안에 반복을 수행할 수 있는 이중 루프, 삼중 루프를 활용한 곱셈표를 출력

    public static void main(String[] args) {
        System.out.println("곱셈표");

        System.out.print(" |");
        for (int k = 1; k <= 9; k++) {
            System.out.printf("%3d", k);    
        }
        System.out.println();
        System.out.println("-+----------------------------");
        for (int i = 1; i <= 9; i++) {   
            System.out.print(i + "|");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }

            System.out.println();
        }


        System.out.println("덧셈표");

        System.out.print(" |");
        for (int k = 1; k <= 9; k++) {
            System.out.printf("%3d", k);    
        }
        System.out.println();
        System.out.println("-+----------------------------");
        for (int i = 1; i <= 9; i++) {   
            System.out.print(i + "|");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i + j);
            }

            System.out.println();
        }

        System.out.println("사각형을 출력합니다.");
        Scanner stdIn = new Scanner(System.in);

        System.out.print("단 수 : ");
        int i = stdIn.nextInt();

        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
