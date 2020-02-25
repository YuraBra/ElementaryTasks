package com.eT.seven;

import java.util.ArrayList;

class Solver {

    Input input = new Input();
    Validation validation = new Validation();
    private ArrayList<Integer> myArray = new ArrayList<Integer>();

    ArrayList<Integer> calculate() {

        validation.setSquareNumberValid((int) Math.sqrt(validation.getSquareNumberValid()));
        int a = validation.getSquareNumberValid();
        myArray.add(a);
        for (int i = 0; i < validation.getRowLengthValid() - 1; i++) {
            validation.setSquareNumberValid(validation.getSquareNumberValid() + 1);
            myArray.add(validation.getSquareNumberValid());
        }
        return myArray;
    }

    public ArrayList<Integer> getMyArray() {
        return myArray;
    }

    public void setMyArray(ArrayList<Integer> myArray) {
        this.myArray = myArray;
    }
}