package ml.bstevary;

import java.util.Scanner;

public class ParkingAsst {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        final int AREA_4_SMALL=20*15,AREA_4_BIG=40*15,PARKING_AREA=400*150;
        int noBigCars,noSmallCars,space4Big,space4Small,space,moreSpace,moreSmallCars;
        System.out.print("Enter the number of Big Cars:");
        noBigCars=read.nextInt();
        System.out.print("Enter the number of Small Cars:");
        noSmallCars=read.nextInt();
        space4Big=noBigCars*AREA_4_BIG;
        space4Small=AREA_4_SMALL*noSmallCars;
        space=space4Big+space4Small;

        if (space>PARKING_AREA) {
            moreSpace = space - PARKING_AREA;
            System.out.println("no more space");
            System.out.println("you need " + " " + moreSpace+"cm Square");
        }
        if (space<PARKING_AREA) {
            moreSpace = PARKING_AREA - space;
            moreSmallCars=moreSpace/AREA_4_SMALL;
            System.out.println("There is a remaining space which could accommodates " + "" +moreSmallCars+ " more Small Cars");
        }

        if (space==PARKING_AREA) {
            System.out.println("Space fit the provide cars, there is no more space");
        }


    }
}
