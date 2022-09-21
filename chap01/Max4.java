package chap01;

class Max4 {
    static int max4 (int a, int b, int c, int d) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        return max;
    }
    static int min4 (int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }
    static int min4 (int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }

    // 세 값의 대소 관계의 조합은 13가지 종류가 있다.
    // 나무(tree) 형태이므로 결정 트리(decision tree)라고 한다.
    // 분기에서 조건 성립 시 윗가지, 성립하지 않을 시 아랫가지로 이동
}