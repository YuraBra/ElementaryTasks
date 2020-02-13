package com.elementary_tasks.the_second_one;

import java.util.InputMismatchException;
import java.util.Scanner;

class EnvelopeComparing {

    Envelope1 envelope1 = new Envelope1();
    Envelope2 envelope2 = new Envelope2();

    void envComparing() throws InputMismatchException {

        if (envelope1.perimeter1() > envelope2.perimeter2()) {
            System.out.println("You can put the second envelope into the first.");
        } else {
            System.out.println("You can put the first envelope into the second.");
        }
    }

    void question() throws InputMismatchException {
        while (true) {
            System.out.println("Do you want to continue? y/yes or no");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("y") ||
                    answer.equalsIgnoreCase("yes")) {
                envComparing();
            } else {
                System.out.println("The program is closing");
                break;
            }
        }
    }
}
