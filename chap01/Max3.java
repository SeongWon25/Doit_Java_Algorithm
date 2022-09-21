package chap01;

import java.util.Scanner;

// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // System.in : 키보드와 연결된 표준 입력 스트림(standard input stream)

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();
        // 키보드로 입력한 정숫값을 변수에 저장하는 과정 : 
        // 1. int 범위인 -2,147,483,647 ~ 2,147,483,647 내로 입력 가능
        // 2. stdIn은 키보드와 연결된 표준 입력 스트림(System.in)에서 문자나 숫자를 꺼내는 장치 역할 

        stdIn.close();
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        // 순차적(concatenation) 구조 : 여러 문장(프로세스)가 순차적으로 실행되는 구조
        // () 안에 있는 식의 평가 결과에 따라 프로그램의 실행 흐름을 변경하는 if문 = 선택(selection) 구조
        // 프로그램 흐름의 분기를 쌍기(양갈래)선택이라고 한다.

        System.out.println("최댓값은 " + max + "입니다.");
    }
}