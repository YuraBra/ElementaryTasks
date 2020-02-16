import java.util.ArrayList;

class HardcoreWay {

    int hardcoreWayCalc() throws IndexOutOfBoundsException {

        ArrayList<Integer> luckyEvenNumbersArray = new ArrayList<>();
        Ticket ticket = new Ticket();
        ticket.ticket();

        for (int i = ticket.ticketNumbersArray.get(0); i <=
                ticket.ticketNumbersArray.get(ticket.ticketNumbersArray.size() - 1); i++) {
            int sumEvenDigits = (i % 10) + ((i / 100) % 10) + ((i / 10000) % 10); //6-4-2 --числа массива
            int sumNotEvenDigits = ((i / 10) % 10) + ((i / 1000) % 10) + ((i / 100000) % 10); //5-3-1 --числа массива
            if (sumEvenDigits == sumNotEvenDigits) {
                luckyEvenNumbersArray.add(i);//добавляем счастливые билеты в новый массив
            }
        }
        if (luckyEvenNumbersArray.size() == 0) {
            System.out.println("There are no lucky tickets in the given range ;-(" +
                    "You must try again!");
        }

        return luckyEvenNumbersArray.size();
    }
}



