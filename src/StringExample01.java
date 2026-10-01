/**
 * 문자열 리터럴과 new String으로 만든 객체를 ==와 equals로 비교하는 예제입니다.
 */
public class StringExample01 {

    public static void main(String[] args) {
        /*
         * 같은 문자열 리터럴은 문자열 풀(String Pool)에 있는 객체를 공유합니다.
         * 따라서 firstLiteral과 secondLiteral은 같은 객체를 가리킵니다.
         */
        String firstLiteral = "Kim Lucky";
        String secondLiteral = "Kim Lucky";

        /*
         * new String(...)을 호출할 때마다 내용이 같아도 새로운 String 객체가 만들어집니다.
         */
        String firstNewString = new String("Kim Lucky");
        String secondNewString = new String("Kim Lucky");

        System.out.println("=== == 비교: 같은 객체를 가리키는가? ===");
        System.out.println("리터럴과 리터럴: " + (firstLiteral == "Kim Lucky"));       // true
        System.out.println("두 리터럴 변수: " + (firstLiteral == secondLiteral));       // true
        System.out.println("리터럴과 new 객체: " + (firstLiteral == firstNewString));   // false
        System.out.println("두 new 객체: " + (firstNewString == secondNewString));      // false

        /*
         * equals는 객체가 서로 달라도 문자열의 실제 내용이 같은지 비교합니다.
         * 문자열의 내용을 비교할 때는 ==가 아니라 equals를 사용해야 합니다.
         */
        System.out.println();
        System.out.println("=== equals 비교: 문자열 내용이 같은가? ===");
        System.out.println("리터럴과 new 객체: " + firstLiteral.equals(firstNewString));
        System.out.println("두 new 객체: " + firstNewString.equals(secondNewString));

        /*
         * equals는 대소문자를 구분하고 equalsIgnoreCase는 대소문자를 무시합니다.
         */
        String lowercaseFirstName = "kim Lucky";
        String lowercaseLastName = "Kim lucky";

        System.out.println();
        System.out.println("=== 대소문자 비교 ===");
        System.out.println("equals 결과: "
                + lowercaseFirstName.equals(lowercaseLastName));             // false
        System.out.println("equalsIgnoreCase 결과: "
                + lowercaseFirstName.equalsIgnoreCase(lowercaseLastName));   // true

        /*
         * null일 가능성이 있는 변수에서 equals를 호출하면 NullPointerException이 발생합니다.
         * 확실히 null이 아닌 문자열 리터럴을 앞에 두면 안전하게 비교할 수 있습니다.
         */
        String nullableName = null;
        System.out.println("null과 안전하게 비교: " + "Kim Lucky".equals(nullableName));
    }
}
