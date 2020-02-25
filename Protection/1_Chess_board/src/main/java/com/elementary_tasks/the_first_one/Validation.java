package com.elementary_tasks.the_first_one;

class Validation {
    private static int validHeight;//без static далее не рисуется доска (идет только прием данных)
    private static int validWidth;
    final String ERROR = "Enter an integer (which > 0)";

    EnterData enterData = new EnterData();

    int validateHeight() {
        try {
            validHeight = Integer.parseInt(enterData.getHeight());
            if (validHeight < 0) {
                validHeight = 0;
            }
            return validHeight;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    int validateWidth() {
        try {
            validWidth = Integer.parseInt(enterData.getWidth());
            if (validWidth < 0) {
                validWidth = 0;
            }
            return validWidth;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int getValidHeight() {
        return validHeight;
    }

    public int getValidWidth() {
        return validWidth;
    }
}