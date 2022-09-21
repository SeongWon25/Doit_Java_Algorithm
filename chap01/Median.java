package chap01;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력

class Median {
    static int med3(int a, int b, int c) {
        if (a >= b)
            if (b >= c)
                return b;
            else if (a <= c)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값 :");
        int a = stdIn.nextInt();
        // ... 등등으로 값을 입력받아 med3을 호출하면 끝
        // 세 값의 중앙값을 구하는 과정은 '퀵 정렬(quick sort)' 6장에서도 사용한다.
    }

    // 중앙값을 구하는 메서드는 다음과 같이 작성할 수 있다. 하지만 실습 1C-1의 med3 메서드에 비해 효울이 떨어지는데, 이유는?

    static int med4 (int a, int b, int c) {
        if ((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }

    // 비교를 한번에 여러개 진행해야해서? b = a / c = a 비교를 중복되게 해야해서..?
}