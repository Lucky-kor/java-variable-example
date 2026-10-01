# 자바 변수와 자료형 학습 가이드

이 프로젝트는 자바의 변수 이름, 원시·참조 타입, 형변환, 숫자의 표현 범위, 문자열을 순서대로 학습하기 위한 예제입니다.
각 코드를 바로 실행하기 전에 **결과를 먼저 예상하고**, 실행 결과가 예상과 다른 이유를 설명해 보는 방식으로 학습하세요.

## 학습 목표

이 프로젝트를 모두 학습하면 다음 내용을 설명할 수 있어야 합니다.

- 자바 변수와 상수의 이름을 관례에 맞게 지을 수 있다.
- 원시 타입과 참조 타입에 무엇이 저장되는지 설명할 수 있다.
- `boolean` 값이 비교 연산과 논리 연산에서 어떻게 만들어지는지 설명할 수 있다.
- `char`와 `String`의 차이 및 문자 코드의 관계를 설명할 수 있다.
- 자동 형변환과 명시적 형변환을 구분하고 값 손실 가능성을 설명할 수 있다.
- 정수가 표현 범위를 벗어났을 때 값이 어떻게 변하는지 설명할 수 있다.
- 실수의 오버플로우와 언더플로우가 정수와 어떻게 다른지 설명할 수 있다.
- 부동소수점 오차가 생기는 이유와 `BigDecimal`의 올바른 생성 방법을 설명할 수 있다.
- 문자열의 객체 동일성과 내용 동일성을 올바른 방법으로 비교할 수 있다.
- 자주 사용하는 `String` 메서드와 문자열의 불변성을 설명할 수 있다.
- 범위를 벗어나는 계산에서 발생할 수 있는 오류를 예방할 수 있다.

## 권장 학습 순서

| 순서 | 예제 | 핵심 주제 |
| --- | --- | --- |
| 1 | `VariableNamingExample` | 변수와 상수의 이름 짓기 |
| 2 | `PrimitiveAndReferenceTypeExample` | 원시 타입과 참조 타입 |
| 3 | `BooleanExample` | 논리값, 비교 연산, 논리 연산 |
| 4 | `CharExample` | 문자 리터럴, 문자 코드, 문자 연산 |
| 5 | `TypeCastingExample` | 자동·명시적 형변환과 문자열 변환 |
| 6 | `IntegerOverflowUnderflowExample` | 정수의 표현 범위와 값의 순환 |
| 7 | `FloatingPointOverflowUnderflowExample` | 실수의 무한대, 언더플로우, 정밀도 |
| 8 | `StringExample01` | 문자열 풀, `==`, `equals` |
| 9 | `StringMethodExample` | 주요 문자열 메서드와 불변성 |

변수 이름을 읽는 법부터 익힌 후, 변수가 무엇을 저장하는지 학습합니다. `boolean`과 `char`로 원시 타입을 구체적으로 다루고 형변환을 익힌 다음, 정수와 실수가 제한된 비트 안에서 값을 표현하는 방식을 비교합니다. 마지막으로 대표적인 참조 타입인 `String`의 생성, 비교, 주요 메서드를 학습합니다.

## 예제 실행 방법

### IntelliJ IDEA에서 실행

1. `src` 폴더에서 학습할 Java 파일을 엽니다.
2. `main` 메서드 왼쪽의 실행 아이콘을 누릅니다.
3. 실행 결과를 아래쪽 **Run** 창에서 확인합니다.

## 1. 변수와 상수의 이름 짓기

학습 파일: [`src/VariableNamingExample.java`](src/VariableNamingExample.java)

### 먼저 확인할 내용

- 변수 이름은 보통 소문자로 시작하는 `lowerCamelCase`를 사용합니다.
- 클래스 이름은 대문자로 시작하는 `UpperCamelCase`를 사용합니다.
- 상수는 대문자와 밑줄을 사용하는 `UPPER_SNAKE_CASE`를 사용합니다.
- 자바는 변수 이름의 대소문자를 구분합니다.
- 변수 이름은 숫자로 시작할 수 없고 예약어를 사용할 수 없습니다.

### 가장 중요한 부분

**문법적으로 가능한 이름과 좋은 이름은 다릅니다.**

`UserScore`는 컴파일되지만 변수 이름을 대문자로 시작하므로 자바 관례에 맞지 않습니다. 또한 `n`, `t`, `c`처럼 의미가 불분명한 이름보다 `elapsedTimeInSeconds`, `finalGrade`처럼 용도와 단위를 알 수 있는 이름이 좋습니다.

이름만 보고 다음 세 가지를 짐작할 수 있는지 확인하세요.

1. 무엇을 저장하는가?
2. 어떤 단위를 사용하는가?
3. `boolean`이라면 어떤 조건이 참인가?

### 직접 해보기

- `userAge`를 자신의 나이로 변경해 봅니다.
- `isStudent`의 값을 `false`로 변경하고 출력을 확인합니다.
- `elapsedTimeInSeconds`를 분 단위 변수로 바꾸고 이름과 값을 함께 수정합니다.
- 주석 처리된 잘못된 변수 선언을 하나씩 해제하여 컴파일 오류를 확인합니다. 확인 후에는 다시 주석 처리합니다.

## 2. 원시 타입과 참조 타입

학습 파일: [`src/PrimitiveAndReferenceTypeExample.java`](src/PrimitiveAndReferenceTypeExample.java)

### 먼저 확인할 내용

자바의 원시 타입은 다음 8개입니다.

- 정수: `byte`, `short`, `int`, `long`
- 실수: `float`, `double`
- 문자: `char`
- 논리: `boolean`

이 예제에서는 참조 타입 중 가장 기본이 되는 `Object`만 사용합니다.

### 가장 중요한 부분

원시 타입 변수에는 **값 자체**가 저장됩니다.

```java
int intValue = 2_000_000_000;
char charValue = 'A';
boolean booleanValue = true;
```

참조 타입 변수에는 객체 자체가 저장되는 것이 아니라, 만들어진 객체를 가리키는 **참조값**이 저장됩니다. 입문 단계에서는 이 값을 흔히 "주소값"이라고 표현합니다.

```java
Object objectValue = new Object();
```

`new Object()`는 새로운 `Object` 객체를 만들고, `objectValue`는 그 객체를 찾아갈 수 있는 참조값을 저장합니다.

> `Object`를 출력할 때 보이는 `java.lang.Object@...` 문자열은 실제 메모리 주소를 직접 보여주는 값이 아닙니다. 현재 단계에서는 변수가 객체를 가리키는 참조값을 가진다는 점만 이해하면 됩니다.

### 실행하며 확인할 내용

1. 8개의 원시 타입과 각 변수의 값을 확인합니다.
2. `long` 값 뒤에는 `L`, `float` 값 뒤에는 `f`가 붙는지 확인합니다.
3. `char`는 작은따옴표를 사용하고 `boolean`은 `true` 또는 `false`를 저장하는지 확인합니다.
4. `Object` 변수에는 객체를 가리키는 참조값이 저장된다는 설명을 확인합니다.

### 직접 해보기

- 각 원시 타입 변수의 값을 범위 안에서 변경하고 다시 실행합니다.
- `charValue`를 자신의 이름에 들어 있는 문자 하나로 변경합니다.
- `booleanValue`를 `false`로 변경하고 출력을 확인합니다.
- `Object objectValue = new Object();`에서 변수에 저장되는 것이 객체 자체인지 참조값인지 말로 설명해 봅니다.

## 3. boolean과 논리 연산

학습 파일: [`src/BooleanExample.java`](src/BooleanExample.java)

### 먼저 확인할 내용

`boolean`은 다음 두 값만 저장하는 원시 타입입니다.

```java
boolean isValid = true;
boolean isInvalid = false;
```

`true`와 `false`는 문자열이 아니므로 따옴표를 사용하지 않습니다. `boolean isValid = "true";`처럼 작성하면 타입이 달라 컴파일되지 않습니다.

### 비교 연산의 결과

비교 연산은 두 값을 비교하고 `boolean` 결과를 만듭니다.

| 연산자 | 의미 | 예시 |
| --- | --- | --- |
| `==` | 두 값이 같은가? | `age == 20` |
| `!=` | 두 값이 다른가? | `age != 20` |
| `>` | 왼쪽이 더 큰가? | `age > 20` |
| `>=` | 왼쪽이 크거나 같은가? | `age >= 20` |
| `<` | 왼쪽이 더 작은가? | `age < 20` |
| `<=` | 왼쪽이 작거나 같은가? | `age <= 20` |

예제의 다음 코드는 `age`가 20이므로 `true`가 됩니다.

```java
boolean isAdult = age >= 20;
```

### 논리 연산의 결과

- `조건A && 조건B`: 두 조건이 모두 `true`일 때만 `true`
- `조건A || 조건B`: 하나 이상의 조건이 `true`이면 `true`
- `!조건`: 현재 논리값을 반대로 변경

예제에서 `canEnter`는 성인이면서 입장권도 있어야 `true`가 됩니다.

```java
boolean canEnter = isAdult && hasTicket;
```

### 직접 해보기

- `age`를 `19`로 변경하고 `isAdult`, `canEnter`, `needsHelp`의 결과를 예상합니다.
- `hasTicket`을 `false`로 변경하고 `&&`, `||`, `!`의 결과를 설명합니다.
- `age >= 20`을 `age == 20`으로 변경하여 두 조건의 의미 차이를 설명합니다.
- `isAdult == true`와 `isAdult`가 같은 결과임을 확인하고 더 간결한 표현을 찾아봅니다.

## 4. char와 문자 코드

학습 파일: [`src/CharExample.java`](src/CharExample.java)

### char와 String 구분하기

`char`는 문자 한 개를 저장하며 작은따옴표를 사용합니다. `String`은 문자가 0개 이상 연결된 문자열이며 큰따옴표를 사용합니다.

```java
char letter = 'A';       // 문자 한 개
String text = "A";       // 길이가 1인 문자열
String word = "Java";    // 문자 여러 개
```

따라서 다음 선언은 컴파일되지 않습니다.

```java
// char multipleLetters = 'bb'; // 작은따옴표 안에 문자가 두 개
// char stringValue = "c";      // 큰따옴표로 만든 값은 String
```

### 숫자와 문자의 관계

`char`는 내부적으로 UTF-16 코드 단위 하나를 저장합니다. 그래서 문자 자체뿐 아니라 `0`부터 `65535` 사이의 숫자나 유니코드 이스케이프를 대입할 수 있습니다.

```java
char letterFromNumber = 65;
char letterFromUnicode = '\u0041';
```

두 값 모두 출력하면 `A`가 나옵니다. 반대로 `(int) 'A'`처럼 형변환하면 숫자 `65`를 확인할 수 있습니다.

### 문자 연산

`char`를 산술 연산에 사용하면 먼저 `int`로 변환됩니다.

```java
char nextLetter = (char) ('A' + 1); // 'B'
```

`'A' + 1`의 결과 타입은 `int`이므로 다시 문자 변수에 저장하려면 `(char)` 형변환이 필요합니다.

> 모든 화면 속 기호가 `char` 하나로 표현되는 것은 아닙니다. 이모지처럼 UTF-16 코드 단위 두 개가 필요한 문자도 있습니다. 현재 예제에서는 영문자와 한글 한 글자를 중심으로 학습합니다.

### 직접 해보기

- 숫자 `66`, `67`을 각각 `char`에 저장하고 출력 결과를 예상합니다.
- `'가'`를 `int`로 변환하여 문자 코드를 확인합니다.
- `'Z' + 1`의 결과를 `char`로 변환하고 어떤 문자가 나오는지 확인합니다.
- 주석 처리된 잘못된 선언을 하나씩 해제해 컴파일 오류를 읽은 뒤 다시 주석 처리합니다.

## 5. 형변환과 문자열 변환

학습 파일: [`src/TypeCastingExample.java`](src/TypeCastingExample.java)

### 자동 형변환

일반적으로 표현 범위가 더 넓은 타입으로 값을 옮길 때는 자바가 자동으로 타입을 변환합니다.

```java
long longValue = 1010L;
float floatValue = longValue;
```

하지만 자동 형변환이라고 해서 언제나 원래 값이 정확하게 보존되는 것은 아닙니다. `float`는 매우 큰 범위를 표현하지만 유효 자릿수가 제한되어 있으므로 큰 `long` 값을 옮기면 일부 정밀도를 잃을 수 있습니다.

### 명시적 형변환

큰 범위의 타입을 작은 범위의 타입으로 옮길 때는 개발자가 변환할 타입을 직접 지정해야 합니다.

```java
int intValue = 128;
byte byteValue = (byte) intValue;
```

`byte`의 범위는 `-128`부터 `127`입니다. `128`은 이 범위를 벗어나므로 변환 결과가 `-128`이 됩니다. `(byte)`를 작성했다는 것은 변환을 허용한다는 의미이지, 값 손실이 없다는 보장이 아닙니다.

### 문자열과 숫자 변환

형변환 연산자만으로 `String`을 숫자로 바꿀 수는 없습니다. 문자열의 내용을 숫자로 해석하는 메서드를 사용해야 합니다.

```java
int number = Integer.parseInt("12345");
String text = String.valueOf(number);
```

`Integer.parseInt("12a")`처럼 정수가 아닌 문자열을 전달하면 `NumberFormatException`이 발생합니다. 예제에서는 `try-catch`로 이 예외를 처리합니다.

### 직접 해보기

- `intValue`를 `127`, `128`, `129`, `-129`로 바꾸어 `byte` 결과를 비교합니다.
- `longValue`를 `16_777_216L`과 `16_777_217L`로 바꾸어 `float`의 정밀도를 비교합니다.
- `Integer.parseInt("-50")`과 `Integer.parseInt("3.14")`의 결과를 예상합니다.
- `Double.parseDouble("3.14")`를 사용해 실수 문자열을 `double`로 변환합니다.

## 6. 정수의 오버플로우와 언더플로우

학습 파일: [`src/IntegerOverflowUnderflowExample.java`](src/IntegerOverflowUnderflowExample.java)

### 먼저 결과를 예상하기

다음 연산의 결과를 실행 전에 적어 봅니다.

```java
int overflowValue = Integer.MAX_VALUE + 1;
int underflowValue = Integer.MIN_VALUE - 1;
```

실제 예제에서는 변수로 연산하지만 결과의 원리는 같습니다.

### 가장 중요한 부분

`int`는 32비트로 표현되며 범위가 정해져 있습니다.

- 최댓값: `2,147,483,647`
- 최솟값: `-2,147,483,648`

일반적인 `int` 연산이 범위를 벗어나도 자바는 자동으로 예외를 발생시키지 않습니다. 최댓값에 1을 더하면 최솟값이 되고, 최솟값에서 1을 빼면 최댓값이 됩니다.

이러한 동작은 카운터, 금액, 파일 크기처럼 큰 값을 계산할 때 발견하기 어려운 오류를 만들 수 있습니다.

### 안전하게 계산하는 방법

- 결과 범위가 크다면 연산 전에 `long`으로 변환합니다.
- 범위 초과를 반드시 감지해야 한다면 `Math.addExact`, `Math.subtractExact`, `Math.multiplyExact`를 사용합니다.
- 금액처럼 정확성이 중요한 값은 필요한 범위와 단위를 먼저 결정합니다.

다음 두 식의 차이에 주의하세요.

```java
long correct = (long) Integer.MAX_VALUE + 1; // 먼저 long으로 변환
long tooLate = Integer.MAX_VALUE + 1;        // int 연산이 끝난 후 long에 저장
```

두 번째 코드는 결과를 `long`에 저장하더라도 이미 `int` 연산 과정에서 범위를 벗어났습니다.

### 직접 해보기

- `Integer.MAX_VALUE` 대신 `Long.MAX_VALUE`로 같은 실험을 해 봅니다.
- `Math.subtractExact(Integer.MIN_VALUE, 1)`을 호출하고 예외를 확인합니다.
- `byte`의 최댓값인 `127`에 1을 더한 뒤 명시적으로 `byte`로 변환해 결과를 확인합니다.

## 7. 실수의 오버플로우, 언더플로우와 정밀도

학습 파일: [`src/FloatingPointOverflowUnderflowExample.java`](src/FloatingPointOverflowUnderflowExample.java)

### 먼저 확인할 내용

실수 타입은 제한된 비트 안에 부호, 지수, 유효 숫자를 나누어 저장합니다. 따라서 매우 큰 값이나 매우 작은 값을 언제나 정확하게 표현할 수는 없습니다.

### 가장 중요한 부분

실수는 정수와 범위 초과 결과가 다릅니다.

| 상황 | `int` | `float` |
| --- | --- | --- |
| 최댓값보다 커짐 | 최솟값 쪽으로 순환 | `Infinity`가 됨 |
| 최솟값보다 작아짐 | 최댓값 쪽으로 순환 | 음의 `Infinity`가 될 수 있음 |
| 0에 매우 가까워짐 | 해당 개념 없음 | 정밀도를 잃다가 `0.0` 또는 `-0.0`이 됨 |

다음 두 상수의 의미를 혼동하지 않는 것이 중요합니다.

- `Float.MIN_NORMAL`: 정규화 방식으로 표현할 수 있는 가장 작은 양수
- `Float.MIN_VALUE`: `0`보다 큰 가장 작은 `float` 값

`Float.MIN_VALUE`는 가장 작은 음수가 아닙니다. 가장 큰 음수의 크기를 확인하려면 `-Float.MAX_VALUE`를 사용합니다.

### 실행하며 관찰할 순서

1. `Float.MAX_VALUE * 2`가 `Infinity`가 되는지 확인합니다.
2. `Float.MIN_NORMAL / 2`가 0이 아닌 비정규화 수가 되는지 확인합니다.
3. `Float.MIN_VALUE / 2`가 `0.0`이 되는지 확인합니다.
4. 음수 방향의 언더플로우 결과가 `-0.0`으로 표시되는지 확인합니다.
5. `0.1 + 0.2`가 정확한 `0.3`이 아닌 이유를 확인합니다.
6. `new BigDecimal(0.1)`과 `new BigDecimal("0.1")`의 출력 차이를 확인합니다.

### 부동소수점 정밀도

컴퓨터의 `float`와 `double`은 값을 2진수로 저장합니다. 10진수 `0.1`은 2진수로 유한하게 끝나지 않으므로 가장 가까운 값으로 반올림되어 저장됩니다. 이런 근삿값으로 계산하면 작은 오차가 결과에 드러날 수 있습니다.

```java
double result = 0.1 + 0.2;
System.out.println(result);        // 0.30000000000000004
System.out.println(result == 0.3); // false
```

부동소수점 결과를 비교할 때는 필요한 정밀도에 맞는 허용 오차를 사용할 수 있습니다.

```java
double tolerance = 1e-10;
boolean isClose = Math.abs(result - 0.3) < tolerance;
```

### BigDecimal을 올바르게 만드는 방법

금액처럼 정확한 10진 계산이 필요하면 `BigDecimal`을 사용할 수 있습니다. 생성 방법에 주의해야 합니다.

```java
BigDecimal inaccurate = new BigDecimal(0.1);
BigDecimal exact = new BigDecimal("0.1");
BigDecimal alsoExact = BigDecimal.valueOf(0.1);
```

`new BigDecimal(0.1)`은 이미 근사된 `double` 값을 그대로 받아 예상보다 긴 소수가 됩니다. 정확한 10진 리터럴을 나타내려면 문자열 생성자 또는 `BigDecimal.valueOf`를 사용합니다.

### 직접 해보기

- `float`를 `double`로 바꾸고 `Double.MAX_VALUE`, `Double.MIN_VALUE`를 사용해 봅니다.
- `Float.isInfinite()`를 사용하여 양의 무한대와 음의 무한대를 확인합니다.
- `double` 계산 결과를 허용 오차 방식으로 `0.3`과 비교합니다.
- `new BigDecimal(0.1)`, `new BigDecimal("0.1")`, `BigDecimal.valueOf(0.1)`의 결과를 비교합니다.
- `BigDecimal`의 `add`, `subtract`, `multiply` 메서드로 사칙연산 일부를 실행합니다.

## 8. 문자열 생성과 비교

학습 파일: [`src/StringExample01.java`](src/StringExample01.java)

### 문자열 리터럴과 문자열 풀

문자열 리터럴로 같은 내용을 여러 번 사용하면 자바는 문자열 풀에 있는 객체를 재사용할 수 있습니다.

```java
String firstLiteral = "Kim Lucky";
String secondLiteral = "Kim Lucky";
```

두 변수는 같은 문자열 객체를 가리키므로 이 예제에서는 `firstLiteral == secondLiteral`이 `true`입니다.

반면 `new String(...)`을 호출하면 내용이 같아도 새로운 객체를 만듭니다.

```java
String firstNewString = new String("Kim Lucky");
String secondNewString = new String("Kim Lucky");
```

### ==와 equals의 차이

문자열에서 두 비교는 질문 자체가 다릅니다.

| 비교 방법 | 확인하는 내용 | 일반적인 사용 목적 |
| --- | --- | --- |
| `a == b` | 두 변수가 같은 객체를 가리키는가? | 객체 동일성 확인 |
| `a.equals(b)` | 두 문자열의 내용이 같은가? | 문자열 내용 비교 |
| `a.equalsIgnoreCase(b)` | 대소문자를 제외한 내용이 같은가? | 대소문자 무시 비교 |

문자열 내용이 같은지 확인할 때는 문자열 풀의 동작에 기대지 말고 `equals`를 사용해야 합니다.

```java
"Kim Lucky".equals(firstNewString); // true
```

### null을 안전하게 비교하기

`null`인 변수에서 메서드를 호출하면 `NullPointerException`이 발생합니다.

```java
String nullableName = null;
// nullableName.equals("Kim Lucky"); // NullPointerException
```

비교 대상 중 확실히 `null`이 아닌 값을 앞에 두면 안전합니다.

```java
"Kim Lucky".equals(nullableName); // false
```

### 직접 해보기

- 각 `==` 결과를 실행 전에 예상하고 두 변수가 가리키는 객체를 그림으로 표현합니다.
- `new String("Java")`로 만든 두 객체를 `==`와 `equals`로 각각 비교합니다.
- `equals`와 `equalsIgnoreCase`가 서로 다른 결과를 만드는 문자열을 직접 작성합니다.
- `nullableName.equals("Kim Lucky")`를 실행해 예외를 확인한 뒤 안전한 비교로 되돌립니다.

## 9. 자주 사용하는 String 메서드와 불변성

학습 파일: [`src/StringMethodExample.java`](src/StringMethodExample.java)

### 길이와 특정 위치의 문자

- `length()`: 문자열의 길이를 반환합니다.
- `charAt(index)`: 지정한 인덱스의 문자를 반환합니다.

인덱스는 `0`부터 시작하고 마지막 인덱스는 `length() - 1`입니다. 범위를 벗어난 인덱스를 `charAt`에 전달하면 `StringIndexOutOfBoundsException`이 발생합니다.

```java
String text = "Java";
text.length();  // 4
text.charAt(0); // 'J'
text.charAt(3); // 'a'
```

### 공백 제거와 문자열 연결

- `trim()`: 문자열 앞뒤의 공백을 제거한 새 문자열을 반환합니다.
- `concat(...)`: 두 문자열을 연결한 새 문자열을 반환합니다.
- `+`: 문자열과 문자열 또는 문자열과 다른 값을 연결합니다.

`trim()`과 `concat()` 모두 원본 문자열을 직접 바꾸지 않습니다.

### 문자열의 사전식 비교

`compareTo`는 앞에서부터 문자를 비교하여 처음 다른 UTF-16 값의 차이를 반환합니다. 공통 부분이 모두 같으면 문자열 길이 차이를 반환합니다.

```java
"bcde".compareTo("bcde"); // 0
"bcde".compareTo("cdef"); // 음수
"bcde".compareTo("abcd"); // 양수
"bcde".compareTo("BCDE"); // 'b'(98) - 'B'(66) = 32
```

`compareTo`는 결과의 정확한 숫자보다 부호를 중심으로 해석합니다.

- 음수: 앞 문자열이 사전식 순서에서 먼저
- `0`: 두 문자열이 같음
- 양수: 앞 문자열이 사전식 순서에서 나중

대소문자를 무시하려면 `compareToIgnoreCase`를 사용합니다.

### 문자 또는 문자열 찾기

- `indexOf`: 앞에서부터 찾은 첫 위치를 반환합니다.
- `lastIndexOf`: 뒤에서부터 찾은 첫 위치를 반환합니다.
- 대상이 없으면 `-1`을 반환합니다.

두 메서드는 대소문자를 구분합니다. 따라서 `"Oracle Java".indexOf('o')`는 대문자 `'O'`와 소문자 `'o'`가 다르기 때문에 `-1`입니다.

### 문자열의 불변성

`String`은 한 번 만들어지면 객체 내부 내용이 바뀌지 않는 불변 객체입니다.

```java
String original = "Kim";
String changed = original.concat(" Lucky");
```

`original`은 여전히 `"Kim"`이고, `changed`가 새 문자열 `"Kim Lucky"`를 가리킵니다. 따라서 문자열 메서드의 결과가 필요하면 반환값을 변수에 저장해야 합니다.

### 직접 해보기

- `charAt(0)`과 `charAt(length() - 1)`로 첫 문자와 마지막 문자를 출력합니다.
- `charAt(length())`를 호출했을 때 왜 예외가 발생하는지 설명합니다.
- `compareTo` 예제의 문자열 순서를 바꾸어 결과 부호가 반대로 되는지 확인합니다.
- `indexOf("Java")`처럼 문자 대신 문자열을 검색합니다.
- `original.concat(" Lucky")`의 반환값을 저장하지 않았을 때 원본이 바뀌는지 확인합니다.

## 권장 학습 방법

각 예제에서 다음 과정을 반복하면 코드 실행보다 개념 이해에 집중할 수 있습니다.

1. 주석을 읽기 전에 코드의 출력 결과를 예상합니다.
2. 코드를 실행하고 예상과 실제 결과를 비교합니다.
3. 예상과 달랐던 줄의 주석을 읽고 이유를 정리합니다.
4. 값을 바꾸어 다시 실행합니다.
5. 코드 없이 결과가 나온 이유를 다른 사람에게 설명해 봅니다.

## 최종 점검 질문

아래 질문에 코드 없이 답할 수 있다면 핵심 개념을 이해한 것입니다.

1. 변수명 `StudentAge`보다 `studentAge`가 권장되는 이유는 무엇인가요?
2. `final` 변수의 이름을 일반 변수와 다르게 짓는 이유는 무엇인가요?
3. 자바의 원시 타입 8개는 무엇인가요?
4. 원시 타입 변수에는 무엇이 저장되나요?
5. `Object`와 같은 참조 타입 변수에는 무엇이 저장되나요?
6. 비교 연산의 결과 타입은 무엇인가요?
7. `&&`, `||`, `!`는 각각 어떤 조건에서 `true`가 되나요?
8. `char`와 `String`은 리터럴 표기와 저장할 수 있는 문자 개수에서 어떻게 다른가요?
9. 숫자 `65`를 `char`에 저장하면 왜 `A`가 출력되나요?
10. 자동 형변환에서도 값의 정밀도를 잃을 수 있는 이유는 무엇인가요?
11. `int` 값 `128`을 `byte`로 변환하면 왜 `-128`이 되나요?
12. 숫자로 해석할 수 없는 문자열에 `Integer.parseInt`를 사용하면 어떤 예외가 발생하나요?
13. `Integer.MAX_VALUE + 1`은 왜 음수가 되나요?
14. 결과를 `long` 변수에 저장하기만 하면 `int` 오버플로우를 막을 수 있나요?
15. 실수 오버플로우는 정수 오버플로우와 어떻게 다른가요?
16. `Float.MIN_VALUE`가 가장 작은 음수가 아닌 이유는 무엇인가요?
17. `0.1 + 0.2 == 0.3`이 `false`가 될 수 있는 이유는 무엇인가요?
18. `new BigDecimal(0.1)`보다 `new BigDecimal("0.1")`이 권장되는 이유는 무엇인가요?
19. 문자열을 비교할 때 `==`와 `equals`는 각각 무엇을 확인하나요?
20. `compareTo`의 반환값은 어떤 기준으로 해석해야 하나요?
21. `indexOf`가 `-1`을 반환한다는 것은 무엇을 뜻하나요?
22. `concat`을 호출해도 원본 문자열이 바뀌지 않는 이유는 무엇인가요?

질문에 답하기 어렵다면 해당 예제로 돌아가 값을 직접 변경하고 다시 실행해 보세요.
