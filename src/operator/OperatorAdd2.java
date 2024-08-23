package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감자 예시
        int a = 1;
        int b = 0;

        b = ++a; // a를 먼저 증가시키고 b에 대입한다.
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감자 예시
        a = 1;
        b = 0;

        b = a++; // a를 먼저 b에 대입하고 a를 증가시킨다.
        System.out.println("a = " + a + ", b = " + b);

        // 단독변수를 사용하는 경우는 전위, 후위 증감자의 차이가 없다.
    }
}
