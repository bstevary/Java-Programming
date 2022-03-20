package ml.bstevary;

import java.util.Scanner;

public class PrimeNumberAdd {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int upperLimit=0, results = 0,lowerLimit, counter = 0,track;
        /* properly
         * The code is ugly I know  but try to limit myself into using do while loop*/

        do {
            System.out.println("Enter number range and note that upper limit should not be equals or less than lower");
            System.out.print("Enter lower limit :");
            lowerLimit = h.nextInt();
            if (lowerLimit<=1){
                System.out.println("lower limit should not be below 0");
                continue;
            }

            System.out.print("Enter upper limit:");
            upperLimit = h.nextInt();
                  /*  if (upperLimit<=lowerLimit) {
                        System.out.println("upper limit should not be equals or less than lower");
                         continue;
            }*/
            System.out.println("these are the values provided:\n" +
                    "lower limit=" +
                    lowerLimit +
                    "\n" +
                    "upper limit=" +
                    upperLimit);

        } while (upperLimit<=lowerLimit);

        track=lowerLimit;

        for (int i = lowerLimit; i <= upperLimit; i++) {
            track++;
            if (upperLimit % i == 0) {
                counter++;
                results += track;

            }
        }
        System.out.println(results);
        System.out.println("there was " + counter+
                " occurrence of prime numbers");
    }
}
