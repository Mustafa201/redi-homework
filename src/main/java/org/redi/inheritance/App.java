package org.redi.inheritance;

import java.util.Date;

/**
 * Created by Mustafa on 5/8/2017.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello Inheritance");
        Student student = new Student();
        student.setFirstName("Mustafa");
        student.setLastName("Darkshly");
        System.out.println("Student name is " + student.getFirstName() + " " + student.getLastName());
        Teacher teacher = new Teacher();
        teacher.setFirstName("Angilika");
        teacher.setLastName("Honer");
        teacher.setDateOfBirth(new Date());
        System.out.println("Teacher name is " + teacher.getFirstName() + " " + teacher.getLastName());
        System.out.println("Teacher DateOfBirth is " + teacher.getDateOfBirth());

    }


}
