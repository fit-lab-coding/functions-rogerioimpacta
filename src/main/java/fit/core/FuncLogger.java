package fit.core;

import java.util.function.Function;

public class FuncLogger {
    public static Function<String, String> create(String prefix) {
        return text -> {
            var formattedText = String.format("%s %s", prefix, text);
            System.out.println(formattedText);

            return formattedText;
        };
    }
}
