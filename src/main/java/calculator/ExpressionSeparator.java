package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ExpressionSeparator {
        // private final Delimiters delimiters;
        // private final String rawExpression;
        // // TODO. 얘는 모델일까? 컨트롤러일까?
        // // TODO. 어느 정도로 기능을 구현하고 리팩토링을 해야 할까? 다 완성하고 나서? 아니면 각 기능마다?
        // public ExpressionSeparator(Delimiters delimiters, String rawExpression) {
        //     this.delimiters = delimiters;
        //     this.rawExpression = rawExpression;
        // }

        public static List<Integer> parseExpression(String rawExpression, String delimiters) {
            StringTokenizer st = new StringTokenizer(rawExpression, delimiters);
            List<Integer> result = new ArrayList<>();
            while (st.hasMoreTokens()) {
                result.add(Integer.parseInt(st.nextToken()));
            }
            return result;
    }
}
