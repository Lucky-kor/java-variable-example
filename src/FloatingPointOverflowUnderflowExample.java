import java.math.BigDecimal;

/**
 * float 연산에서 발생하는 오버플로우와 언더플로우를 확인하는 예제입니다.
 */
public class FloatingPointOverflowUnderflowExample {

    public static void main(String[] args) {
        /*
         * Float.MAX_VALUE는 float로 표현할 수 있는 가장 큰 유한한 양수입니다.
         * 이 값보다 큰 연산 결과는 양의 무한대(Infinity)가 됩니다.
         */
        float largestValue = Float.MAX_VALUE;
        float overflowValue = largestValue * 2.0f;

        System.out.println("=== 실수 오버플로우 ===");
        System.out.println("float의 최댓값: " + largestValue);
        System.out.println("최댓값 * 2: " + overflowValue);
        System.out.println("무한대인가? " + Float.isInfinite(overflowValue)); // true

        System.out.println();

        /*
         * Float.MIN_NORMAL은 일반적인 방식으로 표현되는 가장 작은 양수입니다.
         * 이보다 작아져도 곧바로 0이 되지는 않고, 정밀도가 낮은 비정규화 수로 표현될 수 있습니다.
         */
        float smallestNormalValue = Float.MIN_NORMAL;
        float subnormalValue = smallestNormalValue / 2.0f;

        System.out.println("=== 0에 가까워지는 과정 ===");
        System.out.println("가장 작은 정규화 양수: " + smallestNormalValue);
        System.out.println("정규화 최솟값 / 2: " + subnormalValue);

        /*
         * 주의: Float.MIN_VALUE는 가장 작은 음수가 아니라 0보다 큰 가장 작은 float 값입니다.
         * 이 값을 다시 2로 나누면 더 이상 표현할 수 없어 0.0이 됩니다. 이것이 언더플로우입니다.
         */
        float smallestPositiveValue = Float.MIN_VALUE;
        float positiveUnderflowValue = smallestPositiveValue / 2.0f;
        float negativeUnderflowValue = -smallestPositiveValue / 2.0f;

        System.out.println();
        System.out.println("=== 실수 언더플로우 ===");
        System.out.println("0보다 큰 가장 작은 float 값: " + smallestPositiveValue);
        System.out.println("가장 작은 양수 / 2: " + positiveUnderflowValue); // 0.0
        System.out.println("가장 작은 음의 크기 / 2: " + negativeUnderflowValue); // -0.0
        System.out.println("양의 언더플로우 결과가 0인가? "
                + (positiveUnderflowValue == 0.0f)); // true

        /*
         * 실수 오버플로우는 정수처럼 반대편 값으로 돌아가지 않고 무한대가 되며,
         * 언더플로우는 값의 정밀도를 잃다가 최종적으로 0에 가까워집니다.
         * double 타입에서도 같은 원리가 적용되지만 표현 범위와 정밀도가 더 큽니다.
         */

        /*
         * 10진수 0.1과 0.2는 유한한 2진 부동소수점으로 정확하게 표현되지 않습니다.
         * 따라서 double로 계산한 결과에는 아주 작은 오차가 포함될 수 있습니다.
         */
        double approximateResult = 0.1 + 0.2;

        System.out.println();
        System.out.println("=== 부동소수점 정밀도 ===");
        System.out.println("double로 계산한 0.1 + 0.2: " + approximateResult);
        System.out.println("계산 결과가 정확히 0.3인가? " + (approximateResult == 0.3));

        /*
         * BigDecimal은 정확한 10진 계산이 필요할 때 사용합니다.
         * double을 생성자에 직접 전달하면 이미 근사된 값이 전달되므로 오차도 함께 저장됩니다.
         * 정확한 10진 값을 만들려면 문자열 생성자 또는 BigDecimal.valueOf를 사용합니다.
         */
        BigDecimal fromDouble = new BigDecimal(0.1);
        BigDecimal exactFirstNumber = new BigDecimal("0.1");
        BigDecimal exactSecondNumber = new BigDecimal("0.2");
        BigDecimal exactResult = exactFirstNumber.add(exactSecondNumber);

        System.out.println();
        System.out.println("=== BigDecimal 생성 방법 비교 ===");
        System.out.println("new BigDecimal(0.1): " + fromDouble);
        System.out.println("문자열로 만든 0.1 + 0.2: " + exactResult);
    }
}
