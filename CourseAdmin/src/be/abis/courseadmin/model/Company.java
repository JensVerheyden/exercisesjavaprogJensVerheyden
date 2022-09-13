package be.abis.courseadmin.model;

public class Company {

    private String name;
    private int companyNumber;

    public Company(int companyNumber, String name) {
        this.companyNumber = companyNumber;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(int companyNumber) {
        this.companyNumber = companyNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}
