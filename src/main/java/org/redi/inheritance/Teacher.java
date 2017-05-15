package org.redi.inheritance;

/**
 * Created by Mustafa on 5/8/2017.
 */
public class Teacher extends Person {

    private String teachingCourse;

    public String getTeachingCourse() {
        return teachingCourse;
    }

    public void setTeachingCourse(String teachingCourse) {
        this.teachingCourse = teachingCourse;
    }
}
