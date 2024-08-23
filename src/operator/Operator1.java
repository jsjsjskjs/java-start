package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // int 형 변수끼리 나누면 결과도 int 형으로 나온다. (소수점 이하 버림)
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
        // 나머지 연산자는 실무나 알고리즘 모두 종종 사용된다

        // 주의사항!! 0으로 나누기는 불가능하다.
        // int zeroDiv = a / 0;
        // System.out.println("a / 0 = " + zeroDiv); // 컴파일 에러 발생!!
    }
}
