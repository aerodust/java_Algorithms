package integra.study;

import java.sql.SQLOutput;

public class dove {
    public static void main(String[] args) {
        System.out.println('b');
        // string 타입으로 인식하여 b를 출력하게됨
        System.out.println('b'+'c');
        // string 타입간의 산술연산이 진행되어 char값에 해당되는 int값의 덧셈으로 출려됨
        System.out.println((char) ('a'+4));
        // 상기와 비슷한 이유로 수가 출력되었어야 하나 (char)라고 데이터 타입변환을 선언해 문자로 출력
    }
}
