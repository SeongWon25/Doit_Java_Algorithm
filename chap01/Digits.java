package chap01;

import java.util.Scanner;

public class Digits {
    // 구조적 프로그래밍 (structured programming)
    // 하나의 입구와 하나의 출구를 가진 구성 요소만을 게층적으로 배치하여 프로그램을 구성하는 방법
    // 순차, 선택, 반복 - 3 종류의 제어 흐름을 사용함

    // 논리 연산과 드모르간 법칙
    // 2자리의 양수(10~99)만 입력하도록 제어
    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.print("입력 : ");
            no = stdId.nextInt();
        } while (no < 10 || no > 99); // 논리합 연산자 (||) 사용됨 *(&&)는 논리곱 연산자

        System.out.println("변수 no의 값은 " + no + "입니다.");
 
        // 논리합 연산자 중 || 는 왼쪽이 성립할 경우 오른쪽 피연산자의 평가를 수행하지 않는다.
        // => 단축 평가(short circuit evaluation)

        // 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다
        // => 드모르간 법칙(De Morgan's Laws)
        // x && y  =  !(!x || !y)
        // x || y  =  !(!x && !y)

        // 위 프로그램의 제어식 (no < 10 || no > 99)는 반복을 계속하는 '계속 조건'
        // !(no >= 10 && no <= 99)는 반복을 종료하는 '종료 조건'의 부정

    }
}
