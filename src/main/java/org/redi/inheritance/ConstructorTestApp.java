package org.redi.inheritance;

import java.util.Date;

/**
 * Created by Mustafa on 5/12/2017.
 */
public class ConstructorTestApp {

    public static void main(String... args){ //after string we can add[] or ... its the same meaning
        Person person1 = new Person();
        Person person2 = new Person("mohammed", "Ahmad", new Date(), "mahamed.ahmad@gmail.com");
        Student student1 = new Student("ali", "mohamed", new Date(), "ali.moh@gmail.com", "Java");

        person1.setFirstName("Mustafa");


        System.out.println("the name of the guy is " + person1.getFirstName());
        System.out.println("the name of student1 is " + student1.getFirstName() + " " + student1.getLastName());

    }
}
