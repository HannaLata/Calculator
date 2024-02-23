package org.example.shelter;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Shelter {
    private final List<Pet> pets = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public void addPet() {
        System.out.println("Enter details of the new pet:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Breed: ");
        String breed = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        pets.add(new Pet(name, breed, age));
        System.out.println("Pet added to the shelter.");
    }

    public void showAllPets() {
        if (pets.isEmpty()) {
            System.out.println("The shelter is empty.");
        } else {
            System.out.println("Pets in the shelter:");
            for (int i = 0; i < pets.size(); i++) {
                System.out.println((i + 1) + ". " + pets.get(i));
            }
        }
    }

    public void takePetFromShelter() {
        showAllPets();
        if (!pets.isEmpty()) {
            System.out.print("Choose the number of the pet you want to remove: ");
            try {
                int index = scanner.nextInt();
                if (index >= 1 && index <= pets.size()) {
                    Pet removedPet = pets.remove(index - 1);
                    System.out.println("Pet " + removedPet.getName() + " removed from the shelter.");
                } else {
                    System.out.println("Invalid pet number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid pet number.");
                scanner.nextLine();
            }
        }
    }

    public void savePetsToFile() {
        System.out.println("Saving pets to file...");
    }
}
