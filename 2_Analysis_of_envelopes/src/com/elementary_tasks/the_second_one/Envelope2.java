package com.elementary_tasks.the_second_one;

import java.util.InputMismatchException;
import java.util.Scanner;

class Envelope2 {

    private double side_c;
    private double side_d;

    double perimeter2() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side_c: ");
        double side_c = scanner.nextDouble();
        System.out.println("Enter side_d: ");
        double side_d = scanner.nextDouble();
        if (side_c <= 0 | side_d <= 0) {
            System.out.println("You must enter the number > 0");
            return perimeter2();
        }
        double per2 = 2 * (side_c + side_d);
        return per2;
    }
}

