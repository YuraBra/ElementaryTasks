package com.eT.seven;

import java.util.Scanner;

class Input {

    private static String squareNumber;
    private static String rowLength;
    final String SQUARE = "Enter the minimum square of the number: ";
    final String ITEMS_NUMBER = "Enter the number of items: ";

    Scanner scan = new Scanner(System.in);

    String squareNumber() {
        System.out.println(SQUARE);
        squareNumber = scan.nextLine();
        return squareNumber;
    }

    String rowLength() {
        System.out.println(ITEMS_NUMBER);
        rowLength = scan.nextLine();
        scan.close();
        return rowLength;
    }

    public String getSquareNumber() {
        return squareNumber;
    }

    public String getRowLength() {
        return rowLength;
    }

    public String setSquareNumber(String squareNumber) {
        Input.squareNumber = squareNumber;
        return squareNumber;
    }

    public void setRowLength(String rowLength) {
        Input.rowLength = rowLength;
    }
}