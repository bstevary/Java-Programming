package ml.bstevary;

import java.util.Scanner;

public class SimpleGradingSystem {
    public static void main(String[] args) {
            Scanner record = new Scanner(System.in);
            int studentsNo;
            String regNo;
            System.out.print("Enter number of students:");
            studentsNo=record.nextInt();
            int catMarks[] = new int[studentsNo];
            int examMarks[] = new int[studentsNo];
            int totalMarks[]= new int[studentsNo];
            String[] studentName= new String[studentsNo];
            String[] studentGrades= new String[studentsNo];

            for (int i = 0; i < studentsNo; i++) {
                System.out.print("Enter the registration number of student number  "+(i+1)+":");
                regNo= record.next();
                studentName[i]=regNo;

                while (true) {
                    System.out.print("enter cat marks of:" + " "+ studentName[i]+":");
                    catMarks[i] = record.nextInt();
                    if (catMarks[i] <= 30 && catMarks[i] > 0)
                        break;
                    System.out.println(" cat marks should be btw 0 and 30:");

                }
                while (true) {
                    System.out.print("enter final Exams marks of REG NO" + " "+ studentName[i]+":");
                    examMarks[i] = record.nextInt();
                    if (examMarks[i] <= 70 && examMarks[i] > 0)
                        break;
                    System.out.println(" exam marks should be btw 0 and 70:");

                }


            }//OUT OF LOOP
            //grading them

            for (int i = 0; i <studentsNo ; i++) {
                totalMarks[i]=catMarks[i]+examMarks[i];
                if (totalMarks[i] > 69)
                    studentGrades[i]="A";
                else if (totalMarks[i]>59)
                    studentGrades[i]="B";
                else if (totalMarks[i]>49)
                    studentGrades[i]="C";
                else if (totalMarks[i]>39)
                    studentGrades[i]="D";
                else
                    studentGrades[i]="F";


            }//OUT OF
            System.out.print("REG NO." + " " );
            System.out.print("TOTAL MARKS." + " " );
            System.out.print("GRADE." + " \n" );
//SMART PRINTER
            for (int i = 0; i < studentsNo; i++) {
                System.out.print(studentName[i] );
                System.out.print("     ");
                System.out.print(totalMarks[i]);
                System.out.print("            ");
                System.out.print(studentGrades[i]);
                System.out.print("\n");
            }

        }
    }

