package com.elementary_tasks.the_second_one;

import java.util.InputMismatchException;
import java.util.Scanner;

class Envelope1 {

    private double side_a;
    private double side_b;

    double perimeter1() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side_a: ");
        double side_a = scanner.nextDouble();
        System.out.println("Enter side_b: ");
        double side_b = scanner.nextDouble();
        if (side_a <= 0 | side_b <= 0) {
            System.out.println("You must enter the number > 0");
            return perimeter1();
        }
        double per1 = 2 * (side_a + side_b);
        return per1;
    }
}

