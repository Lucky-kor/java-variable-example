/**
 * 자바 변수와 상수의 이름을 짓는 규칙 및 관례를 확인하는 예제입니다.
 */
public class VariableNamingExample {

    public static void main(String[] args) {
        // 변수 이름은 보통 소문자로 시작하고, 단어가 바뀔 때마다 첫 글자를
        // 대문자로 작성하는 lowerCamelCase(로어 카멜 케이스)를 사용합니다.
        int userAge = 20;
        String userName = "홍길동";

        // boolean 변수는 is, has, can 등으로 시작하면 의미를 쉽게 알 수 있습니다.
        boolean isStudent = true;
        boolean hasStudentCard = true;

        // 자바는 대소문자를 구분하므로 userScore와 UserScore는 서로 다른 변수입니다.
        // 다만 변수명을 대문자로 시작하면 자바의 이름 짓기 관례에 어긋나므로 피해야 합니다.
        int userScore = 90;
        int UserScore = 100; // 문법상 가능하지만 권장하지 않는 이름

        // 변수 이름에는 문자, 숫자, 밑줄(_), 달러 기호($)를 사용할 수 있지만
        // 숫자로 시작할 수 없으며 class, int와 같은 예약어도 사용할 수 없습니다.
        // 아래 코드는 컴파일되지 않으므로 주석으로만 확인합니다.
        // int 1stScore = 80; // 숫자로 시작할 수 없음
        // int class = 1;     // 예약어를 변수 이름으로 사용할 수 없음

        // 의미가 드러나는 이름은 변수의 용도를 설명해 줍니다.
        // n이나 t처럼 지나치게 짧은 이름보다 아래와 같은 이름이 읽기 쉽습니다.
        int elapsedTimeInSeconds = 45;
        char finalGrade = 'B';

        // final이 붙은 변수는 한 번 값을 대입하면 다시 대입할 수 없는 상수입니다.
        // 상수 이름은 보통 대문자와 밑줄을 사용하는 UPPER_SNAKE_CASE로 작성합니다.
        final int MAX_LOGIN_ATTEMPTS = 5;
        final double TAX_RATE = 0.10;
        // MAX_LOGIN_ATTEMPTS = 10; // 상수에는 값을 다시 대입할 수 없음

        System.out.println("사용자: " + userName + ", 나이: " + userAge);
        System.out.println("학생 여부: " + isStudent);
        System.out.println("학생증 보유 여부: " + hasStudentCard);
        System.out.println("userScore: " + userScore + ", UserScore: " + UserScore);
        System.out.println("경과 시간(초): " + elapsedTimeInSeconds);
        System.out.println("최종 등급: " + finalGrade);
        System.out.println("최대 로그인 시도 횟수: " + MAX_LOGIN_ATTEMPTS);
        System.out.println("세율: " + TAX_RATE);
    }
}
