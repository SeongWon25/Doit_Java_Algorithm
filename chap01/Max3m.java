package chap01;

class Max3m {
    // a, b, c의 최대값을 구하여 반환합니다.
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) 
            max = b;
        if (c > max)
            max = c;
        
        return max;
    }

    public static void main(String[] args) {
        System.out.println(max3(3, 2, 1));
        // ... 등등으로 확인해볼 수 있다.
    }

    // 변수(variable) = 매개변수(parameter) & 형식매개변수(formal parameter)
    // 형식매개변수  -> 가인수(임시인수) : 메서드 정의할 때의 변수
    // 매개변수의 값 -> 실인수(actual argument) : 메서드 호출할 때의 변수

    // 알고리즘이란?
    // 문제를 해결하기 위한 것으로, 명확하게 정의되고 순서가 있는 유한 개의 규칙으로 이루어진 집합
}