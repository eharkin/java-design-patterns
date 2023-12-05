package main.oop.composition;

// composition provides stronger bonding than aggreation its a has-a/part of relationship
// composition means that you have an instance of a class inside a class
public class Person {
    private String name;
    // A Person has a pet
    private Pet pet;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
