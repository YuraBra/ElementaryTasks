import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
   static boolean success;
    public static void main (String []args){
while(!success) {
    try {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите высоту:");
        int height = scan.nextInt();
        System.out.println("Введите ширину:");
        int width = scan.nextInt();
        for (int j = 0; j < height; j++) {
            if ((j + 1) % 2 == 0) {
                System.out.print(" ");
            }
            for (int i = 0; i < width; i++) {
                System.out.print("* ");
            }
            System.out.println("");
            success=true;
        }
    } catch (InputMismatchException e) {
        System.out.println("Введите натуральное число");
    }
}
    }
}