package com.elementary_tasks.the_first_one;

/*1.	Шахматная доска
Вывести шахматную доску с заданными размерами высоты и ширины, по принципу:
*  *  *  *  *  *
  *  *  *  *  *  *
*  *  *  *  *  *
  *  *  *  *  *  */
public class Main {

    public static void main(String[] args) {

        EnterData enterData = new EnterData();
        enterData.height();
        enterData.width();
        Validation validation = new Validation();
        validation.validateHeight();
        validation.validateWidth();
        Drawing drawing = new Drawing();
        if (validation.getValidHeight() <= 0 || validation.getValidWidth() <= 0) {
            System.out.println(validation.ERROR);
        } else {
            drawing.draw();
            String chessBoard = drawing.drawArray.toString()
                    .replace(", ", "")
                    .replace("]", "")
                    .replace("[", "")
                    .trim();
            System.out.print(chessBoard);
        }
    }
}