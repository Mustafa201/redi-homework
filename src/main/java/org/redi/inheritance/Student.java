package org.redi.inheritance;

import java.util.Date;

/**
 * Created by Mustafa on 5/8/2017.
 */
public class Student extends Person {

    private String attendingCourse;

    public Student(){}

    public Student(String firstName, String lastName, Date dateOfBirth, String email, String attendingCourse){
        super(firstName, lastName, dateOfBirth, email);
        this.attendingCourse = attendingCourse;
    }

    public String getAttendingCourse() {
        return attendingCourse;
    }

    public void setAttendingCourse(String attendingCourse) {
        this.attendingCourse = attendingCourse;
    }
}
