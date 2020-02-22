package com.elementary_tasks.the_first_one;

import java.util.InputMismatchException;

class Validation {

    private final String ERROR = "Enter a positive integer";

    Specified specified = new Specified();

    public String getERROR() {
        return ERROR;
    }

    int validateHeight() {
        try {
            specified.height();
            if (specified.getHeight() < 0) {
                specified.setHeight(0);
            }
            return specified.getHeight();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    int validateWidth() {
        try {
            specified.width();
            if (specified.getWidth() < 0) {
                specified.setWidth(0);
            }
            return specified.getWidth();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}