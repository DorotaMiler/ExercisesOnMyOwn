package Person;

import Person.Person;

public class Student extends Person{

    @Override
    void eat(String v) {
        System.out.println("Student je inaczej");
    }
}
