package ml.bstevary;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
//567788667

    Scanner scanned = new Scanner(System.in);
            System.out.print("Enter a number");
    int number = scanned.nextInt();
            if (number%5== 0&& number%3==0)
            System.out.println("fizzbuzz");
            else if (number%5 == 0)
            System.out.println("fizz");
            else if (number%3== 0)
            System.out.println("buzz");
            else
                    System.out.println(number);
    }
}
