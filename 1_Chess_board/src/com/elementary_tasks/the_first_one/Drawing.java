package com.elementary_tasks.the_first_one;

class Drawing {
    private final String EMPTY_SPACE = " ";
    private final String ASTERISKS = "* ";
    private final String NEXT_LINE = "\n";


    Specified specified = new Specified();
    Validation validation = new Validation();

    void draw() {
        if (validation.validateHeight() == 0 || validation.validateWidth() == 0) {
            System.out.println(validation.getERROR());
        } else {
            for (int j = 0; j < specified.getHeight(); j++) {
                if ((j + 1) % 2 == 0) {
                    System.out.print(EMPTY_SPACE);
                }
                for (int i = 0; i < specified.getWidth(); i++) {
                    System.out.print(ASTERISKS);
                }
                System.out.print(NEXT_LINE);
            }
        }
    }
}
