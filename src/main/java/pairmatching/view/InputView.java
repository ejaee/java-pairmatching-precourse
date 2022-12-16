package pairmatching.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

import pairmatching.utils.Constants;

public class InputView {

    public String readMainInput() {
        return scanFor(Constants.MAIN_INPUT_MESSAGE);
    }

    public String scanFor(String message) {
        scanMessage(message);

        return scan();
    }

    private void scanMessage(String message) {
        System.out.println(message);
    }

    private String scan() {
        return readLine();
    }

}
