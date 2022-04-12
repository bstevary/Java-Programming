package ml.bstevary;

import java.util.Scanner;

public class SmartPowerManager {
    static int A,B,C;
    final  static int  MIN_PER_HOUR=60, COST_1_30_MIN=10,COST_AFTER_30_MIN=5;
   static int MITERLIMIT =1200,totalBilling,billing4A,billing4B,billing4C;
   static int time4A,time4B,time4C;


    public static void main(String[] args)
    {
        float timeAHrs,timeBHrs,timeCHrs,lastTime;

           inputs();
           calculator();
           timeAHrs=toHours(time4A);
             timeBHrs=toHours(time4B);
            timeCHrs=toHours(time4A);

            billing4A=billing(time4A);
            billing4B=billing(time4B);
            billing4C=billing(time4C);
            totalBilling=billing4A+billing4B+billing4C;


        System.out.println("Device A will be off after"+" "+timeAHrs+" hours");
        System.out.println("Device B will be off after"+" "+timeBHrs+" hours");
        System.out.println("Device C will be off after"+" "+timeCHrs+" hours");
        System.out.println("###############################################");
        lastTime=timeCHrs>(timeAHrs>timeBHrs?timeAHrs:timeBHrs)?timeCHrs:(timeAHrs>timeBHrs?timeAHrs:timeBHrs);
        System.out.println("After"+" "+lastTime+" hours all devices will be off");
        System.out.println("###############################################");

        System.out.println("You will pay Ksh."+billing4A+" for powering device A");
        System.out.println("You will pay Ksh."+billing4B+" for powering device B");
        System.out.println("You will pay Ksh."+billing4C+" for powering device C");
        System.out.println("###############################################");

        System.out.println("So you will have to pay Ksh."+totalBilling+" for power");
        System.out.println("###############################################");

    }
    static int billing(int timeInMin){
        int billing=0;
        if (timeInMin>=30)
            billing=COST_1_30_MIN*30;
        if (timeInMin>30)
            billing+=COST_AFTER_30_MIN*(timeInMin-30);
        if (timeInMin<30)
            billing=timeInMin*COST_1_30_MIN;
        return billing;

    }
    static float toHours(int timeInMin) {
        return (float) timeInMin / MIN_PER_HOUR;
    }

    static void calculator(){
        time4A=time4B=time4C=0;
        while (MITERLIMIT>0){
            if (MITERLIMIT>=A){
               MITERLIMIT= MITERLIMIT - A;
               time4A++;
                System.out.println(MITERLIMIT);
            }

            if (MITERLIMIT>=B){
                MITERLIMIT=MITERLIMIT-B;
                time4B++;
                System.out.println(MITERLIMIT);
            }

            if (MITERLIMIT>=C){
                MITERLIMIT=MITERLIMIT-C;
                time4C++;
                System.out.println(MITERLIMIT);
                System.out.println("###############");
            }

            if (MITERLIMIT<A&&MITERLIMIT<B&&MITERLIMIT<C)
                break;

            System.out.println("iam not terminatiing");
        }

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
        }}
}
