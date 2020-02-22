package com.elementary_tasks.the_first_one;

import java.util.InputMismatchException;
import java.util.Scanner;

class ChessBoard {

    private boolean success;
    private static int height;
    private static int width;

    static void dataInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height:");
        height = scan.nextInt();
        System.out.println("Enter width:");
        width = scan.nextInt();
    }

    void calculation() {
        while (!success) {
            try {
                ChessBoard.dataInput();

                for (int j = 0; j < height; j++) {
                    if ((j + 1) % 2 == 0) {
                        System.out.print(" ");
                    }
                    for (int i = 0; i < width; i++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                    success = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a positive integer");
            }
        }
    }
}