package ml.bstevary;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int number, factorial=1;
        number=read.nextInt();
        for (int i = 1; i <=number; i++) {
           factorial*=i;

        }
        System.out.println(factorial);
    }
}
