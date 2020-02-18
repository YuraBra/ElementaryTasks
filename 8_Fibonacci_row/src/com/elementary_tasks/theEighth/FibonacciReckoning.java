package com.elementary_tasks.theEighth;

import java.util.InputMismatchException;
import java.util.Scanner;

class FibonacciReckoning {

    void reckoning() {
        Scanner scan = new Scanner(System.in);
        System.out.println("In order to go to the range selection menu, press 1," +
                " in order to indicate the length of the row, press 2");
        try {
            int choice = scan.nextInt();
            int n0 = 1;
            int n1 = 1;
            int n2;
            if (choice == 1) {
                System.out.println("Enter the minimum value");
                int left = scan.nextInt();
                System.out.println("Enter the maximum value");
                int right = scan.nextInt();
                if (left < 0 || right <= 0) {
                    System.out.println("There are no numbers because you've entered invalid number");
                } else if (left == 1 && right == 1) {
                    System.out.println(n0);
                } else if (left > right) {
                    System.out.println("There are no numbers because you've entered invalid number");
                } else {
                    System.out.println("The Fibonacci number(s) in a given interval is(are):");

                    if (left == 0 || left == 1) {
                        System.out.print(n0 + " " + n1 + " ");
                    }
                    do {
                        n2 = n0 + n1;
                        n0 = n1;
                        n1 = n2;
                        if ((n2 >= left) && (n2 <= right)) {
                            System.out.print(n2 + " ");
                        }
                    }
                    while (n2 <= right);
                }
            }
            if (choice == 2) {
                System.out.println("Enter the row length");
                int length = scan.nextInt();
                if (length <= 0) {
                    System.out.println("There are no numbers because you've entered invalid number");
                } else if (length == 1) {
                    System.out.println(n0);
                } else {
                    System.out.print(n0 + " " + n1 + " ");
                    for (int i = 3; i <= length; i++) {
                        n2 = n0 + n1;
                        System.out.print(n2 + " ");
                        n0 = n1;
                        n1 = n2;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("A-ta-ta, I know that you've entered the letters. The program is closing. Bye.✋");
        }
    }
}