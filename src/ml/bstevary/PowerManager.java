package ml.bstevary;


import java.util.Scanner;

public class PowerManager {
   static int A,B,C;

    final  static int MITERLIMIT =1200,SEC_PER_HOUR=3600, SEC_PER_MIN=60, COST_1_30_MIN=10,COST_AFTER_30_MIN=5;


    public static void main(String[] ARs) {
        inputs();
       calculator();
    }


    static void calculator(){
        int totalBilling,billing4A,billing4B,billing4C, timeASec,timeBSec ,timeCSec;
        float timeAHrs,timeBHrs ,timeCHrs,lastTime ;
        timeASec= ratingToSec(A);
        timeBSec= ratingToSec(B);
        timeCSec= ratingToSec(C);

        timeAHrs=toHours(timeASec);
        timeBHrs=toHours(timeBSec);
        timeCHrs=toHours(timeCSec);

        lastTime=timeCHrs>(timeAHrs>timeBHrs?timeAHrs:timeBHrs)?timeCHrs:(timeAHrs>timeBHrs?timeAHrs:timeBHrs);

        billing4A=billing(timeASec);
        billing4B=billing(timeBSec);
        billing4C=billing(timeCSec);
        totalBilling=billing4A+billing4B+billing4C;
        System.out.println("Device A will be off after"+" "+timeAHrs+" hours");
        System.out.println("Device B will be off after"+" "+timeBHrs+" hours");
        System.out.println("Device C will be off after"+" "+timeCHrs+" hours");
        System.out.println("###############################################");

        System.out.println("After"+" "+lastTime+" hours all devices will be off");
        System.out.println("###############################################");

        System.out.println("You will pay Ksh."+billing4A+" for powering device A");
        System.out.println("You will pay Ksh."+billing4B+" for powering device B");
        System.out.println("You will pay Ksh."+billing4C+" for powering device C");
        System.out.println("###############################################");

        System.out.println("So you will have to pay Ksh."+totalBilling+" for power");
        System.out.println("###############################################");
    }
    static int billing(int timeInSec){
        int billing=0;
        if (timeInSec>=30)
            billing=COST_1_30_MIN*30;
        if (timeInSec>30)
            billing+=COST_AFTER_30_MIN*(timeInSec-30);
        if (timeInSec<30)
            billing=timeInSec*COST_1_30_MIN;
        return billing;

    }
    static float toHours(int timeSec){
        return (float) timeSec/(SEC_PER_HOUR);
    }
    static int ratingToSec(int rating){
        return (MITERLIMIT *SEC_PER_MIN)/rating;
    }
    static void inputs(){

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

    }
        
}
