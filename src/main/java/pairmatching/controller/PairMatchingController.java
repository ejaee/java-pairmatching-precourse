package pairmatching.controller;

import pairmatching.service.InputViewService;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private final InputViewService inputViewService;
    private final OutputView outputView;

    public PairMatchingController(){
        this.inputViewService = new InputViewService();
        this.outputView = new OutputView();
    }

    public void run() {
        mainInput();

    }

    private void mainInput() {
        String command = inputViewService.getMainInput();
    }


}
