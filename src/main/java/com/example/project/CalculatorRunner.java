package com.example.project;
import java.util.Scanner;


public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //test your program here
        //1. create an instance of the calculator class
        Calculator Babar = new Calculator("TI84");
        //2. call any methods of that class to test
        System.out.println("Hello! Welcome to Java Calculations!");
        System.out.println("Please enter + - * or / to add, subtract, multiply or divide.");
        String operand = scan.nextLine();
        System.out.println("Enter your two integers: ");
        int num1 = scan.nextInt();
        scan.nextLine();
        int num2 = scan.nextInt();
        scan.nextLine();
        System.out.println("The result of " + num1 + " " + operand + " " + num2 + " is " + Babar.performOperation(operand, num1, num2));


        System.out.println("Enter two numbers that you would like to check for their divisibility.");
        int divisible1 = scan.nextInt();
        scan.nextLine();
        int divisible2 = scan.nextInt();
        scan.nextLine();
        System.out.println(divisible1 + " is divisible by " + divisible2 + ": " + Babar.divisibleBy(divisible1, divisible2));


        System.out.println("Enter an x and a y coordinate.");
        int x = scan.nextInt();
        scan.nextLine();
        int y = scan.nextInt();
        scan.nextLine();
        System.out.println(Babar.coordinatePair(x, y));


        System.out.println("Enter two numbers you would like to subtract, and we will return the absolute value of the subtraction.");
        int absValue1 = scan.nextInt();
        scan.nextLine();
        int absValue2 = scan.nextInt();
        scan.nextLine();
        System.out.println("The absolute value of " + absValue1 + " - " + absValue2 + " is " + Babar.absoluteValue(absValue1, absValue2));


        System.out.println(Babar.info());
       
        scan.close();
    }
}
