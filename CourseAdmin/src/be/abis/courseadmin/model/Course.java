package be.abis.courseadmin.model;

public class Course {
    private String title;
    private int numberOfDays;
    private int pricePerDay;

    public Course(String title, int numberOfDays, int pricePerDay) {
        this.title = title;
        this.numberOfDays = numberOfDays;
        this.pricePerDay = pricePerDay;
    }

    public void printInfo() {
        System.out.println(title + " " + numberOfDays + " " + pricePerDay);
    }

    public int calculateTotalPrice() {
        return numberOfDays * pricePerDay;
    }

    public int calculateTotalPrice(int perc) {
        return (numberOfDays * pricePerDay) - (numberOfDays * pricePerDay)/100*perc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", numberOfDays=" + numberOfDays +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
