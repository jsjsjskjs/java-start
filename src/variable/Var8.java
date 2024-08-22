package variable;

public class Var8 {

    public static void main(String[] args) {
        // 정수에 대한 타입
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)

        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (약 90경)
        // 숫자 뒤에 L을 붙여서 long 타입임을 명시해야 한다
        // 대문자로 써도 되고 소문자로 써도 된다
        // 하지만 소문자 l은 숫자 1과 비슷해서 혼동이 올 수 있으므로 대문자 L을 사용하는 것이 좋다)
        long l = 2147483648L;

        // 실수에 대한 타입
        float f = 3.14f; // 4byte, 2의 32승까지 표현 가능
        double d = 3.14; // 8byte, 2의 64승까지 표현 가능, 소수점은 기본으로 double을 사용

        // 기타
        boolean bool = true; // 1byte
        char c = 'A'; // 문자 하나 1byte
        String str = "Hello"; // 메모리 사용량은 문자 길이에 따라 동적으로 달라진다

        // 하지만 실무에서 사용하는 변수의 타입은 int, double, boolean, String이 대부분이다
    }
}
