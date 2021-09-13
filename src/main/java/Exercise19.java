/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;
import java.lang.*;

public class Exercise19 {
    public static void main(String[] args){

        int  height = 0, weight = 0;
        String temp = "n";
        boolean check = false;
        double bmi = 0;
        double bmiMin = 18.5, bimMax = 25;
        Scanner scnr = new Scanner(System.in);

        while(!check){
            System.out.println("What is your height, in inches?");
            temp = scnr.next();

            if(checkNumericValue(temp) == true ){
                check = true;
                height = Integer.parseInt(temp);
            }
        }

        check = false;
        while(!check){
            System.out.println("What is your weight, in pounds?");
            temp = scnr.next();

            if(checkNumericValue(temp) == true ){
                check = true;
                weight = Integer.parseInt(temp);
            }
        }

        bmi = (weight / (height * weight)) * 703;

        System.out.printf("Your BMI is %.1f \n", bmi);

        if(bmi > bimMax){
            System.out.println("You are overweight. You should see your doctor");
        }
        else if(bmi < bmiMin)
        {
            System.out.println("You are underweight. You should see your doctor");
        }
        else{
            System.out.println("You are within the ideal weight range.");
        }

        scnr.close();
        System.exit(0);
    }//end of main

    public static boolean checkNumericValue(String value){

        for(int i = 0; i < value.length(); i++){
            if(!Character.isDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

}//end of program




