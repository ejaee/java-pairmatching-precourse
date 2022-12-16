package pairmatching.utils;

import java.util.Arrays;
import java.util.List;

public class BasicInputParser {
    private BasicInputParser() {
    }

    public static String parseMainInput(final String input) {
        List<String> commands = Arrays.asList
                (Constants.FUNCTION_ONE, Constants.FUNCTION_TWO, Constants.FUNCTION_THREE, Constants.FUNCTION_FOUR);

        return parseWithEmptyCheck(input, commands);
    }

    private static String parseWithEmptyCheck(final String input, final List<String> commands) {
        EmptyChecker.check(input);


        return parse(input, commands);
    }

    private static String parse(final String input, List<String> commands) {

        if (!ContainedChecker.isValidateCommand(input, commands)) {
            throw new IllegalArgumentException();
        }
        return input;
    }

}
