package be.abis.courseadmin.model;

import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.repository.CourseParticipant;
import be.abis.courseadmin.repository.Instructor;
import be.abis.courseadmin.util.StringUtils;

import java.util.Arrays;

public class Person implements Instructor, CourseParticipant {

    private String firstName;
    private String lastName;
    private Company company;

    private int personNumber;

    private static int counter;

    private String[] hobbies = new String[10];

    private Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
        this.personNumber = counter;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, Gender gender, Company company) {
        this(firstName, lastName, gender);
        this.company = company;
    }

    public void printInfo() {
        if (this.company != null) {
            System.out.println(firstName + " " + lastName + " works for " + company.getName() + ". "
                    + StringUtils.capitalize(gender.getPersonalPronoun())+ " has number: " + personNumber);
        } else {
            System.out.println(firstName + " " + lastName + " is not linked with a company at the moment and has number: " + personNumber);
        }
    }


    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;

    }

    public void addHobby(String hobby) {
        int count = 0;
        for (String h : hobbies) {
            if (h == null) {
                hobbies[count] = hobby;
                break;
            }
            count++;

        }
    }

    public void addHobbies(String... hobbyInsert) {
        for (String hobby : hobbyInsert) {
            addHobby(hobby);
        }

    }

    public int getPersonNumber() {
        return personNumber;
    }

    public static int getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company=" + company +
                ", personNumber=" + personNumber +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }

    @Override
    public void teachCourse(Course c) {
        System.out.println(firstName + " is teaching  a " + c.getTitle() + " course");

    }
    @Override
    public void attendCourse(Course c) {
        System.out.println(firstName + " is attending a " + c.getTitle() + " course");
    }


}
