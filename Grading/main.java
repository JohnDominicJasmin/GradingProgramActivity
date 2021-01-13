/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asd123;

import java.util.Scanner;

/**
 *
 * @author micojasmin
 */
public class Grading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result;
        double prelim = 30.0;
        double midterm = 30.0;
        double finals = 40.0;
        
        Scanner scan = new Scanner(System.in);
        // this gets the input 
        try{
        System.out.println("\t \t \t Grading System\n \n");
        
        System.out.print("Name:");
        String studentName = scan.nextLine();
        
        System.out.print("Number:");
        int studentnumber = scan.nextInt();
        
        System.out.print("Course:");
        String course = scan.next();
        
       
        System.out.print("Age:");
        int age = scan.nextInt();
        
        System.out.print("Prelim Grade:");
        int PrelimGrade = scan.nextInt();
        
         System.out.print("MidTerm Grade:");
        int MidTermGrade = scan.nextInt();
        
         System.out.print("Final  Grade:");
        int FinalGrade = scan.nextInt();
            System.out.println("\n \n");
         
        double pGrade = prelim*PrelimGrade/100;
        double mGrade = midterm*MidTermGrade/100;
        double fGrade = finals*FinalGrade/100;
        
        double FINALGRADE = pGrade+mGrade+fGrade*100/100;
        
        if(FINALGRADE>=75){
            result = "Passed";
        }else{
            result = "Failed";
        }
            System.out.printf("Student Name: %s\n",studentName);
             System.out.printf("Student Number: %d\n",studentnumber);
              System.out.printf("Student Course: %s\n",course);
                System.out.printf("Student Age: %d\n",age);
                    System.out.printf("Final Grade: %.2f",FINALGRADE);
                    System.out.println("%");
                    System.out.printf("Result: %s\n",result);
        
        
        
        
        
        
        
        
        
        
        
        }catch(Exception e){}
        
        
        
    }
    
}
