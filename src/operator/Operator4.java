package operator;

public class Operator4 {

    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println(sum3);
        System.out.println(sum4);
        // 결과는 같지만 유지보수를 위해서 우선순위가 있는 경우는 괄호를 사용하는 것이 좋다.
    }
}
