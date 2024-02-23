package org.example.shelter;

class Pet {
    private String name;
    private String breed;
    private int age;

    public Pet() {
    }

    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Breed: " + breed + ", Age: " + age;
    }
}
