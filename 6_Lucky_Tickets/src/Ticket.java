import java.util.*;

class Ticket {

    ArrayList<Integer> ticketNumbersArray = new ArrayList<>();

    ArrayList<Integer> ticket() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Min ticket number (only 6 integer digits allowed)");
        try {
            int numberMin = scan.nextInt();
            System.out.println("Enter the Max ticket number (only 6 integer digits allowed)");
            int numberMax = scan.nextInt();
            int numberLengthMin = String.valueOf(numberMin).length();
            int numberLengthMax = String.valueOf(numberMax).length();

            if (numberLengthMin == 6 && numberLengthMax == 6) {
                for (int i = numberMin; i <= numberMax; i++) {
                    ticketNumbersArray.add(i);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("The entry conditions were not satisfied." +
                    " It’s your fault that the program closes.");
        }
        return ticketNumbersArray;
    }
}