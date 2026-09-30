/**
 * 원시 타입(primitive type)과 참조 타입(reference type)의 차이를 확인하는 예제입니다.
 */
public class PrimitiveAndReferenceTypeExample {

    public static void main(String[] args) {
        /*
         * 원시 타입 변수에는 실제 값이 저장됩니다.
         * 자바의 원시 타입은 byte, short, int, long, float, double, char, boolean의
         * 8가지입니다.
         */
        int originalNumber = 10;
        int copiedNumber = originalNumber; // 현재 값 10이 copiedNumber에 복사됨

        copiedNumber = 20; // 복사본만 변경

        // 두 변수는 각각 독립된 값을 가지므로 copiedNumber를 바꿔도 originalNumber는 그대로입니다.
        System.out.println("원본 원시 값: " + originalNumber); // 10
        System.out.println("복사한 원시 값: " + copiedNumber); // 20

        System.out.println();

        /*
         * 참조 타입 변수에는 객체 자체가 아니라 객체를 가리키는 참조가 저장됩니다.
         * 클래스, 배열, 인터페이스, 열거형(enum) 등이 참조 타입에 해당합니다.
         */
        Student originalStudent = new Student("민수");
        Student copiedReference = originalStudent;

        /*
         * 대입 연산으로 참조 값이 복사되었습니다. 따라서 두 변수는 서로 다른 변수가 맞지만,
         * 두 변수 안의 참조는 같은 Student 객체를 가리킵니다.
         */
        copiedReference.name = "영희";

        // 같은 객체의 이름을 바꿨으므로 originalStudent를 통해 확인해도 "영희"가 출력됩니다.
        System.out.println("원본 참조로 확인한 이름: " + originalStudent.name);
        System.out.println("복사한 참조로 확인한 이름: " + copiedReference.name);
        System.out.println("두 참조가 같은 객체를 가리키는가? "
                + (originalStudent == copiedReference)); // true

        // new를 다시 사용하면 내용이 같더라도 별개의 객체가 만들어집니다.
        Student anotherStudent = new Student("영희");
        System.out.println("새 객체와 같은 객체인가? "
                + (originalStudent == anotherStudent)); // false

        // 참조 타입 변수에는 "아무 객체도 가리키지 않음"을 뜻하는 null을 저장할 수 있습니다.
        Student noStudent = null;
        System.out.println("참조가 비어 있는가? " + (noStudent == null)); // true

        // 원시 타입에는 null을 저장할 수 없습니다.
        // int noNumber = null; // 컴파일 오류
    }

    /** 예제에서 참조 타입으로 사용할 간단한 학생 클래스입니다. */
    private static class Student {
        private String name;

        private Student(String name) {
            this.name = name;
        }
    }
}
