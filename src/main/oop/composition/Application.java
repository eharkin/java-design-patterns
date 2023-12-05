package main.oop.composition;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat(34, "Tess");
        //using composition
        Person per1 = new Person("Emm");
        per1.setPet(cat);
        System.out.printf("Person's Name %s, The Pets Detail is: %s", per1.getName(), per1.getPet().getName());
    }
}
