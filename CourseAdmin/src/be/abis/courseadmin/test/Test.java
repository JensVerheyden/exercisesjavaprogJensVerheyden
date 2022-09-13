package be.abis.courseadmin.test;

import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.model.*;
import be.abis.courseadmin.model.MemoryArrayCompanyRepository;
import be.abis.courseadmin.util.StringUtils;

public class Test {

    public static void main(String[] args) {

        Course course = new Course("Java", 20, 100);

        System.out.println(course.calculateTotalPrice());
        course.printInfo();

        System.out.println("Price per day: " + course.getPricePerDay());
        System.out.println("Number of days: " + course.getNumberOfDays());

        Company company = new Company(1,"Abis");
        company.printInfo();

        Person mary =  new Person("Mary", "Jones", Gender.FEMALE, company);
        Person john = new Person("John", "Doe", Gender.MALE);

        mary.printInfo();
        john.printInfo();

        System.out.println("price: " + course.calculateTotalPrice(40));

        mary.attendCourse(course);

        mary.addHobby("test");
        mary.addHobbies("test", "toast", "test");

        Person[] people = new Person[2];
        people[0] = mary;
        people[1] = john;

        for (Person p : people) {
            p.printInfo();
        }

        PublicSession pSession = new PublicSession(course, "24/10/2022", company, mary);
        CompanySession cSession = new CompanySession(course, "24/10/2022", company, john, company, 5);
        Consultancy consultancy = new Consultancy();

        pSession.printInfo();
        cSession.printInfo();


        Service[] services = {pSession, cSession, consultancy};


        for (Service s : services) {
            System.out.println("The price for the " + s.getClass().getSimpleName() + " " + s.calculatePrice());
            if (s instanceof Session) {
                ((Session) s).printInfo();
            }
        }


        MemoryArrayCompanyRepository memoryArrayCompanyRepository = new MemoryArrayCompanyRepository();
        System.out.println(memoryArrayCompanyRepository.findCompany(1));
        System.out.println(memoryArrayCompanyRepository.findCompany(2));
        System.out.println(memoryArrayCompanyRepository.findCompany(6));

        System.out.println(memoryArrayCompanyRepository.findCompany("ABIS"));
        System.out.println(memoryArrayCompanyRepository.findCompany("smals"));
        System.out.println(memoryArrayCompanyRepository.findCompany("test"));

        Person bob = new Person("Bob", "Bab", Gender.MALE);
        bob.teachCourse(course);
        bob.attendCourse(course);

        String b = StringUtils.capitalize("test");

        System.out.println(b);

        mary.printInfo();











    }
}
