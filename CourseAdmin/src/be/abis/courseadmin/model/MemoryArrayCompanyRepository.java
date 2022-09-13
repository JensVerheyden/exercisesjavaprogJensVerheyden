package be.abis.courseadmin.model;

import be.abis.courseadmin.model.Company;
import be.abis.courseadmin.repository.CompanyRepository;

public class MemoryArrayCompanyRepository implements CompanyRepository {

    private Company[] companies = new Company[5];

    public MemoryArrayCompanyRepository() {
        companies[0] = new Company(1, "ABIS");
        companies[1] = new Company(2, "smals");
        companies[2] = new Company(3, "IBM");
        companies[3] = new Company(4, "TTL");
        companies[4] = new Company(5, "CogniTTC");
    }

    @Override
    public Company findCompany(int id) {
        Company foundCompany = null;
        for (Company c : companies) {
            if (c.getCompanyNumber() == id) {
                foundCompany=c;
            }
        };
        return foundCompany;
    }

    @Override
    public Company findCompany(String name) {
        Company foundCompany = null;
        for (Company c : companies) {
            if (c.getName().equals(name)) {
                foundCompany=c;
            }
        };
        return foundCompany;
    }

    @Override
    public void addCompany(Company c) {

    }

    @Override
    public void updateCompany(Company c) {

    }

    @Override
    public void deleteCompany(int d) {

    }
}
