package com.peace.celsius.com;

import java.util.Scanner;

public class Celsius {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the celsius to be calculated: ");
        double Celcius = sc.nextDouble();
        double ForeHeight  = Fahr(Celcius);
        System.out.println(Celcius + " Celsius is equals to " + ForeHeight);
    }
    public static double Fahr(double Celsius){
        return Celsius * 1.8 * Celsius + 32;

    }
}
