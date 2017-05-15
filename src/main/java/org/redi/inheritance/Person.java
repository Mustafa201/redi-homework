package org.redi.inheritance;

import java.util.Date;

/**
 * Created by Mustafa on 5/8/2017.
 */
public class Person {

    private String firstName;

    private String lastName;

    private String email;

    private Date dateOfBirth;

    public Person(){
        // that's mean it is a constructor
    }

    public Person(String firstName, String lastName, Date dateOfBirth, String email){ // the answer why make this for next lecture
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
