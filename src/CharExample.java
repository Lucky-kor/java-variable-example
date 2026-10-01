/**
 * char 타입에 문자와 문자 코드를 저장하는 방법을 확인하는 예제입니다.
 */
public class CharExample {

    public static void main(String[] args) {
        /*
         * char는 문자 한 개를 작은따옴표(' ')로 감싸서 저장합니다.
         * 문자 여러 개와 큰따옴표(" ")로 감싼 값은 String이므로 char에 저장할 수 없습니다.
         */
        char lowercaseLetter = 'a';
        char koreanLetter = '가';
        // char multipleLetters = 'bb'; // 문자 두 개이므로 컴파일 오류
        // char stringValue = "c";      // "c"는 char가 아니라 String

        System.out.println("=== 문자 직접 저장 ===");
        System.out.println("영문자: " + lowercaseLetter);
        System.out.println("한글 문자: " + koreanLetter);

        /*
         * char는 문자를 UTF-16 코드 단위의 숫자로도 표현합니다.
         * 10진수 65와 유니코드 이스케이프 \u0041은 모두 문자 'A'를 뜻합니다.
         */
        char letterFromNumber = 65;
        char letterFromUnicode = '\u0041';

        System.out.println();
        System.out.println("=== 문자 코드로 저장 ===");
        System.out.println("숫자 65에 해당하는 문자: " + letterFromNumber);
        System.out.println("\\u0041에 해당하는 문자: " + letterFromUnicode);
        System.out.println("'A'의 숫자 값: " + (int) letterFromUnicode);

        /*
         * char끼리 연산하면 먼저 int로 변환됩니다.
         * 다시 문자로 사용하려면 계산 결과를 char로 명시적 형변환해야 합니다.
         */
        char nextLetter = (char) (letterFromNumber + 1);

        System.out.println();
        System.out.println("'A' 다음 문자: " + nextLetter); // B
    }
}
