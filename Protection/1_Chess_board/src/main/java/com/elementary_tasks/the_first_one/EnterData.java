package com.elementary_tasks.the_first_one;

import java.util.Scanner;

class EnterData {
    private static String height;//без static далее не рисуется доска (идет только прием данных)
    private static String width;
    final String HIGH = "Enter height:";
    final String WIDE = "Enter width:";

    Scanner scan = new Scanner(System.in);

    String height() {
        System.out.println(HIGH);
        height = scan.nextLine();
        return height;
    }

    String width() {
        System.out.println(WIDE);
        width = scan.nextLine();
        scan.close();
        return width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        EnterData.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        EnterData.width = width;
    }
}
