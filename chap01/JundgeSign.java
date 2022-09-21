package chap01;

import java.util.Scanner;
// 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.
// 프로그램 흐름의 분기에 대해 더 자세히 살펴봅니다.

class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int n = stdIn.nextInt();

        if (n > 0) 
            System.out.println("이 수는 양수입니다.");
        else if (n < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");
    }


    // 연산자와 피연산자
    // 연산자(operator) : +, -, >, = 등의 연산 기호
    // 피연산자(operand) : a, b, c 등 연산이 되는 대상
    // 연산자는 피연산자의 수에 따라 3종류로 분류됩니다.
    // 1. 단항 연산자(unary operator) : 피연산자 1개 - 예) a++
    // 2. 2항 연산자(binary operator) : 피연산자 2개 - 예) a > b
    // 3. 3항 연산자(ternary operator) : 피연산자 3개 - 예) a ? b : c
    // -> 조건 연산자(conditional operator) : 자바에서 유일한 3항 연산자
}