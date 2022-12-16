package pairmatching.service;

import pairmatching.utils.BasicInputParser;
import pairmatching.view.InputView;

public class InputViewService {
    private final InputView inputView;

    public InputViewService() {
        inputView = new InputView();
    }

    public String getMainInput() {
        try {
            String command = inputView.readMainInput();

            return BasicInputParser.parseMainInput(command);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getMainInput();
        }
    }

}
