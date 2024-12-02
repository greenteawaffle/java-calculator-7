package calculator;

import static camp.nextstep.edu.missionutils.Console.readLine;

import java.util.List;

public class Controller {
    public static void run() {
        String input = readLine();
        Delimiters delimiters = StringSeparator.parseDelimiters(input);
        Expression expression = StringSeparator.parseExpression(input);

        Integer result = add(ExpressionSeparator.parseExpression(expression.getExpression(), delimiters.getDelimiters()));

        System.out.println(result);
    }

    public static Integer add(List<Integer> operations) {
        return operations.stream().mapToInt(Integer::intValue).sum();
    }
}
