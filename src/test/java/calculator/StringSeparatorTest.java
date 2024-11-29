package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class StringSeparatorTest {
    @Test
    void 커스텀_구분자_정상_분리_테스트() {
        Delimiters delimiters = StringSeparator.parseDelimiters("//!\\n1!2!3:4");
        assertThat(delimiters.getDelimiters()).isEqualTo(",:!"); // TODO. 좀 헷갈리는 방식의 테스트다..
    }

    @Test
    void 덧셈식_문자열_정상_분리_테스트() {
        String rawExpression = StringSeparator.parseExpression("//!\\n1:2!3,4!6").getExpression();  // TODO. 커스텀 구분자의 문자 길이가 1인 경우에만 정상적으로 동작한다. // 이런 방식의 테스트 ok?
        assertThat(rawExpression).isEqualTo("1:2!3,4!6");
    }
}
