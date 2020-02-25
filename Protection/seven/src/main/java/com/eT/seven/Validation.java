package com.eT.seven;

class Validation {
    private static int squareNumberValid;
    private static int rowLengthValid;

    final String ERROR = "Only positive integers are allowed (from 1 to 2 147 483 647)";

    final String EMPTY_ROW = "The row is empty cause You wished so " +
            "(You must enter only positive integer).";

    Input input = new Input();

    int validateSquareNumber() {
        try {
            squareNumberValid = Integer.parseInt(input.getSquareNumber());
            if (squareNumberValid < 0) {
                squareNumberValid = -1;
            }
            return squareNumberValid;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    int validateRowLength() {
        try {
            rowLengthValid = Integer.parseInt(input.getRowLength());
            if (rowLengthValid < 0) {
                rowLengthValid = -1;
            }
            return rowLengthValid;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public int getSquareNumberValid() {
        return squareNumberValid;
    }

    public int setSquareNumberValid(int squareNumberValid) {
        Validation.squareNumberValid = squareNumberValid;
        return squareNumberValid;
    }

    public int getRowLengthValid() {
        return rowLengthValid;
    }
}