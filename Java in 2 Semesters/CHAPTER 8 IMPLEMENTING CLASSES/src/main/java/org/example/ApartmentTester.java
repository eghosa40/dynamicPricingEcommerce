package org.example;

import java.util.Scanner;

public class ApartmentTester {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(); // Create an Apartment object
        Scanner scanner = new Scanner(System.in); // Use Scanner for user input

        char choice;
        System.out.println("WELCOME TO MY HOTEL");

        do {
            System.out.println();
            System.out.println("1. Create new room");
            System.out.println("2. Get room area");
            System.out.println("3. Get room length");
            System.out.println("4. Get room height");
            System.out.println("5. Quit");
            System.out.println();
            System.out.print("Enter choice [1-5]: ");

            // Get choice from user
            choice = scanner.next().charAt(0);
            System.out.println();

            // Process menu options
            switch (choice) {
                case '1': // Create new room
                    System.out.print("Enter the length of the room: ");
                    double length = scanner.nextDouble();

                    System.out.print("Enter the height of the room: ");
                    double height = scanner.nextDouble();

                    Oblong room = new Oblong(length, height);
                    apartment.add(room); // Add the room to the apartment
                    System.out.println("Room created and added successfully!");
                    break;

                case '2': // Get room area
                    System.out.print("Enter room number: ");
                    int roomNumberArea = scanner.nextInt();
                    double area = apartment.getRoomArea(roomNumberArea);
                    if (area == -999) {
                        System.out.println("Invalid room number!");
                    } else {
                        System.out.println("Room Area: " + area);
                    }
                    break;

                case '3': // Get room length
                    System.out.print("Enter room number: ");
                    int roomNumberLength = scanner.nextInt();
                    double roomLength = apartment.getRoomLength(roomNumberLength);
                    if (roomLength == -999) {
                        System.out.println("Invalid room number!");
                    } else {
                        System.out.println("Room Length: " + roomLength);
                    }
                    break;

                case '4': // Get room height
                    System.out.print("Enter room number: ");
                    int roomNumberHeight = scanner.nextInt();
                    double roomHeight = apartment.getRoomHeight(roomNumberHeight);
                    if (roomHeight == -999) {
                        System.out.println("Invalid room number!");
                    } else {
                        System.out.println("Room Height: " + roomHeight);
                    }
                    break;

                case '5': // Quit
                    System.out.println("Thank you for using the Hotel Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid entry. Please choose between 1 and 5.");
            }
        } while (choice != '5');

        scanner.close();
    }
}
