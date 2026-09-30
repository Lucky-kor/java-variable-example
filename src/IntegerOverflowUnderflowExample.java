/**
 * int 연산에서 발생하는 오버플로우와 언더플로우를 확인하는 예제입니다.
 */
public class IntegerOverflowUnderflowExample {

    public static void main(String[] args) {
        /*
         * int는 32비트 부호 있는 정수 타입입니다.
         * 표현 범위는 -2,147,483,648부터 2,147,483,647까지입니다.
         */
        int maximumValue = Integer.MAX_VALUE;
        int minimumValue = Integer.MIN_VALUE;

        /*
         * 최댓값에 1을 더하면 표현 범위를 벗어납니다.
         * 자바의 일반적인 정수 연산은 예외를 발생시키지 않고 최솟값으로 돌아갑니다.
         */
        int overflowValue = maximumValue + 1;

        System.out.println("=== 정수 오버플로우 ===");
        System.out.println("int의 최댓값: " + maximumValue);
        System.out.println("최댓값 + 1: " + overflowValue); // Integer.MIN_VALUE

        /*
         * 반대로 최솟값에서 1을 빼도 표현 범위를 벗어나며,
         * 이번에는 int의 최댓값으로 돌아갑니다.
         */
        int underflowValue = minimumValue - 1;

        System.out.println();
        System.out.println("=== 정수 언더플로우 ===");
        System.out.println("int의 최솟값: " + minimumValue);
        System.out.println("최솟값 - 1: " + underflowValue); // Integer.MAX_VALUE

        /*
         * 연산 전에 더 큰 정수 타입인 long으로 변환하면 수학적으로 올바른 결과를
         * 확인할 수 있습니다. 캐스팅은 반드시 덧셈보다 먼저 수행해야 합니다.
         */
        long correctOverflowResult = (long) maximumValue + 1;
        long correctUnderflowResult = (long) minimumValue - 1;

        System.out.println();
        System.out.println("=== long으로 계산한 실제 결과 ===");
        System.out.println("최댓값 + 1: " + correctOverflowResult);
        System.out.println("최솟값 - 1: " + correctUnderflowResult);

        /*
         * 오버플로우를 조용히 허용하면 프로그램 오류로 이어질 수 있습니다.
         * Math.addExact 같은 메서드를 사용하면 범위를 벗어나는 순간
         * ArithmeticException이 발생하므로 문제를 즉시 발견할 수 있습니다.
         */
        try {
            Math.addExact(maximumValue, 1);
        } catch (ArithmeticException exception) {
            System.out.println();
            System.out.println("Math.addExact가 오버플로우를 감지했습니다.");
        }
    }
}
