package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean calculateAnother = true;
	        final double VAT = 0.2;
            double VATextraPrice = 0;
        while (calculateAnother == true){
            System.out.println("Enter an amount");
            double userPrice = input.nextDouble();
            VATextraPrice = userPrice * VAT;
            System.out.println(userPrice + VATextraPrice + " is your final value");
            System.out.println("Would you like to calculate another?    Y/N");
            String userAnswer = input.next();
            if (userAnswer == "N"){
                calculateAnother = false;
            }
            if (userAnswer == "Y"){
                calculateAnother = true;
            }
            else{
                calculateAnother = false;
            }
        }
    }
}
