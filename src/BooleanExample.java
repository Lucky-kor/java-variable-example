/**
 * boolean 타입과 비교·논리 연산의 결과를 확인하는 예제입니다.
 */
public class BooleanExample {

    public static void main(String[] args) {
        /*
         * boolean은 참(true) 또는 거짓(false) 두 값만 저장할 수 있습니다.
         * 변수 이름을 is, has, can 등으로 시작하면 무엇이 참인지 쉽게 알 수 있습니다.
         */
        boolean isValid = true;
        boolean isInvalid = false;

        System.out.println("=== boolean 값 ===");
        System.out.println("유효한가? " + isValid);
        System.out.println("유효하지 않은가? " + isInvalid);

        /*
         * 비교 연산의 결과도 boolean입니다.
         * age >= 20은 age가 20 이상이면 true, 그렇지 않으면 false가 됩니다.
         */
        int age = 20;
        boolean isAdult = age >= 20;

        System.out.println();
        System.out.println("=== 비교 연산 ===");
        System.out.println("나이: " + age);
        System.out.println("성인인가? " + isAdult);

        /*
         * &&(AND)는 두 조건이 모두 true일 때만 true입니다.
         * ||(OR)는 두 조건 중 하나 이상이 true이면 true입니다.
         * !(NOT)은 true와 false를 반대로 바꿉니다.
         */
        boolean hasTicket = true;
        boolean canEnter = isAdult && hasTicket;
        boolean needsHelp = !isAdult || !hasTicket;

        System.out.println();
        System.out.println("=== 논리 연산 ===");
        System.out.println("입장권이 있는가? " + hasTicket);
        System.out.println("입장할 수 있는가? " + canEnter);
        System.out.println("도움이 필요한가? " + needsHelp);
    }
}
