package com.elementary_tasks.seventh;

import java.util.InputMismatchException;
import java.util.Scanner;

class Solver {

    private boolean success;

    void calculate() {
        while (!success) {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the minimum square of the number: ");
                int number = scan.nextInt();
                number = Math.abs(number);
                number = (int) Math.sqrt(number);
                System.out.println("Enter the number of items: ");
                int n = scan.nextInt();
                scan.close();

                for (int i = 0; i < n; i++) {
                    System.out.print(number++);

                    if (i < n - 1) {
                        System.out.print(", ");
                    }
                }
                success = true;
            } catch (InputMismatchException e) {
                System.out.println("Only integers are allowed");
            }
        }
    }
}
