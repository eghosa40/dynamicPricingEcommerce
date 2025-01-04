package org.example;

public class TimeTable {
    private Booking[][] times;

    public TimeTable(){
        times = new Booking[5][7];
    }

    public boolean makeBooking(int day, int period, Booking booking){
        if(day < 0 || day >= times.length && period < 0 || period >= times.length){
            return false;
        }

        if (times[day][period] == null){
            times[day][period] = booking;
            return true;
        }
        else {
            return false;
        }
        /* Challenges doing this included:

         - Remebering the correct syntax for 2D array
         - Involving other classes and making the work together
         - Mostly lack of attention to detail, I got it wrong because I missed key details on the UML diagram
          */
    }

    public boolean cancelBooking(int day, int period){
        if(day < 0 || day >= times.length && period < 0 || period >= times.length){
            return false;
        }

        if (times[day][period] == null){
            return false;
        }
        else {
            times[day][period] =  null;
            return true;
        }
    }

    public boolean isFree(int day, int period){
        if(day < 0 || day >= times.length && period < 0 || period >= times.length){
            return false;
        }

        if(times[day][period] != null){
            return true;
        }
        else {
            return false;
        }
    }

    public Booking getBooking(int day, int period){
        if(day < 0 || day >= times.length && period < 0 || period >= times.length){
            System.out.println("Invalid entry");
            return null;
       }

        Booking booking = times[day][period];
        if ( booking != null){
            System.out.println("Theres a booking for day: " + (day + 1) + " and period: " + (period + 1));
            return times[day][period] = booking;
        }
        else {
            System.out.println("No booking exists for day: " + (day + 1) + " and period: " + (period + 1));
        }
        return booking;
    }

    public int numberOfDays(){
        return times.length;
    }

    public int numberOfPeriods(){
        if (times.length > 0){
            return times[0].length;
        }
        else {
            return 0;
        }
    }
}
