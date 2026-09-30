/**
 * 자바의 원시 타입(primitive type)과 참조 타입(reference type)을 확인하는 예제입니다.
 */
public class PrimitiveAndReferenceTypeExample {

    public static void main(String[] args) {
        /*
         * 원시 타입 변수에는 값 자체가 저장됩니다.
         * 자바에는 아래와 같이 8개의 원시 타입이 있습니다.
         */

        // 정수를 저장하는 원시 타입
        byte byteValue = 100;                 // 1바이트 정수
        short shortValue = 30000;            // 2바이트 정수
        int intValue = 2000000000;         // 4바이트 정수
        long longValue = 10000000000L;     // 8바이트 정수, 숫자 뒤에 L을 붙임

        // 실수를 저장하는 원시 타입
        float floatValue = 3.14f;             // 4바이트 실수, 숫자 뒤에 f를 붙임
        double doubleValue = 3.141592;         // 8바이트 실수

        // 문자 한 개와 참·거짓을 저장하는 원시 타입
        char charValue = 'A';                 // 문자는 작은따옴표를 사용
        boolean booleanValue = true;          // true 또는 false만 저장

        System.out.println("=== 원시 타입: 값 자체를 저장 ===");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println();

        /*
         * 참조 타입 변수에는 객체 자체가 들어가는 것이 아니라,
         * 만들어진 객체를 찾아갈 수 있는 참조값이 저장됩니다.
         * 입문 단계에서는 이 참조값을 흔히 "주소값"이라고 표현합니다.
         *
         * 여기서는 아직 다른 클래스를 사용하지 않고 Object만 사용합니다.
         * new Object()는 새로운 Object 객체를 만드는 코드입니다.
         */
        Object objectValue = new Object();

        System.out.println("=== 참조 타입: 객체를 가리키는 참조값을 저장 ===");
        System.out.println("Object: " + objectValue);

        /*
         * Object를 출력하면 java.lang.Object@... 형태의 문자열이 보입니다.
         * 이 문자열은 객체의 실제 메모리 주소를 직접 보여주는 값은 아닙니다.
         * 지금은 objectValue가 만들어진 Object 객체를 가리킨다는 점만 기억합니다.
         */
    }
}
