class CompareCalcWays {

    void output() {

        EasyWay easyWay = new EasyWay();
        HardcoreWay hardcoreWay = new HardcoreWay();
        Ticket ticket = new Ticket();
        try {
            int easy = easyWay.easyWayCalc();
            int hard = hardcoreWay.hardcoreWayCalc();

            if (easy > hard) {
                System.out.println("First calculation method is the winner. \n"
                        + easy + " - first method lucky tickets number. \n"
                        + hard + " - second method lucky tickets number.");
            } else if (easy == hard) {
                System.out.println("First calculation method equals Second calculation method. \n"
                        + easy + " - first method lucky tickets number. \n"
                        + hard + " - second method lucky tickets number.");
            } else {
                System.out.println("Second calculation method is the winner. \n"
                        + easy + " - first method lucky tickets number. \n"
                        + hard + " - second method lucky tickets number.");
            }
        } catch (IndexOutOfBoundsException e) {

            System.out.println("Enter the valid data.");

        }
    }
}

