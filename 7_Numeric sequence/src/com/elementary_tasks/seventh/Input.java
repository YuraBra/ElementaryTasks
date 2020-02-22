package com.elementary_tasks.seventh;

import java.util.Scanner;

public class Input {
    private static int squareNumber;
    private static int rowLength;
    private final String SQUARE = "Enter the minimum square of the number: ";
    private final String ITEMS_NUMBER = "Enter the number of items: ";

    Scanner scan = new Scanner(System.in);

    int squareNumber() {
        System.out.println(SQUARE);
        squareNumber = scan.nextInt();
        return squareNumber;
    }

    int rowLength() {
        System.out.println(ITEMS_NUMBER);
        rowLength = scan.nextInt();
        scan.close();
        return rowLength;
    }

    public int getSquareNumber() {
        return squareNumber;
    }

    public int getRowLength() {
        return rowLength;
    }

    public void setSquareNumber(int squareNumber) {
        Input.squareNumber = squareNumber;
    }

    public void setRowLength(int rowLength) {
        Input.rowLength = rowLength;
    }
}
