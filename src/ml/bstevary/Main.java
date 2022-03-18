package ml.bstevary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    long timeInSeconds;
    int  sec, min, hour, days, month, year;
    sec = min = hour = days = month = year = 0;
    final int SECONDS_IN_AN_MINUTE = 60;
    final int SECONDS_IN_AN_HOUR = SECONDS_IN_AN_MINUTE * 60;
    final int SECONDS_IN_AN_DAY = SECONDS_IN_AN_HOUR * 24;
    final int SECONDS_IN_AN_MONTH = SECONDS_IN_AN_DAY * 30;
    final int SECONDS_IN_AN_YEAR = SECONDS_IN_AN_MONTH * 12;
    Scanner read = new Scanner(System.in);
        System.out.print("Enter time in seconds:");
    timeInSeconds = read.nextInt();
    /*calculator*/

    long i = timeInSeconds;
        while (true){

        if (i > SECONDS_IN_AN_YEAR) {
            year++;
            i = i-SECONDS_IN_AN_YEAR;
        } else if (i > SECONDS_IN_AN_MONTH) {
            month++;
            i -= SECONDS_IN_AN_MONTH;
        } else if (i > SECONDS_IN_AN_DAY) {
            days++;
            i -= SECONDS_IN_AN_DAY;
        } else if (i > SECONDS_IN_AN_HOUR) {
            hour++;
            i -= SECONDS_IN_AN_HOUR;
        } else if (i > SECONDS_IN_AN_MINUTE) {
            min++;
            i -= SECONDS_IN_AN_MINUTE;
        } else if (i<60){
            sec=(int) i;
            break;
        }

    }
        System.out.println( timeInSeconds+" seconds recorded is equal to :\n" + year + " years" +
            " "  + month+ " months" + " " + days + " days" + " " + hour + " hours"
            + " " + min +" minutes "+ " " + sec+" seconds");


}
}
