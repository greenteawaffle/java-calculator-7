package calculator.model;

public class Delimiters {
    private final String defaultDelimiter;
    private final String customDelimiter;

    public Delimiters() {
        defaultDelimiter = ",:";
        customDelimiter = "";
    }

    public Delimiters(String customDelimiter) {
        defaultDelimiter = ",:";
        this.customDelimiter = customDelimiter;
    }

    public String getDelimiters() {
        return defaultDelimiter + customDelimiter;
    }
}
