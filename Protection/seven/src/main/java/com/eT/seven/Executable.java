package com.eT.seven;

class Executable {

    void execute() {
        Input input = new Input();
        input.squareNumber();
        input.rowLength();
        Validation validation = new Validation();
        validation.validateSquareNumber();
        validation.validateRowLength();
        Solver solver = new Solver();
        if ((validation.getSquareNumberValid() == -1) || (validation.getRowLengthValid() == -1)
                || (validation.getSquareNumberValid() == 0)) {
            System.out.println(validation.ERROR);
        } else if (validation.getRowLengthValid() == 0) {
            System.out.println(validation.EMPTY_ROW);
        } else {
            solver.calculate();
            System.out.print(solver.getMyArray());
        }
    }
}