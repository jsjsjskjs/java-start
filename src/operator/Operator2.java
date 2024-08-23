package operator;

public class Operator2 {

    public static void main(String[] args) {

        // 문자열과 문자열 더하기 1
        String result = "Hello " + "World";
        System.out.println(result);

        // 문자열과 문자열 더하기 2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기 1
        // JAVA에서도 JavaScript처럼 문자열과 숫자를 더할 수 있다.
        String result3 = s1 + s2 + 6;
        System.out.println(result3);

        // 문자열과 숫자 더하기 2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
