import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static boolean success;

    public static void main (String []args){

        while (!success){

            System.out.println("Введите целое число в диапазоне от -9223372036854775808 до 9223372036854775807");
            try {
                Scanner scan = new Scanner(System.in);
                long number = scan.nextLong();

                RuleBasedNumberFormat format = new RuleBasedNumberFormat(Locale.forLanguageTag("ru"),
                        RuleBasedNumberFormat.SPELLOUT);
                System.out.println(format.format(number));
                success = true;
            }
            catch (InputMismatchException e) {
                System.out.println("Допускается ввод только целых чисел");
            }
        }
    }
}

