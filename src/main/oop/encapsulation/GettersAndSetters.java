package main.oop.encapsulation;

/*
    Hiding data: Users will have no idea how classes are being implemented or stored. ...
    More flexibility: Enables you to set variables as red or write-only. ...
    Easy to reuse: With encapsulation, it's easy to change and adapt to new requirements.

    Encapsulation protects an object from unwanted access by clients.
    Encapsulation allows access to a level without revealing the complex details below that level.
    It reduces human errors
 */
public class GettersAndSetters {

    // encapulating the class members so the outside world doen't get this information known as data hiding/information hiding.
    // other example would be creating a library and software develoeprs only calling the interface method and keeping the implemtnation away from the rest is encapulation aswell.

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // we can provide some validation if we are too expose this public
        if(age == 5) {
            this.age = age;
        }
    }


}
