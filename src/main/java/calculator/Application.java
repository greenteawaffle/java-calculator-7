package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Application {
    public static void main(String[] args) {
        
    }

    public static List<String> stringSeparator(String rawString) {
        StringTokenizer st = new StringTokenizer(rawString, ",:");
        List<String> result = new ArrayList<>();
        while (st.hasMoreTokens()) {
            result.add(st.nextToken());
        }
        return result;
    }
}
