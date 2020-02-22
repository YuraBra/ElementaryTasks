package com.elementary_tasks.seventh;

import java.util.InputMismatchException;

public class Validation {

    private final String ERROR = "Only positive integers are allowed (from 0 to 2 147 483 647)";

    private final String EMPTY_ROW = "The row is empty cause You wished so.";

    Input input = new Input();

    public String getERROR() {
        return ERROR;
    }

    public String getEMPTY_ROW() {
        return EMPTY_ROW;
    }

    int validateSquareNumber() {
        try {
            input.squareNumber();
            if (input.getSquareNumber() < 0) {
                input.setSquareNumber(-1);
            }
            return input.getSquareNumber();
        } catch (InputMismatchException e) {
            return -1;
        }
    }

    int validateRowLength() {
        try {
            input.rowLength();
            if (input.getRowLength() < 0) {
                input.setRowLength(-1);
            }
            return input.getRowLength();
        } catch (InputMismatchException e) {
            return -1;
        }
    }
}
