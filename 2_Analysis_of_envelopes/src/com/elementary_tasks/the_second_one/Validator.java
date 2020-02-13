package com.elementary_tasks.the_second_one;

import java.util.InputMismatchException;

class Validator {

    static void valid() {
        EnvelopeComparing envelopeComparing = new EnvelopeComparing();
        try {
            envelopeComparing.envComparing();
            envelopeComparing.question();
        } catch (InputMismatchException e) {
            System.out.println("You've typed the characters, You must enter only numbers. " +
                    "Don't play with me, I'm watching You!");
        }
    }
}
