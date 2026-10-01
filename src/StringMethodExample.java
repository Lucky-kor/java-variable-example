/**
 * String에서 자주 사용하는 메서드와 문자열의 불변성을 확인하는 예제입니다.
 */
public class StringMethodExample {

    public static void main(String[] args) {
        /* length()는 문자열에 들어 있는 문자의 개수를 반환합니다. */
        String frameworkName = "javaspringframework";
        int stringLength = frameworkName.length();

        System.out.println("=== length ===");
        System.out.println("문자열 길이: " + stringLength);

        /*
         * charAt(index)는 지정한 위치의 문자를 반환합니다.
         * 인덱스는 0부터 시작하므로 첫 번째 문자의 인덱스는 0입니다.
         */
        String languageAndFramework = "JavaSpring";
        char firstCharacter = languageAndFramework.charAt(0);

        System.out.println();
        System.out.println("=== charAt ===");
        System.out.println("인덱스 0의 문자: " + firstCharacter);

        /* trim()은 문자열 앞뒤의 공백을 제거한 새로운 문자열을 반환합니다. */
        String paddedText = "   JavaSpring   ";
        String trimmedText = paddedText.trim();

        System.out.println();
        System.out.println("=== trim ===");
        System.out.println("공백 제거 전: [" + paddedText + "]");
        System.out.println("공백 제거 후: [" + trimmedText + "]");

        /*
         * compareTo는 앞에서부터 문자를 비교합니다.
         * 처음 다른 문자의 UTF-16 값 차이를 반환하며, 공통 부분이 모두 같으면 길이 차이를 반환합니다.
         * 실제 코드에서는 정확한 반환값보다 음수, 0, 양수 중 무엇인지가 중요합니다.
         */
        String comparisonTarget = "bcde";

        System.out.println();
        System.out.println("=== compareTo ===");
        System.out.println("bcde와 비교: " + comparisonTarget.compareTo("bcde")); // 0
        System.out.println("cdef와 비교: " + comparisonTarget.compareTo("cdef")); // -1
        System.out.println("abcd와 비교: " + comparisonTarget.compareTo("abcd")); // 1
        System.out.println("BCDE와 비교: " + comparisonTarget.compareTo("BCDE")); // 32
        System.out.println("BCDE와 대소문자 무시 비교: "
                + comparisonTarget.compareToIgnoreCase("BCDE")); // 0

        /* concat과 + 연산자는 모두 문자열을 연결할 수 있습니다. */
        String firstName = "Kim";
        String lastName = "Lucky";
        String concatenatedName = firstName.concat(" ").concat(lastName);
        String plusName = firstName + " " + lastName;

        System.out.println();
        System.out.println("=== 문자열 연결 ===");
        System.out.println("concat 결과: " + concatenatedName);
        System.out.println("+ 연산 결과: " + plusName);

        /*
         * indexOf는 앞에서부터, lastIndexOf는 뒤에서부터 찾은 위치를 반환합니다.
         * 찾는 문자나 문자열이 없으면 -1을 반환하며 대소문자를 구분합니다.
         */
        String searchTarget = "Oracle Java";

        System.out.println();
        System.out.println("=== indexOf와 lastIndexOf ===");
        System.out.println("'l'의 위치: " + searchTarget.indexOf('l'));               // 4
        System.out.println("첫 번째 'a'의 위치: " + searchTarget.indexOf('a'));       // 2
        System.out.println("공백의 위치: " + searchTarget.indexOf(' '));              // 6
        System.out.println("마지막 'a'의 위치: " + searchTarget.lastIndexOf('a'));    // 10
        System.out.println("'z'의 위치: " + searchTarget.indexOf('z'));               // -1
        System.out.println("소문자 'o'의 위치: " + searchTarget.indexOf('o'));         // -1

        /*
         * equals는 대소문자를 구분하고 equalsIgnoreCase는 대소문자를 무시합니다.
         * toUpperCase는 원본을 바꾸지 않고 대문자로 변환된 새 문자열을 반환합니다.
         */
        String firstNameText = "Kim Lucky";
        String secondNameText = "kim Lucky";
        String firstUppercaseName = firstNameText.toUpperCase();
        String secondUppercaseName = secondNameText.toUpperCase();

        System.out.println();
        System.out.println("=== 문자열 내용과 대소문자 비교 ===");
        System.out.println("equals 결과: " + firstNameText.equals(secondNameText));
        System.out.println("첫 번째 대문자 변환: " + firstUppercaseName);
        System.out.println("두 번째 대문자 변환: " + secondUppercaseName);
        System.out.println("대문자 변환 후 equals 결과: "
                + firstUppercaseName.equals(secondUppercaseName));
        System.out.println("equalsIgnoreCase 결과: "
                + firstNameText.equalsIgnoreCase(secondNameText));

        /*
         * String 객체는 한 번 만들어지면 내부 내용을 바꿀 수 없는 불변 객체입니다.
         * concat을 호출해도 originalName은 바뀌지 않고 새로운 문자열이 반환됩니다.
         * 반환값을 변수에 저장해야 연결된 문자열을 계속 사용할 수 있습니다.
         */
        String originalName = "Kim";
        String changedName = originalName.concat(" Lucky");

        System.out.println();
        System.out.println("=== 문자열의 불변성 ===");
        System.out.println("원본 문자열: " + originalName);
        System.out.println("새로 반환된 문자열: " + changedName);
    }
}
