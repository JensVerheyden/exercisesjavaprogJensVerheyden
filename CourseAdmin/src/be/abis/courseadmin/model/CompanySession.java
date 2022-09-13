package be.abis.courseadmin.model;

public class CompanySession extends Session {

    private int numberOfParticipants;
    private Company organizer;


    public CompanySession(Course course, String startDate, Company location, Person instructor, Company organizer) {
        super(course, startDate, location, instructor);
        this.organizer = organizer;
    }

    public CompanySession(Course course, String startDate, Company location, Person instructor,Company organizer, int numberOfParticipants) {
        super(course, startDate, location, instructor);
        this.organizer = organizer;
        this.numberOfParticipants = numberOfParticipants;
    }



    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print("This session is offered to you by " + organizer.getName());
        if (numberOfParticipants!=0) {
            System.out.println(". There will be " + numberOfParticipants + " participants.");
        }
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public Company getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Company organizer) {
        this.organizer = organizer;
    }
}
