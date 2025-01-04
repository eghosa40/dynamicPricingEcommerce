package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void question1() {
        String answer;
        do {
            System.out.println("WELCOME TO CIRCLE MATHS");
            System.out.println();
            System.out.println("Enter the radius: ");
            double r = EasyScanner.nextDouble();

            CircularShape circularShape = new CircularShape(r);

            double area = circularShape.calculateArea();
            double circumference = circularShape.calculateCircumference();
            double diameter = circularShape.calculateDiameter();

            System.out.println("Area is = " + area);
            System.out.println("Circumference is = " + circumference);
            System.out.println("Diameter is = " + diameter);

            System.out.println("Do you want to try again?: y/n ");
            answer = EasyScanner.nextString();
            answer = answer.toLowerCase();
        } while (!answer.equals("n"));
    }

    public static void question2() {
        ArrayList<Student> students = new ArrayList<>();
        String answer;
        char choice;
        do {
            System.out.println("ENTER A STUDENT NUMBER: ");
            String studentNumber = EasyScanner.nextString();

            System.out.println("ENTER A STUDENT NAME: ");
            String studentName = EasyScanner.nextString();

            students.add(new Student(studentNumber, studentName));

            System.out.println("Do you want to add another student?: y/n");
            answer = EasyScanner.nextString();
            answer = answer.toLowerCase();
        } while (!answer.equals("n"));


        do {
            System.out.println("WHAT STUDENT DO YOU WANT? ENTER THE STUDENTS ID: ");
            int studentId = EasyScanner.nextInt();
            studentId -= 1;

            System.out.println("WHAT ACTION DO YOU WANT TO COMPLETE");
            System.out.println("1. ENTER MARKS");
            System.out.println("2. CALCULATE AVERAGE MARKS");
            System.out.println("3. Quit");

            choice = EasyScanner.nextChar();

            switch (choice) {
                case '1':
                    System.out.println("ENTER MARKS FOR ENGLISH: ");
                    int englishMarks = EasyScanner.nextInt();
                    System.out.println("ENTER MARKS FOR MATHS: ");
                    int mathsMarks = EasyScanner.nextInt();
                    System.out.println("ENTER MARKS FOR SCIENCE: ");
                    int scienceMarks = EasyScanner.nextInt();

                    students.get(studentId).enterMarks(englishMarks, mathsMarks, scienceMarks);
                    break;

                case '2':
                    students.get(studentId).calculateAverageMark();
                    break;

                case '3':
                    break;

                default:
                    System.out.println("Invalid entry, try again!");
            }
        } while (choice != 3);
    }

    public static void question3() {
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        String tempNumber;
        String tempName;
        double tempPrice;

        System.out.print("Enter the stock number: ");
        tempNumber = keyboardString.nextLine();
        tempName = keyboardString.nextLine();
        System.out.print("Enter the price of the item: ");
        tempPrice = keyboard.nextDouble();

        // Create a new item of stock using the values that were entered by the user
        StockItem item = new StockItem(tempName, tempNumber, tempPrice);

        // Increase the total number of items in stock by 5
        item.increaseTotalStock(5);

        // Display the stock number
        System.out.println(item.getStockNumber());

        // Display the total price of all items in stock
        System.out.println(item.calculateTotalPrice());

        // Write a line of code that sets the sales tax for all objects of the class to 10 without referring to any particular object.
        StockItem.setSalesTax(10);
    }

    public static void question4() {
        System.out.println("Enter a number: ");
        double pressure = EasyScanner.nextDouble();

        Sensor sensor = new Sensor(pressure);

        System.out.println("Here is the sensor object with the pressure variable you have created: " + sensor.getPressure());
    }
}
