package calculator;

public class DelimitersFactory {
    public static Delimiters makeDelimitersInstance(String rawInput) {
        // separate customDelimiter setting string and operation string
        // if rawInput has customDelimiter
        if (rawInput.startsWith("//") && rawInput.contains("\\n")) {
            return new Delimiters(rawInput.substring(2, 3));
        }
        // if rawInput only has expression
        return new Delimiters();
    }
}
