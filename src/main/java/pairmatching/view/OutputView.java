package pairmatching.view;

public class OutputView {
    public static final String ERROR_PREFIX = "[ERROR]";

    public void printErrorMessage(Exception e) {
        print(ERROR_PREFIX + e.getMessage());
    }

    public void print(String message) {
        System.out.println(message);
    }

}
