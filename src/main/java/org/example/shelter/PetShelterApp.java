package org.example.shelter;

import java.util.Scanner;

public class PetShelterApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Shelter shelter = new Shelter();

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add a pet");
            System.out.println("2. Show all pets");
            System.out.println("3. Take a pet from the shelter");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    shelter.addPet();
                    break;
                case 2:
                    shelter.showAllPets();
                    break;
                case 3:
                    shelter.takePetFromShelter();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        shelter.savePetsToFile();
        System.out.println("Thank you for using the Pet Shelter App!");
        scanner.close();
    }
}
