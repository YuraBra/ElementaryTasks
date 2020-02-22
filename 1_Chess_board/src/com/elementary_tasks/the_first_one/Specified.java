package com.elementary_tasks.the_first_one;

import java.util.Scanner;

class Specified {
    private static int height;
    private static int width;
    private final String HIGH = "Enter height:";
    private final String WIDE = "Enter width:";

    Scanner scan = new Scanner(System.in);

    int height() {
        System.out.println(HIGH);
        height = scan.nextInt();
        return height;
    }

    int width() {
        System.out.println(WIDE);
        width = scan.nextInt();
        scan.close();
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        Specified.height = height;
    }

    public void setWidth(int width) {
        Specified.width = width;
    }
}
