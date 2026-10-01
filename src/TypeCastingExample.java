/**
 * 자동 형변환, 명시적 형변환, 문자열 변환의 차이를 확인하는 예제입니다.
 */
public class TypeCastingExample {

    public static void main(String[] args) {
        /*
         * 표현 범위가 더 넓은 타입으로 옮길 때는 자동 형변환이 가능합니다.
         * 다만 정수를 float로 바꾸면 범위는 넓어져도 유효 자릿수 때문에
         * 큰 정수의 일부 정밀도를 잃을 수 있습니다.
         */
        long longValue = 1010L;
        float floatValue = longValue;

        System.out.println("=== 자동 형변환 ===");
        System.out.println("long 값: " + longValue);
        System.out.println("long을 float로 변환한 값: " + floatValue);

        /*
         * 표현 범위가 더 좁은 타입으로 옮길 때는 변환할 타입을 직접 적어야 합니다.
         * byte의 범위는 -128부터 127이므로 int 값 128은 byte에서 -128이 됩니다.
         * 명시적 형변환은 허용되지만 값이 보존된다는 뜻은 아닙니다.
         */
        int intValue = 128;
        byte byteValue = (byte) intValue;

        System.out.println();
        System.out.println("=== 명시적 형변환 ===");
        System.out.println("int 값: " + intValue);
        System.out.println("int를 byte로 변환한 값: " + byteValue);

        /*
         * 문자열 "12345"를 숫자로 계산하려면 Integer.parseInt를 사용합니다.
         * 숫자로 해석할 수 없는 문자열을 전달하면 NumberFormatException이 발생합니다.
         */
        int stringToIntValue = Integer.parseInt("12345");

        System.out.println();
        System.out.println("=== 문자열과 숫자 변환 ===");
        System.out.println("문자열을 int로 변환한 값: " + stringToIntValue);

        String intToStringValue = String.valueOf(intValue);
        System.out.println("int를 문자열로 변환한 값: " + intToStringValue);

        try {
            Integer.parseInt("12a");
        } catch (NumberFormatException exception) {
            System.out.println("\"12a\"는 정수로 변환할 수 없습니다.");
        }
    }
}
