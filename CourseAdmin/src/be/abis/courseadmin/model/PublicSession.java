package be.abis.courseadmin.model;

public class PublicSession extends Session {

    private static Company organizer = new Company(1, "ABIS");

    public PublicSession(Course course, String startDate, Company location, Person instructor) {
        super(course, startDate, location, instructor);
    }

    public Company getOrganizer() {
        return organizer;
    }
}
