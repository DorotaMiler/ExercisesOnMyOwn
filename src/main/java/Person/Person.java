package Person;

import java.util.UUID;

public class Person extends Mammal{
    private String name;
    private String surname;
    private String id;

//    Person(){
//        System.out.println("Konstruktor bezargumentowy person");
//    }

    Person() {
        id = UUID.randomUUID().toString();
        System.out.println(id);
    }

    Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

