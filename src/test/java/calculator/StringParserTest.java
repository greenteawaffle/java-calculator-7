package calculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class StringParserTest {

    private static Stream<Arguments> defaultDelimiterTestArguments() {
        return Stream.of(
            Arguments.arguments("1,2:3", List.of("1", "2", "3")),
            Arguments.arguments("4,5:6", List.of("4", "5", "6"))
        );
    }

    @ParameterizedTest
    @MethodSource("defaultDelimiterTestArguments")  // CsvSource() 쓰면 안 돼?
    // TODO. isEqualTo, 주소 비교? 값 비교?
    void 기본_구분자_사용_테스트(String input, List<String> expectedStrings) {
        List<String> separatedString = Application.stringSeparator(input);
        assertThat(separatedString).isEqualTo(expectedStrings);
    }
}
