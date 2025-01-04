package org.example;

public class TimeTableTest {
    public static void main(String[] args) {
        TimeTable times = new TimeTable();
        int day;
        int period;
        char choice;
        String room;
        String name;

        do {
            System.out.println("BOOK EQUIPMENT NOW");
            System.out.println("SELECT 1 TO MAKE A BOOKING");
            System.out.println("SELECT 2 TO CANCEL A BOOKING");
            System.out.println("SELECT 3 TO CHECK AVAILABILITY");
            System.out.println("SELECT 4 TO SEE A BOOKINGS DETAILS");
            System.out.println("SELECT 5 TO SEE THE NUMBER OF BOOKABLE DAYS");
            System.out.println("SELECT 6 TO SEE THE NUMBER OF BOOKABLE PERIODS");
            System.out.println("SELECT 7 TO QUIT");
            System.out.println("PICK A NUMBER FROM 1-7: ");

            choice = EasyScanner.nextChar();

            switch (choice)
            {
                case '1':
                    System.out.println("Choose a day: ");
                    day = EasyScanner.nextInt() - 1;
                    System.out.println("Choose a period: ");
                    period = EasyScanner.nextInt() - 1;

                    System.out.println("Enter the room: ");
                    room = EasyScanner.nextString();
                    System.out.println("Enter the name: ");
                    name = EasyScanner.nextString();

                    Booking booking = new Booking(room, name);
                    if (times.makeBooking(day, period, booking)) {
                        System.out.println("Booking successfully made!");
                    } else {
                        System.out.println("Booking failed. The slot might already be taken.");
                    }
                    break;

                case '2':
                    System.out.println("Choose a day: ");
                    day = EasyScanner.nextInt() - 1;
                    System.out.println("Choose a period: ");
                    period = EasyScanner.nextInt() - 1;

                    times.cancelBooking(day, period);
                    break;

                case '3':
                    System.out.println("Choose a day: ");
                    day = EasyScanner.nextInt() - 1;
                    System.out.println("Choose a period: ");
                    period = EasyScanner.nextInt() - 1;

                    if(times.isFree(day, period)){
                        System.out.println("The slot if free");
                    }else {
                        System.out.println("The slot is already booked");
                    }

                    break;

                case '4':
                    System.out.println("Choose a day: ");
                    day = EasyScanner.nextInt() - 1;
                    System.out.println("Choose a period: ");
                    period = EasyScanner.nextInt() - 1;

                    Booking retrievedBooking = times.getBooking(day, period);
                    if (retrievedBooking != null){
                        System.out.println("Booking slot taken for room: " + retrievedBooking.getRoom() + " and under the name: " + retrievedBooking.getName());
                    }
                    else {
                        System.out.println("No booking exists at the specified slot.");
                    }
                    break;

                case '5':
                    System.out.println("Number of bookable days: " + times.numberOfDays());
                    break;

                case '6':
                    System.out.println("Number of bookable periods: " + times.numberOfPeriods());
                    break;

                case '7': break;

                default:
                    System.out.println("INVALID ENTRY!");
            }
        }while(choice != '7');
    }
}
