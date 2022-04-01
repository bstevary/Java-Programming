package ml.bstevary;

import java.util.Scanner;

public class PowerManager {

    final  static int POWERLIMIT=1200,COST_1_30_MIN=10,COST_AFTER_30_MIN=5;
    public static void main(String[] args) {
        int A,B,C,timeA,timeB,timeC,results,totalTime;


        Scanner read=new Scanner(System.in);
        while (true){
        System.out.print("Enter the rate of Bulb A:");
        A=read.nextInt();
        if (A>=1&&A<1200)
            break;
            System.out.println("The rating should be between 1 and 1200... kindly recheck your inputs");
        }
        while (true){
            System.out.print("Enter the rate of Bulb B:");
            B=read.nextInt();
            if (B>=1&&B<1200)
                break;
            System.out.println("The rating should be between 1 and 1200... kindly recheck your inputs");
        }
        while (true){
            System.out.print("Enter the rate of Bulb C:");
            C=read.nextInt();
            if (C>=1&&C<1200)
                break;
            System.out.println("The rating should be between 1 and 1200... kindly recheck your inputs");
        }
        //time for devices

        timeA=calculator(A);
        timeB=calculator(B);
        timeC=calculator(C);
        System.out.println(timeA+""+timeB+""+timeC);

    }
    static int calculator(int a){

        int results=POWERLIMIT/a;
        return results ;
    }

}
