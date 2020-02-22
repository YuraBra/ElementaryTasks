package com.elementary_tasks.seventh;

import java.util.ArrayList;

class Solver {
    Input input = new Input();
    Validation validation = new Validation();

    ArrayList<Integer> calculate() {
        ArrayList<Integer> myArray = new ArrayList<>();
        if (validation.validateSquareNumber() == -1 || validation.validateRowLength() == -1) {
            System.out.println(validation.getERROR());
        } else if (input.getRowLength() == 0) {
            System.out.println(validation.getEMPTY_ROW());
        } else {
            input.setSquareNumber((int) Math.sqrt(input.getSquareNumber()));
            int a = input.getSquareNumber();
            myArray.add(a);
            for (int i = 0; i < input.getRowLength() - 1; i++) {
                input.setSquareNumber(input.getSquareNumber() + 1);
                myArray.add(input.getSquareNumber());
            }
            System.out.print(myArray);
        }
        return myArray;
    }
}
