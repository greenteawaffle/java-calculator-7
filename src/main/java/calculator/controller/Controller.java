package calculator.controller;



import calculator.model.Delimiters;
import calculator.model.Expression;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Controller {
    public static void run() {
        String input = InputView.readInput();
        Delimiters delimiters = StringSeparator.parseDelimiters(input);
        Expression expression = StringSeparator.parseExpression(input);

        Integer result = Calculator.add(ExpressionSeparator.parseExpression(expression.getExpression(), delimiters.getDelimiters()));

        OutputView.printResult(result);
    }

    
}
