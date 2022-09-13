package be.abis.courseadmin.model;

public abstract class Session extends Service {

    private Course course;
    private String startDate;
    private Company location;
    private Person instructor;


    public Session(Course course, String startDate, Company location, Person instructor) {
        this.course = course;
        this.startDate = startDate;
        this.location = location;
        this.instructor = instructor;
    }

    public void printInfo() {
        System.out.println("The " + this.course.getTitle() + " will start on " + this.startDate + ". It will take place at " + location.getName() +
                 " Your instructor is " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Company getLocation() {
        return location;
    }

    public void setLocation(Company location) {
        this.location = location;
    }

    public Person getInstructor() {
        return instructor;
    }

    public void setInstructor(Person instructor) {
        this.instructor = instructor;
    }

    public abstract Company getOrganizer();
}
