import java.util.ArrayList;

class EasyWay {

    int easyWayCalc() throws IndexOutOfBoundsException {

        ArrayList<Integer> luckyNumbersArray = new ArrayList<>();
        Ticket ticket = new Ticket();
        ticket.ticket();

        for (int i = ticket.ticketNumbersArray.get(0); i <=
                ticket.ticketNumbersArray.get(ticket.ticketNumbersArray.size() - 1); i++) {
            int sumLast3Digits = (i % 10) + ((i / 10) % 10) +
                    ((i / 100) % 10); //6-5-4 --числа массива
            int sumFirst3Digits = ((i / 1000) % 10) + ((i / 10000) % 10)
                    + ((i / 100000) % 10); //3-2-1 --числа массива
            if (sumLast3Digits == sumFirst3Digits) {
                luckyNumbersArray.add(i);//добавляем счастливые билеты в новый массив
            }
        }
        if (luckyNumbersArray.size() == 0) {
            System.out.println("There are no lucky tickets in the given range ;-(" +
                    "You must try again!");
        }

        return luckyNumbersArray.size();
    }
}