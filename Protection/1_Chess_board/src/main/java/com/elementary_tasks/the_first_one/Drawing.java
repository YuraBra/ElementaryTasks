package com.elementary_tasks.the_first_one;

import java.util.ArrayList;

class Drawing {
    final String EMPTY_SPACE = " ";
    final String ASTERISKS = "* ";
    final String NEXT_LINE = "\n";

    Validation validation = new Validation();
    ArrayList<String> drawArray = new ArrayList<String>();

    ArrayList<String> draw() {
        for (int j = 0; j < validation.getValidHeight(); j++) {
            if ((j + 1) % 2 == 0) {
                drawArray.add(EMPTY_SPACE);
            }
            for (int i = 0; i < validation.getValidWidth(); i++) {
                drawArray.add(ASTERISKS);
            }
            drawArray.add(NEXT_LINE);
        }
        return drawArray;
    }
}
