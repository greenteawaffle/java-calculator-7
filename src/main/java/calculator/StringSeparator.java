package calculator;


public class StringSeparator {
    // TODO. custom 구분자와 덧셈식을 각각 저장하려고 하는데, 연산을 두 번 해야 할까?
    // TODO. 한 번만 하는 경우 -> 커스텀 구분자 파서가 일반 덧셈식도 반환해야 한다. -> 하나의 메소드가 두가지 일을 하는 거 아닌가?
    // TODO. 두 번 하는 경우 -> 각 rawInput에 대해서 커스텀 구분자를 설정하고, 일반 덧셈식도 설정한다. 하지만 연산을 두 번 해야 한다. -> 이거로 가보자!
    // TODO. BUT!!!!!!! -> 만약 Delimiters와 expressionString을 동시에 저장하는 클래스를 생성한다면? -> 연산을 한 번만 하면서 메소드 하나에 하나의 기능만 집어넣을 수 있다! -> 이름을 뭐로 하지?
    
    // ExpressionSeparator를 만드는 메소드, 커스텀 구분자와 rawExpression을 담는 객체를 만든다.

    public static Delimiters parseDelimiters(String rawInput) {
        return DelimitersFactory.makeDelimitersInstance(rawInput);
    }

    public static Expression parseExpression(String rawInput) {
        if (rawInput.startsWith("//")) {
            // String[] splittedStrings = rawInput.split("\\n");
            // return splittedStrings[1];  TODO. split, regex를 사용해보자.
            // TODO. 생각해보자! 실제 문제를 풀어야 할 때 가장 빠른 구현 방법을 찾아야 한다. 그럼 지금 어떤 자세로 구현 연습에 임해야 하는가?
            return new Expression(rawInput.substring(6));
        }
        return new Expression(rawInput);
    }
}
